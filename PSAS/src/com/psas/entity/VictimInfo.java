package com.psas.entity;

/**
 * VictimInfo entity. @author MyEclipse Persistence Tools
 */

public class VictimInfo implements java.io.Serializable {

	// Fields

	private Integer victimId;
	private String idCard;
	private Integer caseId;
	private AcceptCase acceptCase;
	private CitizenInfo citizenInfo;

	// Constructors

	/** default constructor */
	public VictimInfo() {
	}

	/** full constructor */
	public VictimInfo(String idCard, Integer caseId) {
		this.idCard = idCard;
		this.caseId = caseId;
	}

	public VictimInfo(Integer victimId, String idCard, Integer caseId, AcceptCase acceptCase, CitizenInfo citizenInfo) {
		super();
		this.victimId = victimId;
		this.idCard = idCard;
		this.caseId = caseId;
		this.acceptCase = acceptCase;
		this.citizenInfo = citizenInfo;
	}

	// Property accessors

	public Integer getVictimId() {
		return this.victimId;
	}

	public void setVictimId(Integer victimId) {
		this.victimId = victimId;
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

	@Override
	public String toString() {
		return "VictimInfo [victimId=" + victimId + ", idCard=" + idCard + ", caseId=" + caseId + ", acceptCase="
				+ acceptCase + ", citizenInfo=" + citizenInfo + "]";
	}

}