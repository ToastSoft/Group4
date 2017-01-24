package com.psas.entity;

/**
 * JurisdictionInfo entity. @author MyEclipse Persistence Tools
 */

public class JurisdictionInfo implements java.io.Serializable {

	// Fields

	private Integer jurisdictionId;
	private String jurisdictionName;

	// Constructors

	/** default constructor */
	public JurisdictionInfo() {
	}

	/** full constructor */
	public JurisdictionInfo(String jurisdictionName) {
		this.jurisdictionName = jurisdictionName;
	}

	// Property accessors

	public Integer getJurisdictionId() {
		return this.jurisdictionId;
	}

	public void setJurisdictionId(Integer jurisdictionId) {
		this.jurisdictionId = jurisdictionId;
	}

	public String getJurisdictionName() {
		return this.jurisdictionName;
	}

	public void setJurisdictionName(String jurisdictionName) {
		this.jurisdictionName = jurisdictionName;
	}

	@Override
	public String toString() {
		return "JurisdictionInfo [jurisdictionId=" + jurisdictionId + ", jurisdictionName=" + jurisdictionName + "]";
	}

}