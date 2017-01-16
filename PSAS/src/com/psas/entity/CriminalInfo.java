package com.psas.entity;

/**
 * CriminalInfo entity. @author MyEclipse Persistence Tools
 */

public class CriminalInfo implements java.io.Serializable {

	// Fields

	private Integer criminalId;
	private String supplyInfo;
	private String criminalSituation;
	private String caseSupply;
	private String criminalResult;
	private Integer caseId;

	// Constructors

	/** default constructor */
	public CriminalInfo() {
	}

	/** minimal constructor */
	public CriminalInfo(String supplyInfo, String criminalResult, Integer caseId) {
		this.supplyInfo = supplyInfo;
		this.criminalResult = criminalResult;
		this.caseId = caseId;
	}

	/** full constructor */
	public CriminalInfo(String supplyInfo, String criminalSituation, String caseSupply, String criminalResult, Integer caseId) {
		this.supplyInfo = supplyInfo;
		this.criminalSituation = criminalSituation;
		this.caseSupply = caseSupply;
		this.criminalResult = criminalResult;
		this.caseId = caseId;
	}

	// Property accessors

	public Integer getCriminalId() {
		return this.criminalId;
	}

	public void setCriminalId(Integer criminalId) {
		this.criminalId = criminalId;
	}

	public String getSupplyInfo() {
		return this.supplyInfo;
	}

	public void setSupplyInfo(String supplyInfo) {
		this.supplyInfo = supplyInfo;
	}

	public String getCriminalSituation() {
		return this.criminalSituation;
	}

	public void setCriminalSituation(String criminalSituation) {
		this.criminalSituation = criminalSituation;
	}

	public String getCaseSupply() {
		return this.caseSupply;
	}

	public void setCaseSupply(String caseSupply) {
		this.caseSupply = caseSupply;
	}

	public String getCriminalResult() {
		return this.criminalResult;
	}

	public void setCriminalResult(String criminalResult) {
		this.criminalResult = criminalResult;
	}

	public Integer getCaseId() {
		return this.caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

}