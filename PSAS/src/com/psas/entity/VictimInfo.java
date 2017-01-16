package com.psas.entity;

/**
 * VictimInfo entity. @author MyEclipse Persistence Tools
 */

public class VictimInfo implements java.io.Serializable {

	// Fields

	private Integer victimId;
	private String idCard;
	private Integer caseId;

	// Constructors

	/** default constructor */
	public VictimInfo() {
	}

	/** full constructor */
	public VictimInfo(String idCard, Integer caseId) {
		this.idCard = idCard;
		this.caseId = caseId;
	}

	// Property accessors

	public Integer getVictimId() {
		return this.victimId;
	}

	public void setVictimId(Integer victimId) {
		this.victimId = victimId;
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