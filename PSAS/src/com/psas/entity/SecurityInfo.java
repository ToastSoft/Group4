package com.psas.entity;

/**
 * SecurityInfo entity. @author MyEclipse Persistence Tools
 */

public class SecurityInfo implements java.io.Serializable {

	// Fields

	private Integer securityId;
	private String supplyInfo;
	private String securityResult;
	private Integer fineId;
	private Integer caseId;

	// Constructors

	/** default constructor */
	public SecurityInfo() {
	}

	/** minimal constructor */
	public SecurityInfo(String supplyInfo, String securityResult, Integer caseId) {
		this.supplyInfo = supplyInfo;
		this.securityResult = securityResult;
		this.caseId = caseId;
	}

	/** full constructor */
	public SecurityInfo(String supplyInfo, String securityResult, Integer fineId, Integer caseId) {
		this.supplyInfo = supplyInfo;
		this.securityResult = securityResult;
		this.fineId = fineId;
		this.caseId = caseId;
	}

	// Property accessors

	public Integer getSecurityId() {
		return this.securityId;
	}

	public void setSecurityId(Integer securityId) {
		this.securityId = securityId;
	}

	public String getSupplyInfo() {
		return this.supplyInfo;
	}

	public void setSupplyInfo(String supplyInfo) {
		this.supplyInfo = supplyInfo;
	}

	public String getSecurityResult() {
		return this.securityResult;
	}

	public void setSecurityResult(String securityResult) {
		this.securityResult = securityResult;
	}

	public Integer getFineId() {
		return this.fineId;
	}

	public void setFineId(Integer fineId) {
		this.fineId = fineId;
	}

	public Integer getCaseId() {
		return this.caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

}