/**
 * 
 */
package com.studiohub.user.application.manager;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.studiohub.user.application.dao.model.User;
import com.studiohub.user.application.dao.repository.UserRepository;

/**
 * @author MXA86SG
 *
 */
@Component
public class UserManager extends AbstractUserManager {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public Optional<User> getUserInfo(String userId) {
		
		/*
		 * The user object should not be taken from DB unless it is not available in Cache.
		 * So it has to be taken from the Cache and if not available, it should be 
		 * retrieved from the DB.
		 */
		User user = userRepository.getUserByIdOrEmail(userId);
		
		Optional<User> optionalUser = Optional.of(user);
		
		return optionalUser;
	}

}
