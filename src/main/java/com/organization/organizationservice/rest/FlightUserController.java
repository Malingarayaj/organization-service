package com.organization.organizationservice.rest;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organization.organizationservice.entity.Users;
import com.organization.organizationservice.execption.RecordAlreadyPresentException;
import com.organization.organizationservice.execption.ResourceNotFoundException;
import com.organization.organizationservice.service.UserService;

@RestController
@RequestMapping("/user")
public class FlightUserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/createUser")
	@ExceptionHandler(RecordAlreadyPresentException.class)
	public void addUser(@RequestBody Users user) {
		userService.addUser(user);
		
	}
	@GetMapping("/allUsers")
	public Iterable<Users> displayAllUsers(){
		return userService.displayAllUsers();
	}
	
	@GetMapping("/searchUser/{id}")
	public ResponseEntity<?> searchUsersById(@PathVariable("id") BigInteger searchUserId){
		return userService.searchUsersById(searchUserId);
	}
	@PutMapping("/updateUser/{id}")
	@ExceptionHandler(ResourceNotFoundException.class)
	public Object updateUser(@RequestBody Users user,@PathVariable("id") BigInteger uId) {
         return userService.updateUser(user,uId);
	}
	@DeleteMapping("/deleteUser/{id}")
	@ExceptionHandler(ResourceNotFoundException.class)
	public void deleteBookingByID(@PathVariable("id") BigInteger userId) {

		userService.deleteUser(userId);
	}
}
