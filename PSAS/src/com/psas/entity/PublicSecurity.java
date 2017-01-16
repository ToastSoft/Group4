package com.psas.entity;

/**
 * PublicSecurity entity. @author MyEclipse Persistence Tools
 */

public class PublicSecurity implements java.io.Serializable {

	// Fields

	private Integer psId;
	private String psName;
	private String psTelephone;
	private String psAddress;
	private String psLeaderName;

	// Constructors

	/** default constructor */
	public PublicSecurity() {
	}

	/** full constructor */
	public PublicSecurity(String psName, String psTelephone, String psAddress, String psLeaderName) {
		this.psName = psName;
		this.psTelephone = psTelephone;
		this.psAddress = psAddress;
		this.psLeaderName = psLeaderName;
	}

	// Property accessors

	public Integer getPsId() {
		return this.psId;
	}

	public void setPsId(Integer psId) {
		this.psId = psId;
	}

	public String getPsName() {
		return this.psName;
	}

	public void setPsName(String psName) {
		this.psName = psName;
	}

	public String getPsTelephone() {
		return this.psTelephone;
	}

	public void setPsTelephone(String psTelephone) {
		this.psTelephone = psTelephone;
	}

	public String getPsAddress() {
		return this.psAddress;
	}

	public void setPsAddress(String psAddress) {
		this.psAddress = psAddress;
	}

	public String getPsLeaderName() {
		return this.psLeaderName;
	}

	public void setPsLeaderName(String psLeaderName) {
		this.psLeaderName = psLeaderName;
	}

}