/**
 * 
 */
package com.studiohub.login.application.manager;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.studiohub.login.application.mapper.IBomMapper;

/**
 * @author Muthu
 *
 */
public interface IUserManager extends UserDetailsService {
	
	public <MAP_DEST_TYPE> MAP_DEST_TYPE getUserByEmailorUserId(IBomMapper<MAP_DEST_TYPE, String> mapper);

}
