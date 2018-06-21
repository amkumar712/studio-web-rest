/**
 * 
 */
package com.studiohub.user.application.mapper;

import org.springframework.stereotype.Component;

import com.studiohub.user.application.dao.model.User;
import com.studiohub.user.application.response.UserInfo;

/**
 * @author MXA86SG
 *
 */
@Component
public class UserMapper implements IBomMapper<UserInfo, User> {

	@Override
	public UserInfo mapToResponse(User user) {
		UserInfo userInfo = new UserInfo(); 
		userInfo.setUserId(user.getUserId());
		userInfo.setFirstName(user.getFirstName());
		userInfo.setLastName(user.getLastName());
		userInfo.setEmail(user.getEmail());
		userInfo.setGender(user.getGender());
		
		return userInfo;
	}

}
