/**
 * 
 */
package com.studiohub.login.application.mapper;

/**
 * @author Muthu
 *
 */
public interface IBomMapper<RET_TYPE, SRC_TYPE> {
	
	public RET_TYPE mapToResponse(SRC_TYPE srcType);

}
