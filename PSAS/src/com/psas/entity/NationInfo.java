package com.psas.entity;

/**
 * NationInfo entity. @author MyEclipse Persistence Tools
 */

public class NationInfo implements java.io.Serializable {

	// Fields

	private Integer nationId;
	private String nationName;

	// Constructors

	/** default constructor */
	public NationInfo() {
	}

	/** full constructor */
	public NationInfo(String nationName) {
		this.nationName = nationName;
	}

	// Property accessors

	public Integer getNationId() {
		return this.nationId;
	}

	public void setNationId(Integer nationId) {
		this.nationId = nationId;
	}

	public String getNationName() {
		return this.nationName;
	}

	public void setNationName(String nationName) {
		this.nationName = nationName;
	}

}