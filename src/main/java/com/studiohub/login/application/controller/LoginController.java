/**
 * 
 */
package com.studiohub.login.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.studiohub.login.application.manager.UserManager;

/**
 * @author Muthu
 *
 */

@Controller
public class LoginController {
	
	@Autowired
	UserManager userManager;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/login")
	public String login() {
		
		return "user/login";
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
