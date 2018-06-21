/**
 * 
 */
package com.studiohub.user.application.mapper;

/**
 * @author MXA86SG
 *
 */
public interface IBomMapper<RET_TYPE, SRC_TYPE> {

	public RET_TYPE mapToResponse(SRC_TYPE srcType);

}
