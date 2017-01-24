package com.psas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.psas.entity.Page;
import com.psas.entity.UserInfo;

/**
 * 用户信息DAO 接口
 * @author  XulaiWang
 * @data:  2017年1月17日 下午4:23:06
 * @version:  V1.0
 */
public interface UserInfoDao {
	public static final String BEAN_NAME = "userInfoDao";

	/**
	 * 查找所有用户信息 dao接口
	 * @return
	 * @throw
	 * @return List<UserInfo>
	 */
	public List<UserInfo> findAll();

	/**
	 * 新增用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void add(@Param("user") UserInfo user);

	/**
	 * 删除用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void delete(@Param("user") UserInfo user);

	/**
	 * 修改用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void update(@Param("user") UserInfo user);

	/**
	 * 根据条件查找用户信息
	 * @param user
	 * @param page
	 * @throw
	 * @return void
	 */
	public List<UserInfo> findUser(@Param("user") UserInfo user, @Param("page") Page page);
}
