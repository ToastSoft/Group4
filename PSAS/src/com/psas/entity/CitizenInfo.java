package com.psas.entity;

import java.util.Date;

/**
 * CitizenInfo entity. @author MyEclipse Persistence Tools
 */

public class CitizenInfo implements java.io.Serializable {

	// Fields

	private String idCard;
	private String idName;
	private Integer idAge;
	private String idGender;
	private Date idBirthday;
	private String idAddress;
	private String idProfessional;
	private String idCompany;
	private Integer nationId;
	private NationInfo nation;

	// Constructors

	/** default constructor */
	public CitizenInfo() {
	}

	/** full constructor */
	public CitizenInfo(String idCard, String idName, Integer idAge, String idGender, Date idBirthday, String idAddress, String idProfessional, String idCompany, Integer nationId) {
		this.idCard = idCard;
		this.idName = idName;
		this.idAge = idAge;
		this.idGender = idGender;
		this.idBirthday = idBirthday;
		this.idAddress = idAddress;
		this.idProfessional = idProfessional;
		this.idCompany = idCompany;
		this.nationId = nationId;
	}

	// Property accessors

	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getIdName() {
		return this.idName;
	}

	public void setIdName(String idName) {
		this.idName = idName;
	}

	public Integer getIdAge() {
		return this.idAge;
	}

	public void setIdAge(Integer idAge) {
		this.idAge = idAge;
	}

	public String getIdGender() {
		return this.idGender;
	}

	public void setIdGender(String idGender) {
		this.idGender = idGender;
	}

	public Date getIdBirthday() {
		return this.idBirthday;
	}

	public void setIdBirthday(Date idBirthday) {
		this.idBirthday = idBirthday;
	}

	public String getIdAddress() {
		return this.idAddress;
	}

	public void setIdAddress(String idAddress) {
		this.idAddress = idAddress;
	}

	public String getIdProfessional() {
		return this.idProfessional;
	}

	public void setIdProfessional(String idProfessional) {
		this.idProfessional = idProfessional;
	}

	public String getIdCompany() {
		return this.idCompany;
	}

	public void setIdCompany(String idCompany) {
		this.idCompany = idCompany;
	}

	public Integer getNationId() {
		return this.nationId;
	}

	public void setNationId(Integer nationId) {
		this.nationId = nationId;
	}

	public NationInfo getNation() {
		return nation;
	}

	public void setNation(NationInfo nation) {
		this.nation = nation;
	}

	@Override
	public String toString() {
		return "CitizenInfo [idCard=" + idCard + ", idName=" + idName + ", idAge=" + idAge + ", idGender=" + idGender
				+ ", idBirthday=" + idBirthday + ", idAddress=" + idAddress + ", idProfessional=" + idProfessional
				+ ", idCompany=" + idCompany + ", nationId=" + nationId + ", nation=" + nation + "]";
	}

}