/**
 * 
 */
package com.studiohub.user.application.manager;

import com.studiohub.user.application.dao.model.User;
import com.studiohub.user.application.mapper.IBomMapper;

/**
 * @author MXA86SG
 *
 */
public interface IUserManager {
	
	public <DEST_TYPE> DEST_TYPE getUserByIdOrEmail(IBomMapper<DEST_TYPE, User> mapper, String userid);

}
