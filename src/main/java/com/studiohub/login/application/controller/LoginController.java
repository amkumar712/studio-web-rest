/**
 * 
 */
package com.studiohub.login.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studiohub.login.application.manager.IUserManager;
import com.studiohub.login.application.manager.UserManager;
import com.studiohub.login.application.model.User;
import com.studiohub.login.application.model.UserAuthenticate;
import com.studiohub.login.application.service.CustomUserDetailService;

/**
 * @author Muthu
 *
 */

@RestController
public class LoginController {
	
	@Autowired
	CustomUserDetailService service;
	
	@Autowired
	UserManager userManager;
	
	@GetMapping("/test")
	public void login() {
		System.out.println("Entering into Login Method");
		User user = service.getUserByUserId("amkumar712");
		System.out.println(user.getFirstName());
		System.out.println("After service call");
		
		UserDetails userAuth = userManager.loadUserByUsername("amkumar712");
		
		System.out.println(userAuth.getUsername());
		System.out.println(userAuth.getPassword());
		
		// login -- no need of authentication
		
//		UserDetails userDetails = new UserDetails();
//		userDetails.setEmail(user.getEmail());
//		userDetails.setFirstName(user.getFirstName());
//		userDetails.setLastName(user.getLastName());
//		userDetails.setGender(user.getGender());
//		userDetails.setMiddleName(user.getMiddleName());
		
//		return userDetails;
	}
	
	@PostMapping("/authenticate")
	public String authenticate() {
		//System.out.println("");
		return "It worked!!!";
	}
	
	
	// need authentication
	public void logout() {
		
	}

}
