package com.psas.entity;

import java.sql.Timestamp;

/**
 * CivilDispute entity. @author MyEclipse Persistence Tools
 */

public class CivilDispute implements java.io.Serializable {

	// Fields

	private Integer civilDispute;
	private String firstParty;
	private String secondParty;
	private Timestamp alarmTime;
	private String alarmPlace;
	private String civilReason;
	private String civilResult;
	private Integer caseId;
	private AcceptCase acceptCase;

	// Constructors

	/** default constructor */
	public CivilDispute() {
	}

	/** full constructor */
	public CivilDispute(String firstParty, String secondParty, Timestamp alarmTime, String alarmPlace, String civilReason, String civilResult, Integer caseId) {
		this.firstParty = firstParty;
		this.secondParty = secondParty;
		this.alarmTime = alarmTime;
		this.alarmPlace = alarmPlace;
		this.civilReason = civilReason;
		this.civilResult = civilResult;
		this.caseId = caseId;
	}
	

	// Property accessors

	public CivilDispute(Integer civilDispute, String firstParty, String secondParty, Timestamp alarmTime,
			String alarmPlace, String civilReason, String civilResult, Integer caseId, AcceptCase acceptCase) {
		super();
		this.civilDispute = civilDispute;
		this.firstParty = firstParty;
		this.secondParty = secondParty;
		this.alarmTime = alarmTime;
		this.alarmPlace = alarmPlace;
		this.civilReason = civilReason;
		this.civilResult = civilResult;
		this.caseId = caseId;
		this.acceptCase = acceptCase;
	}

	
	public AcceptCase getAcceptCase() {
		return acceptCase;
	}

	public void setAcceptCase(AcceptCase acceptCase) {
		this.acceptCase = acceptCase;
	}

	public Integer getCivilDispute() {
		return this.civilDispute;
	}

	public void setCivilDispute(Integer civilDispute) {
		this.civilDispute = civilDispute;
	}

	public String getFirstParty() {
		return this.firstParty;
	}

	public void setFirstParty(String firstParty) {
		this.firstParty = firstParty;
	}

	public String getSecondParty() {
		return this.secondParty;
	}

	public void setSecondParty(String secondParty) {
		this.secondParty = secondParty;
	}

	public Timestamp getAlarmTime() {
		return this.alarmTime;
	}

	public void setAlarmTime(Timestamp alarmTime) {
		this.alarmTime = alarmTime;
	}

	public String getAlarmPlace() {
		return this.alarmPlace;
	}

	public void setAlarmPlace(String alarmPlace) {
		this.alarmPlace = alarmPlace;
	}

	public String getCivilReason() {
		return this.civilReason;
	}

	public void setCivilReason(String civilReason) {
		this.civilReason = civilReason;
	}

	public String getCivilResult() {
		return this.civilResult;
	}

	public void setCivilResult(String civilResult) {
		this.civilResult = civilResult;
	}

	public Integer getCaseId() {
		return this.caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	@Override
	public String toString() {
		return "CivilDispute [civilDispute=" + civilDispute + ", firstParty=" + firstParty + ", secondParty="
				+ secondParty + ", alarmTime=" + alarmTime + ", alarmPlace=" + alarmPlace + ", civilReason="
				+ civilReason + ", civilResult=" + civilResult + ", caseId=" + caseId + ", acceptCase=" + acceptCase
				+ "]";
	}
	

}