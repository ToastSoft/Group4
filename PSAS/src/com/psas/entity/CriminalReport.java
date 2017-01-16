package com.psas.entity;

import java.sql.Timestamp;

/**
 * CriminalReport entity. @author MyEclipse Persistence Tools
 */

public class CriminalReport implements java.io.Serializable {

	// Fields

	private Integer criminalReportId;
	private String caseReport;
	private Timestamp reportTime;
	private Integer caseId;

	// Constructors

	/** default constructor */
	public CriminalReport() {
	}

	/** full constructor */
	public CriminalReport(String caseReport, Timestamp reportTime, Integer caseId) {
		this.caseReport = caseReport;
		this.reportTime = reportTime;
		this.caseId = caseId;
	}

	// Property accessors

	public Integer getCriminalReportId() {
		return this.criminalReportId;
	}

	public void setCriminalReportId(Integer criminalReportId) {
		this.criminalReportId = criminalReportId;
	}

	public String getCaseReport() {
		return this.caseReport;
	}

	public void setCaseReport(String caseReport) {
		this.caseReport = caseReport;
	}

	public Timestamp getReportTime() {
		return this.reportTime;
	}

	public void setReportTime(Timestamp reportTime) {
		this.reportTime = reportTime;
	}

	public Integer getCaseId() {
		return this.caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

}