package com.psas.service;

import java.util.List;

import com.psas.entity.Page;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.UserInfo;

/**
 * 用户信息service接口
 * @author  XulaiWang
 * @data:  2017年1月24日 下午1:05:12
 * @version:  V1.0
 */
public interface PunishmentInfoService {
	public static final String BEAN_NAME = "punishmentInfoService";

	/**
	 * 查询所有用户信息service接口
	 * @return
	 * @throw
	 * @return List<UserInfo>
	 */
	public List<PunishmentInfo> findAll();

	/**
	 * 新增用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void add(PunishmentInfo punishment);

	/**
	 * 删除用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void delete(PunishmentInfo punishment);

	/**
	 * 修改用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void update(PunishmentInfo punishment);

	/**
	 * 根据id查找用户信息service接口
	 * @param user
	 * @return
	 * @throw
	 * @return UserInfo
	 */
	public PunishmentInfo findUserById(PunishmentInfo punishment);

	/**
	 * 分页查询用户信息service接口
	 * @param page
	 * @return
	 * @throw
	 * @return List<UserInfo>
	 */
	public List<PunishmentInfo> findUserByPage(Page page);

}
