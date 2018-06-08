/**
 * 
 */
package com.studiohub.login.application.model;

import java.util.Collection;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author Muthu
 * 
 * This class is being used by UserDetailsServiceProvider to provide authentication.
 *
 */
public class UserAuthenticate implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	private Set<Role> roles;
	
	
	
	public UserAuthenticate(User user) {
		this.username = user.getUserId();
		this.password = user.getUserLogin().getPasswordHash();
		this.roles = user.getRoles();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getUsername() {
		return this.username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
