package com.psas.entity;

import java.sql.Timestamp;

/**
 * HelpService entity. @author MyEclipse Persistence Tools
 */

public class HelpService implements java.io.Serializable {

	// Fields

	private Integer helpId;
	private String helpName;
	private String behelpName;
	private Timestamp alarmTime;
	private String alarmPlace;
	private String helpContent;
	private Integer alarmId;

	// Constructors

	/** default constructor */
	public HelpService() {
	}

	/** full constructor */
	public HelpService(String helpName, String behelpName, Timestamp alarmTime, String alarmPlace, String helpContent, Integer alarmId) {
		this.helpName = helpName;
		this.behelpName = behelpName;
		this.alarmTime = alarmTime;
		this.alarmPlace = alarmPlace;
		this.helpContent = helpContent;
		this.alarmId = alarmId;
	}

	// Property accessors

	public Integer getHelpId() {
		return this.helpId;
	}

	public void setHelpId(Integer helpId) {
		this.helpId = helpId;
	}

	public String getHelpName() {
		return this.helpName;
	}

	public void setHelpName(String helpName) {
		this.helpName = helpName;
	}

	public String getBehelpName() {
		return this.behelpName;
	}

	public void setBehelpName(String behelpName) {
		this.behelpName = behelpName;
	}

	public Timestamp getAlarmTime() {
		return this.alarmTime;
	}

	public void setAlarmTime(Timestamp alarmTime) {
		this.alarmTime = alarmTime;
	}

	public String getAlarmPlace() {
		return this.alarmPlace;
	}

	public void setAlarmPlace(String alarmPlace) {
		this.alarmPlace = alarmPlace;
	}

	public String getHelpContent() {
		return this.helpContent;
	}

	public void setHelpContent(String helpContent) {
		this.helpContent = helpContent;
	}

	public Integer getAlarmId() {
		return this.alarmId;
	}

	public void setAlarmId(Integer alarmId) {
		this.alarmId = alarmId;
	}

}