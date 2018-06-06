/**
 * 
 */
package com.studiohub.login.application.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Muthu
 *
 */
@Entity
@Table(name="role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="role_id")
	private String roleId;
	
	@Column(name="role_desc")
	private String roleDesc;
	
	@Column(name="active")
	private Integer active;
	
	@Column(name="begin_dt")
	private Date beginDt;
	
	@Column(name="end_dt")
	private Date endDt;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="created_dt")
	private Timestamp createdDt;
	
	@Column(name="updated_by")
	private String updatedBy;
	
	@Column(name="last_upd_dt")
	private Timestamp lastUpdDt;

	/**
	 * @return the roleId
	 */
	public String getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return the roleDesc
	 */
	public String getRoleDesc() {
		return roleDesc;
	}

	/**
	 * @param roleDesc the roleDesc to set
	 */
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	/**
	 * @return the active
	 */
	public Integer getActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(Integer active) {
		this.active = active;
	}

	/**
	 * @return the beginDt
	 */
	public Date getBeginDt() {
		return beginDt;
	}

	/**
	 * @param beginDt the beginDt to set
	 */
	public void setBeginDt(Date beginDt) {
		this.beginDt = beginDt;
	}

	/**
	 * @return the endDt
	 */
	public Date getEndDt() {
		return endDt;
	}

	/**
	 * @param endDt the endDt to set
	 */
	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the createdDt
	 */
	public Timestamp getCreatedDt() {
		return createdDt;
	}

	/**
	 * @param createdDt the createdDt to set
	 */
	public void setCreatedDt(Timestamp createdDt) {
		this.createdDt = createdDt;
	}

	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * @return the lastUpdDt
	 */
	public Timestamp getLastUpdDt() {
		return lastUpdDt;
	}

	/**
	 * @param lastUpdDt the lastUpdDt to set
	 */
	public void setLastUpdDt(Timestamp lastUpdDt) {
		this.lastUpdDt = lastUpdDt;
	}
	
}
