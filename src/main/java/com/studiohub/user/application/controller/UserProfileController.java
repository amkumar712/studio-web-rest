/**
 * 
 */
package com.studiohub.user.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.studiohub.user.application.response.UserInfo;
import com.studiohub.user.application.service.UserInfoService;

/**
 * @author MXA86SG
 *
 */
@Controller
public class UserProfileController {

	@Autowired
	UserInfoService userInfoService;
	
	@RequestMapping(value = "/user/home", method=RequestMethod.GET)
	public String userProfile(Authentication authentication, Model model) {
		
		String username = authentication.getName();
		
		UserInfo userInfo = userInfoService.retrieveUserInfo(username);
		model.addAttribute("user", userInfo);
		
		return "user/home";
	}
}
