package com.psas.entity;

import java.sql.Timestamp;

/**
 * SuspectInfo entity. @author MyEclipse Persistence Tools
 */

public class SuspectInfo implements java.io.Serializable {

	// Fields

	private Integer suspectId;
	private Timestamp suspectInttime;
	private Timestamp suspectOuttime;
	private Integer handleCondition;
	private String idCard;
	private Integer caseId;

	// Constructors

	/** default constructor */
	public SuspectInfo() {
	}

	/** minimal constructor */
	public SuspectInfo(Integer handleCondition, String idCard, Integer caseId) {
		this.handleCondition = handleCondition;
		this.idCard = idCard;
		this.caseId = caseId;
	}

	/** full constructor */
	public SuspectInfo(Timestamp suspectInttime, Timestamp suspectOuttime, Integer handleCondition, String idCard, Integer caseId) {
		this.suspectInttime = suspectInttime;
		this.suspectOuttime = suspectOuttime;
		this.handleCondition = handleCondition;
		this.idCard = idCard;
		this.caseId = caseId;
	}

	// Property accessors

	public Integer getSuspectId() {
		return this.suspectId;
	}

	public void setSuspectId(Integer suspectId) {
		this.suspectId = suspectId;
	}

	public Timestamp getSuspectInttime() {
		return this.suspectInttime;
	}

	public void setSuspectInttime(Timestamp suspectInttime) {
		this.suspectInttime = suspectInttime;
	}

	public Timestamp getSuspectOuttime() {
		return this.suspectOuttime;
	}

	public void setSuspectOuttime(Timestamp suspectOuttime) {
		this.suspectOuttime = suspectOuttime;
	}

	public Integer getHandleCondition() {
		return this.handleCondition;
	}

	public void setHandleCondition(Integer handleCondition) {
		this.handleCondition = handleCondition;
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