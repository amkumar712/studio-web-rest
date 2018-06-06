/**
 * 
 */
package com.studiohub.login.application.response;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.StringUtils;

import com.studiohub.login.application.model.User;

/**
 * @author Muthu
 *
 */
public class CustomUserDetails extends User implements UserDetails {
	
	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String lastName;
	private String middleName;
	private String fullName;
	private String gender;
	private String email;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return super.getUserLogin().getPasswordHash();
	}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return super.getUserId();
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}
	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		
		this.fullName = firstName;
		
		if(!StringUtils.isEmpty(middleName)) {
			this.fullName = this.fullName + " " + middleName;
		}
		
		if(!StringUtils.isEmpty(lastName)) {
			this.fullName = this.fullName + " " + lastName;
		}
		
		this.fullName = fullName;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		
		if("M".equals(gender)) {
			gender = "Male";
		}
		if("F".equals(gender)) {
			gender = "Female";
		}
		
		if(StringUtils.isEmpty(gender)) {
			gender = "Unknown";
		}
		
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}
