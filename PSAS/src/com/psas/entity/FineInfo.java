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
	/** default constructor */
	public FineInfo() {
	}
	public FineInfo(Integer fineId) {
		super();
		this.fineId = fineId;
	}

	// Constructors

	public FineInfo(String idCard) {
		super();
		this.idCard = idCard;
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

	public Integer getCaseId() {
		return this.caseId;
	}

	// Property accessors

	public String getFineCharacter() {
		return this.fineCharacter;
	}

	public Integer getFineId() {
		return this.fineId;
	}

	public String getFineReason() {
		return this.fineReason;
	}

	public Timestamp getFineTime() {
		return this.fineTime;
	}

	public Integer getFineType() {
		return this.fineType;
	}

	public String getIdCard() {
		return this.idCard;
	}

	public Integer getPolicemanId() {
		return this.policemanId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public void setFineCharacter(String fineCharacter) {
		this.fineCharacter = fineCharacter;
	}

	public void setFineId(Integer fineId) {
		this.fineId = fineId;
	}

	public void setFineReason(String fineReason) {
		this.fineReason = fineReason;
	}

	public void setFineTime(Timestamp fineTime) {
		this.fineTime = fineTime;
	}

	public void setFineType(Integer fineType) {
		this.fineType = fineType;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public void setPolicemanId(Integer policemanId) {
		this.policemanId = policemanId;
	}

	@Override
	public String toString() {
		return "FineInfo [fineId=" + fineId + ", fineTime=" + fineTime + ", fineType=" + fineType + ", fineCharacter="
				+ fineCharacter + ", fineReason=" + fineReason + ", idCard=" + idCard + ", policemanId=" + policemanId
				+ ", caseId=" + caseId + "]";
	}

}