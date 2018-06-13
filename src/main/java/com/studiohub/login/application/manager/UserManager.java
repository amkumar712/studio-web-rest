/**
 * 
 */
package com.studiohub.login.application.manager;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.studiohub.login.application.model.User;
import com.studiohub.login.application.model.UserAuthenticate;
import com.studiohub.login.application.repository.UserRepository;
import com.studiohub.login.application.response.MessageInfo;
import com.studiohub.login.application.response.UserInfo;

/**
 * @author Muthu
 *
 */
@Component
public class UserManager extends AbstractUserManager implements UserDetailsService {

	@Autowired
	UserRepository userRepository;
	

	@Override
	public UserInfo getUserInfo(String userId) {
		
		
		UserInfo info = new UserInfo();
		info.setEmail("testEmail@gmail.com");
		info.setUserId(userId);
		
		MessageInfo msg = new MessageInfo();
		msg.setMessage("User Identified");
		msg.setMessageCode("1");
		
		info.setMsg(msg);
		
		return info;
	}

	
	/** 
	 * This method is used for the Login purpose. Once the user is retrieved from the 
	 * Database, it has to be cached and the next time User should be invoked from the cache.
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<User> userOptional = userRepository.findById(username);
		
		userOptional.orElseThrow(() -> new UsernameNotFoundException("User is not available"));
		
		return userOptional.map(UserAuthenticate::new).get();
	}

}
