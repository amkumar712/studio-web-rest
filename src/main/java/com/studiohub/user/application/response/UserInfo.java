/**
 * 
 */
package com.studiohub.user.application.response;

import org.springframework.util.StringUtils;

/**
 * @author MXA86SG
 *
 */
public class UserInfo {
	
	private String userId;
	private String firstName;
	private String lastName;
	private String middleName;
	private String fullName;
	private String gender;
	private String email;

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
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
		
		if(!StringUtils.isEmpty(middleName)) {
			fullName = firstName + " " + middleName + " " + lastName;
		} else {
			fullName = firstName + " " + lastName;
		}
		
		return fullName;
	}
	
	/**
	 * @return the gender
	 */
	public String getGender() {
		
		if(!StringUtils.isEmpty(gender) && gender.equalsIgnoreCase("M")) {
			gender = "Male";
		} else if(!StringUtils.isEmpty(gender) && gender.equalsIgnoreCase("F")) {
			gender = "Female";
		} else {
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
