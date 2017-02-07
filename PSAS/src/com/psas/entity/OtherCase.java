package com.psas.entity;

import java.sql.Timestamp;

/**
 * OtherCase entity. @author MyEclipse Persistence Tools
 */

public class OtherCase implements java.io.Serializable {

	// Fields

	private Integer otherId;
	private String otherContent;
	private String otherHandle;
	private Timestamp alarmTime;
	private String alarmPlace;
	private String otherResult;
	private Integer alarmId;
	private AlarmInfo alarmInfo;

	// Constructors

	/** default constructor */
	public OtherCase() {
	}

	/** full constructor */
	public OtherCase(String otherContent, String otherHandle, Timestamp alarmTime, String alarmPlace, String otherResult, Integer alarmId) {
		this.otherContent = otherContent;
		this.otherHandle = otherHandle;
		this.alarmTime = alarmTime;
		this.alarmPlace = alarmPlace;
		this.otherResult = otherResult;
		this.alarmId = alarmId;
	}

	// Property accessors

	public OtherCase(Integer otherId, String otherContent, String otherHandle, Timestamp alarmTime, String alarmPlace,
			String otherResult, Integer alarmId, AlarmInfo alarmInfo) {
		super();
		this.otherId = otherId;
		this.otherContent = otherContent;
		this.otherHandle = otherHandle;
		this.alarmTime = alarmTime;
		this.alarmPlace = alarmPlace;
		this.otherResult = otherResult;
		this.alarmId = alarmId;
		this.alarmInfo = alarmInfo;
	}

	public AlarmInfo getAlarmInfo() {
		return alarmInfo;
	}

	public void setAlarmInfo(AlarmInfo alarmInfo) {
		this.alarmInfo = alarmInfo;
	}

	public Integer getOtherId() {
		return this.otherId;
	}

	public void setOtherId(Integer otherId) {
		this.otherId = otherId;
	}

	public String getOtherContent() {
		return this.otherContent;
	}

	public void setOtherContent(String otherContent) {
		this.otherContent = otherContent;
	}

	public String getOtherHandle() {
		return this.otherHandle;
	}

	public void setOtherHandle(String otherHandle) {
		this.otherHandle = otherHandle;
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

	public String getOtherResult() {
		return this.otherResult;
	}

	public void setOtherResult(String otherResult) {
		this.otherResult = otherResult;
	}

	public Integer getAlarmId() {
		return this.alarmId;
	}

	public void setAlarmId(Integer alarmId) {
		this.alarmId = alarmId;
	}

	@Override
	public String toString() {
		return "OtherCase [otherId=" + otherId + ", otherContent=" + otherContent + ", otherHandle=" + otherHandle
				+ ", alarmTime=" + alarmTime + ", alarmPlace=" + alarmPlace + ", otherResult=" + otherResult
				+ ", alarmId=" + alarmId + ", alarmInfo=" + alarmInfo + "]";
	}
	

}