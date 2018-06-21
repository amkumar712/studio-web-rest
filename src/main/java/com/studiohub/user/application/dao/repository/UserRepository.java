/**
 * 
 */
package com.studiohub.user.application.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.studiohub.user.application.dao.model.User;

/**
 * @author MXA86SG
 *
 */
public interface UserRepository extends JpaRepository<User, String> {
	
	@Query("select u from User u where u.userId=:idOrEmail or u.email=:idOrEmail")
	public User getUserByIdOrEmail(@Param("idOrEmail")String idOrEmail);

}
