package com.organization.organizationservice.service;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.organization.organizationservice.dto.UserDTO;
import com.organization.organizationservice.entity.Branch;
import com.organization.organizationservice.entity.BranchManager;
import com.organization.organizationservice.entity.BranchOperator;
import com.organization.organizationservice.entity.Organization;
import com.organization.organizationservice.entity.OrganizationAdmin;
import com.organization.organizationservice.entity.User;
import com.organization.organizationservice.entity.Users;
import com.organization.organizationservice.execption.BranchNotFoundEception;
import com.organization.organizationservice.execption.RecordAlreadyPresentException;
import com.organization.organizationservice.execption.ResourceNotFoundException;
import com.organization.organizationservice.execption.organizationNotFound;
import com.organization.organizationservice.repository.BranchRepository;
import com.organization.organizationservice.repository.OrganizationRepo;
import com.organization.organizationservice.repository.UserReposiotry;
import com.organization.organizationservice.repository.UsersRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private OrganizationRepo orgRepo;

	@Autowired
	private UserReposiotry userRepo;
	
	@Autowired
	private BranchRepository branchRepo;
	
	@Autowired
	private UsersRepository usersRepository;
	

	@Override
	public UserDTO createOgAdmin(String orgId, UserDTO request) throws organizationNotFound {
		Optional<Organization> response = orgRepo.findByOrgId(orgId);
		if (!response.isPresent()) {
			throw new organizationNotFound();
		}
		OrganizationAdmin userAdmin = new OrganizationAdmin();
		userAdmin.setUserName(request.getUserName());
		
		userAdmin.setPassword(request.getPassword());
		userAdmin.setFirstName(request.getFirstName());
		userAdmin.setLastName(request.getLastName());
		userAdmin.setCreated(new Timestamp(System.currentTimeMillis()));
		userAdmin.setLastModifiedTime(new Timestamp(System.currentTimeMillis()));
		userAdmin.setBloodGroup(request.getBlood());
		userAdmin.setGender(request.getGender());
		Organization org=response.get();
		userAdmin.setOrganization(org);
		User usersaved = userRepo.save(userAdmin);
		BeanUtils.copyProperties(usersaved, request);

		return request;
	}

	@Override
	public UserDTO createBranchManager(String orgId,String barnchId, UserDTO request) throws organizationNotFound, BranchNotFoundEception {
		Optional<Organization> response = orgRepo.findByOrgId(orgId);
		if (!response.isPresent()) {
			throw new organizationNotFound();
		}
		Optional<Branch> branchIsExist = branchRepo.findByBranchId(barnchId);
		if (!branchIsExist.isPresent()) {
			throw new BranchNotFoundEception("Branch is not found given id" + barnchId);
		}
		BranchManager entity=new BranchManager();
		entity.setUserName(request.getUserName());
		entity.setFirstName(request.getFirstName());
		entity.setLastName(request.getLastName());
		entity.setGender(request.getGender());
		entity.setCreated(new Timestamp(System.currentTimeMillis()));
		entity.setPassword(request.getPassword());
		entity.setLastModifiedTime(new Timestamp(System.currentTimeMillis()));
		Organization org=response.get();
		entity.setOrg(org);
		Branch branch=branchIsExist.get();
		entity.setBranch(branch);
		BranchManager users=userRepo.save(entity);
		BeanUtils.copyProperties(users, request);
//		branchRepo.save(entity);
		return request;
	}

	@Override
	public UserDTO createBranchOperator(String orgId, String branchId, UserDTO request)
			throws organizationNotFound, BranchNotFoundEception {
		Optional<Organization> response = orgRepo.findByOrgId(orgId);
		if (!response.isPresent()) {
			throw new organizationNotFound();
		}
		Optional<Branch> branchIsExist = branchRepo.findByBranchId(branchId);
		if (!branchIsExist.isPresent()) {
			throw new BranchNotFoundEception("Branch is not found given id" + branchId);
		}		
		BranchOperator entity=new BranchOperator();
		entity.setUserName(request.getUserName());
		entity.setFirstName(request.getFirstName());
		entity.setLastName(request.getLastName());
		entity.setGender(request.getGender());
		entity.setCreated(new Timestamp(System.currentTimeMillis()));
		entity.setPassword(request.getPassword());
		entity.setLastModifiedTime(new Timestamp(System.currentTimeMillis()));
		Organization org=response.get();
		entity.setOrg(org);
		Branch existBranch=branchIsExist.get();
		entity.setBranch(existBranch);
		BranchOperator exisData=userRepo.save(entity);
		BeanUtils.copyProperties(exisData, request);

		return request;
	}

	@Override
	public List<UserDTO> getAllBranchOperator(String orgId, String branchId)
			throws organizationNotFound, BranchNotFoundEception {
		Optional<Organization> response = orgRepo.findByOrgId(orgId);
		if (!response.isPresent()) {
			throw new organizationNotFound();
		}
		Optional<Branch> branchIsExist = branchRepo.findByBranchId(branchId);
		if (!branchIsExist.isPresent()) {
			throw new BranchNotFoundEception("Branch is not found given id" + branchId);
		}	
		List<UserDTO> dtos=new ArrayList<>();
		List<User> users=userRepo.findAll();
		for(User usr:users) {
			UserDTO dto=new UserDTO();
			dto.setUserName(usr.getUserName());
			dto.setFirstName(usr.getFirstName());
			dto.setLastName(usr.getLastName());
			dto.setGender(usr.getGender());
			dto.setPassword(usr.getPassword());
			dtos.add(dto);

		}
//		UserDTO dto=new UserDTO();
//
//		for(int i=0;i<users.size();i++) {
//			User entity=users.get(i);
//
//			BeanUtils.copyProperties(entity, dto);
//			dtos.add(dto);
//		}
//		userRepo.findAll().forEach(s ->{
//			dtos.add(new UserDTO(s.getUserId(), s.getUserName(), s.getFirstName(), s.getLastName(), s.getGender(), s.getPassword()));
//			
//		});
		return dtos;
	}

	@Override
	public ResponseEntity<?> addUser(Users user) {
		Optional<Users> userPresent=usersRepository.findById(user.getUserId());
		try {
		if(!userPresent.isPresent()) {
			usersRepository.save(user);
			return new ResponseEntity<Users>(user,HttpStatus.OK);
		}else 
			throw new RecordAlreadyPresentException("User with Id: " + user.getUserId() + " already exists!!");
		}catch (RecordAlreadyPresentException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		}

	@Override
	public Iterable<Users> displayAllUsers() {
		return usersRepository.findAll();
	}

	@Override
	public ResponseEntity<?> searchUsersById(BigInteger searchUserId) {
		Optional<Users> userIsPresent=usersRepository.findById(searchUserId);
		try {
			if(userIsPresent.isPresent()) {
				Users findUser=userIsPresent.get();
				return new ResponseEntity<Users>(findUser,HttpStatus.OK);
			}else
				throw new ResourceNotFoundException("", "", 0);
		} catch (ResourceNotFoundException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);

		}
		
	}

	@Override
	public Object updateUser(Users user, BigInteger uId) {
		Users oldUser = null;
		Optional<Users> findUser=usersRepository.findById(uId);
		if(findUser.isPresent()) {
			 oldUser=findUser.get();
			 oldUser.setUserEmail(user.getUserEmail());
			 oldUser.setUserName(user.getUserName());
			 oldUser.setUserPhone(user.getUserPhone());
			 oldUser=usersRepository.save(oldUser);
			 
			
		}
		return oldUser;
	}

	@Override
	public void deleteUser(BigInteger userId) {
		Optional<Users> findUser=usersRepository.findById(userId);
		if(findUser.isPresent()) {
			usersRepository.deleteById(findUser.get().getUserId());
		}
		
	}
		
	

}
