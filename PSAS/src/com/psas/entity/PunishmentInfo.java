package com.psas.entity;

import java.sql.Timestamp;

/**
 * PunishmentInfo entity. @author MyEclipse Persistence Tools
 */

public class PunishmentInfo implements java.io.Serializable {

	// Fields

	private Integer punishmentId;
	private String punishmentSituation;
	private Timestamp punishmentTime;
	private String idCard;
	private Integer psId;
	private Integer caseId;
	private CitizenInfo citizenInfo;
	private PublicSecurity publicSecurity;

	// Constructors

	public CitizenInfo getCitizenInfo() {
		return citizenInfo;
	}

	public void setCitizenInfo(CitizenInfo citizenInfo) {
		this.citizenInfo = citizenInfo;
	}

	public PublicSecurity getPublicSecurity() {
		return publicSecurity;
	}

	public void setPublicSecurity(PublicSecurity publicSecurity) {
		this.publicSecurity = publicSecurity;
	}

	/** default constructor */
	public PunishmentInfo() {
	}

	/** full constructor */
	public PunishmentInfo(String punishmentSituation, Timestamp punishmentTime, String idCard, Integer psId, Integer caseId) {
		this.punishmentSituation = punishmentSituation;
		this.punishmentTime = punishmentTime;
		this.idCard = idCard;
		this.psId = psId;
		this.caseId = caseId;
	}

	// Property accessors

	public Integer getPunishmentId() {
		return this.punishmentId;
	}

	public void setPunishmentId(Integer punishmentId) {
		this.punishmentId = punishmentId;
	}

	public String getPunishmentSituation() {
		return this.punishmentSituation;
	}

	public void setPunishmentSituation(String punishmentSituation) {
		this.punishmentSituation = punishmentSituation;
	}

	public Timestamp getPunishmentTime() {
		return this.punishmentTime;
	}

	public void setPunishmentTime(Timestamp punishmentTime) {
		this.punishmentTime = punishmentTime;
	}

	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public Integer getPsId() {
		return this.psId;
	}

	public void setPsId(Integer psId) {
		this.psId = psId;
	}

	public Integer getCaseId() {
		return this.caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	@Override
	public String toString() {
		return "PunishmentInfo [punishmentId=" + punishmentId + ", punishmentSituation=" + punishmentSituation
				+ ", punishmentTime=" + punishmentTime + ", idCard=" + idCard + ", psId=" + psId + ", caseId=" + caseId
				+ ", citizenInfo=" + citizenInfo + ", publicSecurity=" + publicSecurity + "]";
	}
	

}