/**
 * 
 */
package com.studiohub.login.application.manager;

import com.studiohub.login.application.mapper.IBomMapper;
import com.studiohub.login.application.response.UserInfo;

/**
 * @author Muthu
 *
 */
public abstract class AbstractUserManager implements IUserManager {

	@Override
	public <MAP_DEST_TYPE> MAP_DEST_TYPE getUserByEmailorUserId(IBomMapper<MAP_DEST_TYPE, String> mapper) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public abstract UserInfo getUserInfo(String userId);

}
