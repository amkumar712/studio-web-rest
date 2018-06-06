/**
 * 
 */
package com.studiohub.login.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studiohub.login.application.model.User;

/**
 * @author Muthu
 *
 */
public interface UserRepository extends JpaRepository<User, String> {

}
