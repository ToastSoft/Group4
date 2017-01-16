package com.psas.entity;

/**
 * UserJurisdictionInfo entity. @author MyEclipse Persistence Tools
 */

public class UserJurisdictionInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer userId;
	private Integer jurisdictionId;

	// Constructors

	/** default constructor */
	public UserJurisdictionInfo() {
	}

	/** full constructor */
	public UserJurisdictionInfo(Integer userId, Integer jurisdictionId) {
		this.userId = userId;
		this.jurisdictionId = jurisdictionId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getJurisdictionId() {
		return this.jurisdictionId;
	}

	public void setJurisdictionId(Integer jurisdictionId) {
		this.jurisdictionId = jurisdictionId;
	}

}