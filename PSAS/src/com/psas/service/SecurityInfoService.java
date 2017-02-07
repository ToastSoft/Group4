package com.psas.service;

import java.util.List;

import com.psas.entity.Page;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.SecurityInfo;
import com.psas.entity.UserInfo;

/**
 * 
 * TODO	治安案件登记表的service 接口
 * @author  Cunbao Song
 * @data:  2017年2月6日 上午10:25:16
 * @version:  V1.0
 */
public interface SecurityInfoService {
	public static final String BEAN_NAME = "securityInfoService";

	/**
	 * 查询所有用户信息service接口
	 * @return
	 * @throw
	 * @return List<SecurityInfo>
	 */
	public List<SecurityInfo> findAll();

	/**
	 * 新增用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void add(SecurityInfo securityInfo);

	/**
	 * 删除用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void delete(SecurityInfo securityInfo);

	/**
	 * 修改用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void update(SecurityInfo securityInfo);

	/**
	 * 根据id查找用户信息service接口
	 * @param user
	 * @return
	 * @throw
	 * @return SecurityInfo
	 */
	public SecurityInfo findUserById(SecurityInfo securityInfo);

	/**
	 * 分页查询用户信息service接口
	 * @param page
	 * @return
	 * @throw
	 * @return List<SecurityInfo>
	 */
	public List<SecurityInfo> findUserByPage(Page page);

}
