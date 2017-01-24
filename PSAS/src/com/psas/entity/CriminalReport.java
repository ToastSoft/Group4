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

	/** default constructor */
	public CriminalReport() {
	}
	

	public CriminalReport(Integer criminalReportId, String caseReport, Timestamp reportTime, Integer caseId) {
		super();
		this.criminalReportId = criminalReportId;
		this.caseReport = caseReport;
		this.reportTime = reportTime;
		this.caseId = caseId;
	}


	public CriminalReport(Integer caseId) {
		super();
		this.caseId = caseId;
	}


	// Constructors

	/** full constructor */
	public CriminalReport(String caseReport, Timestamp reportTime, Integer caseId) {
		this.caseReport = caseReport;
		this.reportTime = reportTime;
		this.caseId = caseId;
	}

	public Integer getCaseId() {
		return this.caseId;
	}

	// Property accessors

	public String getCaseReport() {
		return this.caseReport;
	}

	public Integer getCriminalReportId() {
		return this.criminalReportId;
	}

	public Timestamp getReportTime() {
		return this.reportTime;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public void setCaseReport(String caseReport) {
		this.caseReport = caseReport;
	}

	public void setCriminalReportId(Integer criminalReportId) {
		this.criminalReportId = criminalReportId;
	}

	public void setReportTime(Timestamp reportTime) {
		this.reportTime = reportTime;
	}

	@Override
	public String toString() {
		return "CriminalReport [criminalReportId=" + criminalReportId + ", caseReport=" + caseReport + ", reportTime="
				+ reportTime + ", caseId=" + caseId + "]";
	}

}