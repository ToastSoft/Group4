package com.psas.entity;

import java.sql.Timestamp;

/**
 * 日志信息实体类
 * @author  XulaiWang
 * @data:  2017年1月14日 上午10:48:11
 * @version:  V1.0
 */

public class LogInfo implements java.io.Serializable {

	// Fields

	public LogInfo(Integer logId) {
		super();
		this.logId = logId;
	}

	private Integer logId;
	private String logMsg;
	private Timestamp logTime;
	private Integer userId;
	private UserInfo userInfo;

	// Constructors

	/** default constructor */
	public LogInfo() {
	}

	/** full constructor */
	public LogInfo(String logMsg, Timestamp logTime, Integer userId) {
		this.logMsg = logMsg;
		this.logTime = logTime;
		this.userId = userId;
	}

	// Property accessors

	public Integer getLogId() {
		return this.logId;
	}

	public void setLogId(Integer logId) {
		this.logId = logId;
	}

	public String getLogMsg() {
		return this.logMsg;
	}

	public void setLogMsg(String logMsg) {
		this.logMsg = logMsg;
	}

	public Timestamp getLogTime() {
		return this.logTime;
	}

	public void setLogTime(Timestamp logTime) {
		this.logTime = logTime;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public LogInfo(String logMsg, Integer userId) {
		super();
		this.logMsg = logMsg;
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "LogInfo [logId=" + logId + ", logMsg=" + logMsg + ", logTime=" + logTime + ", userId=" + userId
				+ ", userInfo=" + userInfo + "]";
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

}