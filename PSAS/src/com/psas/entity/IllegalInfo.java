package com.psas.entity;

/**
 * IllegalInfo entity. @author MyEclipse Persistence Tools
 */

public class IllegalInfo implements java.io.Serializable {

	// Fields

	private Integer illegalId;
	private String idCard;
	private Integer caseId;

	// Constructors

	/** default constructor */
	public IllegalInfo() {
	}

	/** full constructor */
	public IllegalInfo(String idCard, Integer caseId) {
		this.idCard = idCard;
		this.caseId = caseId;
	}

	// Property accessors

	public Integer getIllegalId() {
		return this.illegalId;
	}

	public void setIllegalId(Integer illegalId) {
		this.illegalId = illegalId;
	}

	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public Integer getCaseId() {
		return this.caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

}