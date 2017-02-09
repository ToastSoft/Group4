package com.psas.entity;

import java.sql.Timestamp;

/**
 * CaseNotify entity. @author MyEclipse Persistence Tools
 */

public class CaseNotify implements java.io.Serializable {

	// Fields

	private Integer caseNotifyId;
	private String benotifiedName;
	private String alarmAddress;
	private Timestamp caseNotifyTime;
	private String caseNotifyConsider;
	private Integer caseId;

	// Constructors

	/** default constructor */
	public CaseNotify() {
	}

	/** full constructor */
	public CaseNotify(String benotifiedName, String alarmAddress, Timestamp caseNotifyTime, String caseNotifyConsider, Integer caseId) {
		this.benotifiedName = benotifiedName;
		this.alarmAddress = alarmAddress;
		this.caseNotifyTime = caseNotifyTime;
		this.caseNotifyConsider = caseNotifyConsider;
		this.caseId = caseId;
	}

	// Property accessors

	public Integer getCaseNotifyId() {
		return this.caseNotifyId;
	}

	public void setCaseNotifyId(Integer caseNotifyId) {
		this.caseNotifyId = caseNotifyId;
	}

	public String getBenotifiedName() {
		return this.benotifiedName;
	}

	public void setBenotifiedName(String benotifiedName) {
		this.benotifiedName = benotifiedName;
	}

	public String getAlarmAddress() {
		return this.alarmAddress;
	}

	public void setAlarmAddress(String alarmAddress) {
		this.alarmAddress = alarmAddress;
	}

	public Timestamp getCaseNotifyTime() {
		return this.caseNotifyTime;
	}

	public void setCaseNotifyTime(Timestamp caseNotifyTime) {
		this.caseNotifyTime = caseNotifyTime;
	}

	public String getCaseNotifyConsider() {
		return this.caseNotifyConsider;
	}

	public void setCaseNotifyConsider(String caseNotifyConsider) {
		this.caseNotifyConsider = caseNotifyConsider;
	}

	public Integer getCaseId() {
		return this.caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	@Override
	public String toString() {
		return "CaseNotify [caseNotifyId=" + caseNotifyId + ", benotifiedName=" + benotifiedName + ", alarmAddress="
				+ alarmAddress + ", caseNotifyTime=" + caseNotifyTime + ", caseNotifyConsider=" + caseNotifyConsider
				+ ", caseId=" + caseId + "]";
	}

}