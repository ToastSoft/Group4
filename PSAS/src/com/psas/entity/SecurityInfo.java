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
	private AcceptCase acceptCase;
	private FineInfo fineInfo;

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



	public SecurityInfo(Integer securityId, String supplyInfo, String securityResult, Integer fineId, Integer caseId,
			AcceptCase acceptCase, FineInfo fineInfo) {
		super();
		this.securityId = securityId;
		this.supplyInfo = supplyInfo;
		this.securityResult = securityResult;
		this.fineId = fineId;
		this.caseId = caseId;
		this.acceptCase = acceptCase;
		this.fineInfo = fineInfo;
	}

	// Property accessors

	public Integer getSecurityId() {
		return this.securityId;
	}

	public FineInfo getFineInfo() {
		return fineInfo;
	}

	public void setFineInfo(FineInfo fineInfo) {
		this.fineInfo = fineInfo;
	}

	public AcceptCase getAcceptCase() {
		return acceptCase;
	}

	public void setAcceptCase(AcceptCase acceptCase) {
		this.acceptCase = acceptCase;
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

	@Override
	public String toString() {
		return "SecurityInfo [securityId=" + securityId + ", supplyInfo=" + supplyInfo + ", securityResult="
				+ securityResult + ", fineId=" + fineId + ", caseId=" + caseId + ", acceptCase=" + acceptCase
				+ ", fineInfo=" + fineInfo + "]";
	}

	
	

}