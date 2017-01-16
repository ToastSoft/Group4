package com.psas.entity;

/**
 * CaseLater entity. @author MyEclipse Persistence Tools
 */

public class CaseLater implements java.io.Serializable {

	// Fields

	private Integer caseLaterId;
	private String laterReason;
	private String supplyInfo;
	private Integer caseId;

	// Constructors

	/** default constructor */
	public CaseLater() {
	}

	/** minimal constructor */
	public CaseLater(String laterReason, Integer caseId) {
		this.laterReason = laterReason;
		this.caseId = caseId;
	}

	/** full constructor */
	public CaseLater(String laterReason, String supplyInfo, Integer caseId) {
		this.laterReason = laterReason;
		this.supplyInfo = supplyInfo;
		this.caseId = caseId;
	}

	// Property accessors

	public Integer getCaseLaterId() {
		return this.caseLaterId;
	}

	public void setCaseLaterId(Integer caseLaterId) {
		this.caseLaterId = caseLaterId;
	}

	public String getLaterReason() {
		return this.laterReason;
	}

	public void setLaterReason(String laterReason) {
		this.laterReason = laterReason;
	}

	public String getSupplyInfo() {
		return this.supplyInfo;
	}

	public void setSupplyInfo(String supplyInfo) {
		this.supplyInfo = supplyInfo;
	}

	public Integer getCaseId() {
		return this.caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

}