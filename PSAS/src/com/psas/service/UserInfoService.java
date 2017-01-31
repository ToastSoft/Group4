package com.psas.service;

import java.util.List;

import com.psas.entity.Page;
import com.psas.entity.UserInfo;

/**
 * 用户信息service接口
 * @author  XulaiWang
 * @data:  2017年1月24日 下午1:05:12
 * @version:  V1.0
 */
public interface UserInfoService {
	public static final String BEAN_NAME = "userInfoService";

	/**
	 * 查询所有用户信息service接口
	 * @return
	 * @throw
	 * @return List<UserInfo>
	 */
	public List<UserInfo> findAll();

	/**
	 * 新增用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void add(UserInfo user);

	/**
	 * 删除用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void delete(UserInfo user);

	/**
	 * 修改用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void update(UserInfo user);

	/**
	 * 根据id查找用户信息service接口
	 * @param user
	 * @return
	 * @throw
	 * @return UserInfo
	 */
	public UserInfo findUserById(UserInfo user);

	/**
	 * 分页查询用户信息service接口
	 * @param page
	 * @return
	 * @throw
	 * @return List<UserInfo>
	 */
	public List<UserInfo> findUserByPage(Page page);

}
