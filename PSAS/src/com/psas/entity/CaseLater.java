package com.psas.entity;
/**
 * CaseLater entity. @author MyEclipse Persistence Tools
 */

public class CaseLater implements java.io.Serializable {

	// Fields

	private Integer caseLaterId;
	public CaseLater(Integer caseLaterId) {
		super();
		this.caseLaterId = caseLaterId;
	}

	private String laterReason;
	private String supplyInfo;
	private Integer caseId;
	private AcceptCase acceptCase;

	/** default constructor */
	public CaseLater() {
	}

	// Constructors



	public CaseLater(Integer caseLaterId, String laterReason, String supplyInfo, Integer caseId,
			AcceptCase acceptCase) {
		super();
		this.caseLaterId = caseLaterId;
		this.laterReason = laterReason;
		this.supplyInfo = supplyInfo;
		this.caseId = caseId;
		this.acceptCase = acceptCase;
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

	

	public AcceptCase getAcceptCase() {
		return acceptCase;
	}

	public Integer getCaseId() {
		return this.caseId;
	}

	public Integer getCaseLaterId() {
		return this.caseLaterId;
	}

	// Property accessors

	public String getLaterReason() {
		return this.laterReason;
	}

	public String getSupplyInfo() {
		return this.supplyInfo;
	}

	public void setAcceptCase(AcceptCase acceptCase) {
		this.acceptCase = acceptCase;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public void setCaseLaterId(Integer caseLaterId) {
		this.caseLaterId = caseLaterId;
	}

	public void setLaterReason(String laterReason) {
		this.laterReason = laterReason;
	}

	public void setSupplyInfo(String supplyInfo) {
		this.supplyInfo = supplyInfo;
	}

	@Override
	public String toString() {
		return "CaseLater [caseLaterId=" + caseLaterId + ", laterReason=" + laterReason + ", supplyInfo=" + supplyInfo
				+ ", caseId=" + caseId + ", acceptCase=" + acceptCase + "]";
	}

}