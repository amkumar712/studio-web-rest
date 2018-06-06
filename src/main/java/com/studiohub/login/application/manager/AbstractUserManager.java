/**
 * 
 */
package com.studiohub.login.application.manager;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.studiohub.login.application.mapper.IBomMapper;
import com.studiohub.login.application.response.CustomUserDetails;

/**
 * @author Muthu
 *
 */
public abstract class AbstractUserManager implements IUserManager {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <MAP_DEST_TYPE> MAP_DEST_TYPE getUserByEmailorUserId(IBomMapper<MAP_DEST_TYPE, String> mapper) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public abstract CustomUserDetails getUsers(String userIdOrEmail);

}
