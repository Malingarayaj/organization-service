package com.organization.organizationservice.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.organizationservice.dto.UserDTO;
import com.organization.organizationservice.entity.Branch;
import com.organization.organizationservice.entity.BranchManager;
import com.organization.organizationservice.entity.BranchOperator;
import com.organization.organizationservice.entity.Organization;
import com.organization.organizationservice.entity.OrganizationAdmin;
import com.organization.organizationservice.entity.User;
import com.organization.organizationservice.execption.BranchNotFoundEception;
import com.organization.organizationservice.execption.organizationNotFound;
import com.organization.organizationservice.repository.BranchRepository;
import com.organization.organizationservice.repository.OrganizationRepo;
import com.organization.organizationservice.repository.UserReposiotry;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private OrganizationRepo orgRepo;

	@Autowired
	private UserReposiotry userRepo;
	
	@Autowired
	private BranchRepository branchRepo;

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

}
