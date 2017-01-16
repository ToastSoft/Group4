package com.psas.entity;

import java.sql.Timestamp;

/**
 * AcceptCase entity. @author MyEclipse Persistence Tools
 */

public class AcceptCase implements java.io.Serializable {

	// Fields

	private Integer caseId;
	private Timestamp caseTime;
	private String casePlace;
	private Timestamp placeCaseTime;
	private String caseName;
	private Integer deptId;
	private Integer policemanId;
	private Integer psId;
	private Integer alarmId;

	// Constructors

	/** default constructor */
	public AcceptCase() {
	}

	/** full constructor */
	public AcceptCase(Timestamp caseTime, String casePlace, Timestamp placeCaseTime, String caseName, Integer deptId, Integer policemanId, Integer psId, Integer alarmId) {
		this.caseTime = caseTime;
		this.casePlace = casePlace;
		this.placeCaseTime = placeCaseTime;
		this.caseName = caseName;
		this.deptId = deptId;
		this.policemanId = policemanId;
		this.psId = psId;
		this.alarmId = alarmId;
	}

	// Property accessors

	public Integer getCaseId() {
		return this.caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public Timestamp getCaseTime() {
		return this.caseTime;
	}

	public void setCaseTime(Timestamp caseTime) {
		this.caseTime = caseTime;
	}

	public String getCasePlace() {
		return this.casePlace;
	}

	public void setCasePlace(String casePlace) {
		this.casePlace = casePlace;
	}

	public Timestamp getPlaceCaseTime() {
		return this.placeCaseTime;
	}

	public void setPlaceCaseTime(Timestamp placeCaseTime) {
		this.placeCaseTime = placeCaseTime;
	}

	public String getCaseName() {
		return this.caseName;
	}

	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}

	public Integer getDeptId() {
		return this.deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public Integer getPolicemanId() {
		return this.policemanId;
	}

	public void setPolicemanId(Integer policemanId) {
		this.policemanId = policemanId;
	}

	public Integer getPsId() {
		return this.psId;
	}

	public void setPsId(Integer psId) {
		this.psId = psId;
	}

	public Integer getAlarmId() {
		return this.alarmId;
	}

	public void setAlarmId(Integer alarmId) {
		this.alarmId = alarmId;
	}

}