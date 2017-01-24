package com.psas.entity;

import java.sql.Timestamp;

/**
 * AlarmInfo entity. @author MyEclipse Persistence Tools
 */

public class AlarmInfo implements java.io.Serializable {

	// Fields

	private Integer alarmId;
	private String alarmName;
	private String alarmGender;
	private String alarmTelephone;
	private String alarmAddress;
	private Timestamp alarmTime;
	private Integer alarmFormat;
	private String alarmContent;
	private Timestamp alarmCaseTime;
	private String alarmPlace;
	private Integer receptionPoliceman;
	private String handleSituation;
	private Integer handlePoliceman;
	private String lossSituation;
	private Integer deathNumber;
	private Integer injuredNumber;
	private Double economicLoss;
	private Integer handleResult;
	private Integer dutyLeader;

	// Constructors

	/** default constructor */
	public AlarmInfo() {
	}

	/** minimal constructor */
	public AlarmInfo(String alarmName, String alarmGender, String alarmTelephone, String alarmAddress, Timestamp alarmTime, Integer alarmFormat, String alarmContent, String alarmPlace,
			Integer receptionPoliceman, String handleSituation, Integer handlePoliceman, String lossSiuation, Integer deathNumber, Integer injuredNumber, Double economicLoss, Integer handleResult,
			Integer dutyLeader) {
		this.alarmName = alarmName;
		this.alarmGender = alarmGender;
		this.alarmTelephone = alarmTelephone;
		this.alarmAddress = alarmAddress;
		this.alarmTime = alarmTime;
		this.alarmFormat = alarmFormat;
		this.alarmContent = alarmContent;
		this.alarmPlace = alarmPlace;
		this.receptionPoliceman = receptionPoliceman;
		this.handleSituation = handleSituation;
		this.handlePoliceman = handlePoliceman;
		this.lossSituation = lossSiuation;
		this.deathNumber = deathNumber;
		this.injuredNumber = injuredNumber;
		this.economicLoss = economicLoss;
		this.handleResult = handleResult;
		this.dutyLeader = dutyLeader;
	}

	/** full constructor */
	public AlarmInfo(String alarmName, String alarmGender, String alarmTelephone, String alarmAddress, Timestamp alarmTime, Integer alarmFormat, String alarmContent, Timestamp alarmCaseTime,
			String alarmPlace, Integer receptionPoliceman, String handleSituation, Integer handlePoliceman, String lossSiuation, Integer deathNumber, Integer injuredNumber, Double economicLoss,
			Integer handleResult, Integer dutyLeader) {
		this.alarmName = alarmName;
		this.alarmGender = alarmGender;
		this.alarmTelephone = alarmTelephone;
		this.alarmAddress = alarmAddress;
		this.alarmTime = alarmTime;
		this.alarmFormat = alarmFormat;
		this.alarmContent = alarmContent;
		this.alarmCaseTime = alarmCaseTime;
		this.alarmPlace = alarmPlace;
		this.receptionPoliceman = receptionPoliceman;
		this.handleSituation = handleSituation;
		this.handlePoliceman = handlePoliceman;
		this.lossSituation = lossSiuation;
		this.deathNumber = deathNumber;
		this.injuredNumber = injuredNumber;
		this.economicLoss = economicLoss;
		this.handleResult = handleResult;
		this.dutyLeader = dutyLeader;
	}

	// Property accessors

	public Integer getAlarmId() {
		return this.alarmId;
	}

	public void setAlarmId(Integer alarmId) {
		this.alarmId = alarmId;
	}

	public String getAlarmName() {
		return this.alarmName;
	}

	public void setAlarmName(String alarmName) {
		this.alarmName = alarmName;
	}

	public String getAlarmGender() {
		return this.alarmGender;
	}

	public void setAlarmGender(String alarmGender) {
		this.alarmGender = alarmGender;
	}

	public String getAlarmTelephone() {
		return this.alarmTelephone;
	}

	public void setAlarmTelephone(String alarmTelephone) {
		this.alarmTelephone = alarmTelephone;
	}

	public String getAlarmAddress() {
		return this.alarmAddress;
	}

	public void setAlarmAddress(String alarmAddress) {
		this.alarmAddress = alarmAddress;
	}

	public Timestamp getAlarmTime() {
		return this.alarmTime;
	}

	public void setAlarmTime(Timestamp alarmTime) {
		this.alarmTime = alarmTime;
	}

	public Integer getAlarmFormat() {
		return this.alarmFormat;
	}

	public void setAlarmFormat(Integer alarmFormat) {
		this.alarmFormat = alarmFormat;
	}

	public String getAlarmContent() {
		return this.alarmContent;
	}

	public void setAlarmContent(String alarmContent) {
		this.alarmContent = alarmContent;
	}

	public Timestamp getAlarmCaseTime() {
		return this.alarmCaseTime;
	}

	public void setAlarmCaseTime(Timestamp alarmCaseTime) {
		this.alarmCaseTime = alarmCaseTime;
	}

	public String getAlarmPlace() {
		return this.alarmPlace;
	}

	public void setAlarmPlace(String alarmPlace) {
		this.alarmPlace = alarmPlace;
	}

	public Integer getReceptionPoliceman() {
		return this.receptionPoliceman;
	}

	public void setReceptionPoliceman(Integer receptionPoliceman) {
		this.receptionPoliceman = receptionPoliceman;
	}

	public String getHandleSituation() {
		return this.handleSituation;
	}

	public void setHandleSituation(String handleSituation) {
		this.handleSituation = handleSituation;
	}

	public Integer getHandlePoliceman() {
		return this.handlePoliceman;
	}

	public void setHandlePoliceman(Integer handlePoliceman) {
		this.handlePoliceman = handlePoliceman;
	}

	public String getLossSituation() {
		return this.lossSituation;
	}

	public void setLossSiuation(String lossSiuation) {
		this.lossSituation = lossSiuation;
	}

	public Integer getDeathNumber() {
		return this.deathNumber;
	}

	public void setDeathNumber(Integer deathNumber) {
		this.deathNumber = deathNumber;
	}

	public Integer getInjuredNumber() {
		return this.injuredNumber;
	}

	public void setInjuredNumber(Integer injuredNumber) {
		this.injuredNumber = injuredNumber;
	}

	public Double getEconomicLoss() {
		return this.economicLoss;
	}

	public void setEconomicLoss(Double economicLoss) {
		this.economicLoss = economicLoss;
	}

	public Integer getHandleResult() {
		return this.handleResult;
	}

	public void setHandleResult(Integer handleResult) {
		this.handleResult = handleResult;
	}

	public Integer getDutyLeader() {
		return this.dutyLeader;
	}

	public void setDutyLeader(Integer dutyLeader) {
		this.dutyLeader = dutyLeader;
	}

}