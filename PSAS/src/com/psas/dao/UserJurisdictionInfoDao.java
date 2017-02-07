package com.psas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.psas.entity.UserJurisdictionInfo;

/**
 * 用户信息与权限关联dao接口
 * @author  XulaiWang
 * @data:  2017年2月7日 下午1:41:21
 * @version:  V1.0
 */
public interface UserJurisdictionInfoDao {
	public static final String BEAN_NAME = "userJurisdictionInfoDao";

	/**
	 * 查询所有用户与权限关联dao接口
	 * @return
	 * @throw
	 * @return List<UserJurisdictionInfo>
	 */
	public List<UserJurisdictionInfo> findAll();

	/**
	 * 增加用户与权限关联dao接口
	 * @param userJurisdiction
	 * @throw
	 * @return void
	 */
	public void add(@Param("userJurisdiction") UserJurisdictionInfo userJurisdiction);

	/**
	 * 删除用户与权限关联dao接口
	 * @param userJurisdiction
	 * @throw
	 * @return void
	 */
	public void delete(@Param("userJurisdiction") UserJurisdictionInfo userJurisdiction);

	/**
	 * 按条件查询用户与权限关联dao接口
	 * @param userJurisdiction
	 * @return
	 * @throw
	 * @return List<UserJurisdictionInfo>
	 */
	public List<UserJurisdictionInfo> findUserJurisdictionInfo(
			@Param("userJurisdiction") UserJurisdictionInfo userJurisdiction);

}
