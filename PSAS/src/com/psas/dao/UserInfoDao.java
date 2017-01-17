package com.psas.dao;

import java.util.List;

import com.psas.entity.UserInfo;

public interface UserInfoDao {
	public List<UserInfo> findAll();
}
