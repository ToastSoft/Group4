package com.psas.entity;

import java.sql.Timestamp;
import java.util.List;

/**
 * UserInfo entity. @author MyEclipse Persistence Tools
 */

public class UserInfo implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String loginName;
	private String loginPassword;
	private Integer policeId;
	private String policeName;
	private Timestamp createTime;
	private Timestamp deleteTime;
	private String userStatus;
	private List<UserJurisdictionInfo> userJurisdictionInfo;

	// Constructors

	/** default constructor */
	public UserInfo() {
	}

	/** minimal constructor */
	public UserInfo(String loginName, String loginPassword, Integer policeId, Timestamp createTime, String userStatus) {
		this.loginName = loginName;
		this.loginPassword = loginPassword;
		this.policeId = policeId;
		this.createTime = createTime;
		this.userStatus = userStatus;
	}

	/** full constructor */
	public UserInfo(String loginName, String loginPassword, Integer policeId, String policeName, Timestamp createTime, Timestamp deleteTime, String userStatus) {
		this.loginName = loginName;
		this.loginPassword = loginPassword;
		this.policeId = policeId;
		this.policeName = policeName;
		this.createTime = createTime;
		this.deleteTime = deleteTime;
		this.userStatus = userStatus;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPassword() {
		return this.loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public Integer getPoliceId() {
		return this.policeId;
	}

	public void setPoliceId(Integer policeId) {
		this.policeId = policeId;
	}

	public String getPoliceName() {
		return this.policeName;
	}

	public void setPoliceName(String policeName) {
		this.policeName = policeName;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getDeleteTime() {
		return this.deleteTime;
	}

	public void setDeleteTime(Timestamp deleteTime) {
		this.deleteTime = deleteTime;
	}

	public String getUserStatus() {
		return this.userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", loginName=" + loginName + ", loginPassword=" + loginPassword
				+ ", policeId=" + policeId + ", policeName=" + policeName + ", createTime=" + createTime
				+ ", deleteTime=" + deleteTime + ", userStatus=" + userStatus + ", userJurisdictionInfo="
				+ userJurisdictionInfo + "]";
	}



	public List<UserJurisdictionInfo> getUserJurisdictionInfo() {
		return userJurisdictionInfo;
	}

	public void setUserJurisdictionInfo(List<UserJurisdictionInfo> userJurisdictionInfo) {
		this.userJurisdictionInfo = userJurisdictionInfo;
	}



}