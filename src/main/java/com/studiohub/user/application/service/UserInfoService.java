/**
 * 
 */
package com.studiohub.user.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.studiohub.user.application.dao.model.User;
import com.studiohub.user.application.manager.IUserManager;
import com.studiohub.user.application.mapper.IBomMapper;
import com.studiohub.user.application.response.UserInfo;

/**
 * @author MXA86SG
 *
 */
@Component
public class UserInfoService {

	@Autowired
	IUserManager userManager;
	
	@Autowired
	IBomMapper<UserInfo, User> mapper;
	
	public UserInfo retrieveUserInfo(String userIdOrEmail) {
		
		UserInfo userInfo = userManager.getUserByIdOrEmail(mapper , userIdOrEmail);
		
		return userInfo;
	}
	
}
