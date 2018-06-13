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
import com.studiohub.login.application.response.UserInfo;
import com.studiohub.login.application.service.CustomUserDetailService;

/**
 * @author Muthu
 *
 */

@RestController
public class LoginController {
	
	@Autowired
	UserManager userManager;
	
	@PostMapping("/login")
	public UserInfo login() {
		
		UserInfo userInfo = userManager.getUserInfo("amkumar712");
		
		System.out.println(userInfo.getUserId());
		System.out.println(userInfo.getEmail());
		
		return userInfo;
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
