package com.psas.entity;

/**
 * IllegalInfo entity. @author MyEclipse Persistence Tools
 */

public class IllegalInfo implements java.io.Serializable {

	// Fields

	private Integer illegalId;
	private String idCard;
	private Integer caseId;
	private AcceptCase acceptCase;
	private CitizenInfo citizenInfo;

	// Constructors

	/** default constructor */
	public IllegalInfo() {
	}

	/** full constructor */
	public IllegalInfo(String idCard, Integer caseId) {
		this.idCard = idCard;
		this.caseId = caseId;
	}

	
	public IllegalInfo(Integer illegalId, String idCard, Integer caseId, AcceptCase acceptCase,
			CitizenInfo citizenInfo) {
		super();
		this.illegalId = illegalId;
		this.idCard = idCard;
		this.caseId = caseId;
		this.acceptCase = acceptCase;
		this.citizenInfo = citizenInfo;
	}

	// Property accessors

	
	public Integer getIllegalId() {
		return this.illegalId;
	}

	public AcceptCase getAcceptCase() {
		return acceptCase;
	}

	public void setAcceptCase(AcceptCase acceptCase) {
		this.acceptCase = acceptCase;
	}

	public CitizenInfo getCitizenInfo() {
		return citizenInfo;
	}

	public void setCitizenInfo(CitizenInfo citizenInfo) {
		this.citizenInfo = citizenInfo;
	}

	public void setIllegalId(Integer illegalId) {
		this.illegalId = illegalId;
	}

	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public Integer getCaseId() {
		return this.caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	@Override
	public String toString() {
		return "IllegalInfo [illegalId=" + illegalId + ", idCard=" + idCard + ", caseId=" + caseId + ", acceptCase="
				+ acceptCase + ", citizenInfo=" + citizenInfo + "]";
	}

}