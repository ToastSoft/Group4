package com.psas.service;

import java.util.List;

import com.psas.entity.UserJurisdictionInfo;

/**
 * 用户与权限service接口
 * @author  XulaiWang
 * @data:  2017年2月7日 下午3:23:21
 * @version:  V1.0
 */
public interface UserJurisdictionInfoService {
	public static final String BEAN_NAME = "userJurisdictionInfoService";

	/**
	 * 查找所有用户与权限service接口
	 * @return
	 * @throw
	 * @return List<UserJurisdictionInfo>
	 */
	public List<UserJurisdictionInfo> findAll();

	/**
	 * 增加用户与权限service接口
	 * @param userJurisdictionInfo
	 * @throw
	 * @return void
	 */
	public void add(UserJurisdictionInfo userJurisdictionInfo);

	/**
	 * 删除用户与权限service接口
	 * @param userJurisdictionInfo
	 * @throw
	 * @return void
	 */
	public void delete(UserJurisdictionInfo userJurisdictionInfo);

	/**
	 * 根据id查找用户与权限service接口
	 * @param userJurisdictionInfo
	 * @return
	 * @throw
	 * @return UserJurisdictionInfo
	 */
	public UserJurisdictionInfo findById(UserJurisdictionInfo userJurisdictionInfo);

	/**
	 * 根据userId查找用户与权限service接口
	 * @param userJurisdictionInfo
	 * @return
	 * @throw
	 * @return List<UserJurisdictionInfo>
	 */
	public List<UserJurisdictionInfo> findByUserId(UserJurisdictionInfo userJurisdictionInfo);

	/**
	 * 根据jurisdictionInfo查找用户与权限service接口
	 * @param userJurisdictionInfo
	 * @return
	 * @throw
	 * @return List<UserJurisdictionInfo>
	 */
	public List<UserJurisdictionInfo> findByJurisdictionId(UserJurisdictionInfo userJurisdictionInfo);

}
