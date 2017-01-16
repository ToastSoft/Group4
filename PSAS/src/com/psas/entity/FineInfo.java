package com.psas.entity;

import java.sql.Timestamp;

/**
 * FineInfo entity. @author MyEclipse Persistence Tools
 */

public class FineInfo implements java.io.Serializable {

	// Fields

	private Integer fineId;
	private Timestamp fineTime;
	private Integer fineType;
	private String fineCharacter;
	private String fineReason;
	private String idCard;
	private Integer policemanId;
	private Integer caseId;

	// Constructors

	/** default constructor */
	public FineInfo() {
	}

	/** full constructor */
	public FineInfo(Timestamp fineTime, Integer fineType, String fineCharacter, String fineReason, String idCard, Integer policemanId, Integer caseId) {
		this.fineTime = fineTime;
		this.fineType = fineType;
		this.fineCharacter = fineCharacter;
		this.fineReason = fineReason;
		this.idCard = idCard;
		this.policemanId = policemanId;
		this.caseId = caseId;
	}

	// Property accessors

	public Integer getFineId() {
		return this.fineId;
	}

	public void setFineId(Integer fineId) {
		this.fineId = fineId;
	}

	public Timestamp getFineTime() {
		return this.fineTime;
	}

	public void setFineTime(Timestamp fineTime) {
		this.fineTime = fineTime;
	}

	public Integer getFineType() {
		return this.fineType;
	}

	public void setFineType(Integer fineType) {
		this.fineType = fineType;
	}

	public String getFineCharacter() {
		return this.fineCharacter;
	}

	public void setFineCharacter(String fineCharacter) {
		this.fineCharacter = fineCharacter;
	}

	public String getFineReason() {
		return this.fineReason;
	}

	public void setFineReason(String fineReason) {
		this.fineReason = fineReason;
	}

	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public Integer getPolicemanId() {
		return this.policemanId;
	}

	public void setPolicemanId(Integer policemanId) {
		this.policemanId = policemanId;
	}

	public Integer getCaseId() {
		return this.caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

}