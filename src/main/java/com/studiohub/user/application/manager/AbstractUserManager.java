/**
 * 
 */
package com.studiohub.user.application.manager;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.studiohub.user.application.dao.model.User;
import com.studiohub.user.application.dao.model.UserAuthenticate;
import com.studiohub.user.application.mapper.IBomMapper;

/**
 * @author MXA86SG
 *
 */
public abstract class AbstractUserManager implements IUserManager, UserDetailsService {
	
	/** 
	 * This method is used for the Login purpose. Once the user is retrieved from the 
	 * Database, it has to be cached and the next time User should be invoked from the cache.
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Optional<User> optionalUser = getUserInfo(username);
		
		optionalUser.orElseThrow(() -> new UsernameNotFoundException("User is not available"));
		
		return optionalUser.map(UserAuthenticate::new).get();
	}

	@Override
	public <DEST_TYPE> DEST_TYPE getUserByIdOrEmail(IBomMapper<DEST_TYPE, User> mapper, String userId) {
		
		
		Optional<User> optionalUser = getUserInfo(userId);
		
		optionalUser.orElseThrow(() -> new UsernameNotFoundException("User is not available"));
		
		User user = optionalUser.get();
		
		return mapper.mapToResponse(user);
	}

	public abstract Optional<User> getUserInfo(String userId);
	
}
