/**
 * 
 */
package com.studiohub.login.application.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studiohub.login.application.model.User;
import com.studiohub.login.application.repository.UserRepository;

/**
 * @author Muthu
 *
 */
@Service
public class CustomUserDetailService {
	
	@Autowired
	UserRepository userRepository;
	
	public User getUserByUserId(String userId){
		
//		Optional<User> optionalUser = Optional.ofNullable(userRepository.getOne(userId));
		
//		optionalUser.orElseThrow(() -> new UsernameNotFoundException(""));
		
		User user = userRepository.getOne(userId);
		
		return user;
	}

}
