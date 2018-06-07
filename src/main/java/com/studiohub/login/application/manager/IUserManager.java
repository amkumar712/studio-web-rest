/**
 * 
 */
package com.studiohub.login.application.manager;

import com.studiohub.login.application.mapper.IBomMapper;

/**
 * @author Muthu
 *
 */
public interface IUserManager {
	
	public <MAP_DEST_TYPE> MAP_DEST_TYPE getUserByEmailorUserId(IBomMapper<MAP_DEST_TYPE, String> mapper);

}
