package com.psas.entity;

/**
 * PolicemanInfo entity. @author MyEclipse Persistence Tools
 */

public class PolicemanInfo implements java.io.Serializable {

	// Fields

	private Integer policemanId;
	private String policemanName;
	private String policemanGender;
	private Integer policemanAge;
	private String policemanAddress;
	private String policemanType;
	private Integer psId;

	// Constructors

	/** default constructor */
	public PolicemanInfo() {
	}

	/** full constructor */
	public PolicemanInfo(String policemanName, String policemanGender, Integer policemanAge, String policemanAddress, String policemanType, Integer psId) {
		this.policemanName = policemanName;
		this.policemanGender = policemanGender;
		this.policemanAge = policemanAge;
		this.policemanAddress = policemanAddress;
		this.policemanType = policemanType;
		this.psId = psId;
	}

	// Property accessors

	public Integer getPolicemanId() {
		return this.policemanId;
	}

	public void setPolicemanId(Integer policemanId) {
		this.policemanId = policemanId;
	}

	public String getPolicemanName() {
		return this.policemanName;
	}

	public void setPolicemanName(String policemanName) {
		this.policemanName = policemanName;
	}

	public String getPolicemanGender() {
		return this.policemanGender;
	}

	public void setPolicemanGender(String policemanGender) {
		this.policemanGender = policemanGender;
	}

	public Integer getPolicemanAge() {
		return this.policemanAge;
	}

	public void setPolicemanAge(Integer policemanAge) {
		this.policemanAge = policemanAge;
	}

	public String getPolicemanAddress() {
		return this.policemanAddress;
	}

	public void setPolicemanAddress(String policemanAddress) {
		this.policemanAddress = policemanAddress;
	}

	public String getPolicemanType() {
		return this.policemanType;
	}

	public void setPolicemanType(String policemanType) {
		this.policemanType = policemanType;
	}

	public Integer getPsId() {
		return this.psId;
	}

	public void setPsId(Integer psId) {
		this.psId = psId;
	}

	@Override
	public String toString() {
		return "PolicemanInfo [policemanId=" + policemanId + ", policemanName=" + policemanName + ", policemanGender="
				+ policemanGender + ", policemanAge=" + policemanAge + ", policemanAddress=" + policemanAddress
				+ ", policemanType=" + policemanType + ", psId=" + psId + "]";
	}

}