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
	private AcceptCase acceptCase;
	private CitizenInfo citizenInfo;

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

	public SuspectInfo(Integer suspectId, Timestamp suspectInttime, Timestamp suspectOuttime, Integer handleCondition,
			String idCard, Integer caseId, AcceptCase acceptCase, CitizenInfo citizenInfo) {
		super();
		this.suspectId = suspectId;
		this.suspectInttime = suspectInttime;
		this.suspectOuttime = suspectOuttime;
		this.handleCondition = handleCondition;
		this.idCard = idCard;
		this.caseId = caseId;
		this.acceptCase = acceptCase;
		this.citizenInfo = citizenInfo;
	}

	public AcceptCase getAcceptCase() {
		return acceptCase;
	}

	public void setAcceptCase(AcceptCase acceptCase) {
		this.acceptCase = acceptCase;
	}

	public CitizenInfo getCitizenInfo() {
		return citizenInfo;
	}

	public void setCitizenInfo(CitizenInfo citizenInfo) {
		this.citizenInfo = citizenInfo;
	}

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

	@Override
	public String toString() {
		return "SuspectInfo [suspectId=" + suspectId + ", suspectInttime=" + suspectInttime + ", suspectOuttime="
				+ suspectOuttime + ", handleCondition=" + handleCondition + ", idCard=" + idCard + ", caseId=" + caseId
				+ ", acceptCase=" + acceptCase + ", citizenInfo=" + citizenInfo + "]";
	}

}