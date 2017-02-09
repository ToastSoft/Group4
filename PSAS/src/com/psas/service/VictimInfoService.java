package com.psas.service;

import java.util.List;

import com.psas.entity.Page;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.UserInfo;
import com.psas.entity.VictimInfo;

/**
 * 
 * TODO受害人信息表service层
 * @author  Cunbao Song
 * @data:  2017年2月9日 上午9:44:46
 * @version:  V1.0
 */
public interface VictimInfoService {
	public static final String BEAN_NAME = "victimInfoService";

	/**
	 * 查询所有用户信息service接口
	 * @return
	 * @throw
	 * @return List<VictimInfo>
	 */
	public List<VictimInfo> findAll();

	/**
	 * 新增用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void add(VictimInfo victimInfo);

	/**
	 * 删除用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void delete(VictimInfo victimInfo);

	/**
	 * 修改用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void update(VictimInfo victimInfo);

	/**
	 * 根据id查找用户信息service接口
	 * @param user
	 * @return
	 * @throw
	 * @return VictimInfo
	 */
	public VictimInfo findUserById(VictimInfo victimInfo);

	/**
	 * 分页查询用户信息service接口
	 * @param page
	 * @return
	 * @throw
	 * @return List<VictimInfo>
	 */
	public List<VictimInfo> findUserByPage(Page page);

}
