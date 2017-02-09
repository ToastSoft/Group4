package com.psas.service;

import java.util.List;

import com.psas.entity.Page;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.SuspectInfo;
import com.psas.entity.UserInfo;

/**
 * 
 * TODO嫌疑人信息表 service层接口
 * @author  Cunbao Song
 * @data:  2017年2月7日 下午4:34:31
 * @version:  V1.0
 */
public interface SuspectInfoService {
	public static final String BEAN_NAME = "suspectInfoService";

	/**
	 * 查询所有用户信息service接口
	 * @return
	 * @throw
	 * @return List<SuspectInfo>
	 */
	public List<SuspectInfo> findAll();

	/**
	 * 新增用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void add(SuspectInfo suspectInfo);

	/**
	 * 删除用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void delete(SuspectInfo suspectInfo);

	/**
	 * 修改用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void update(SuspectInfo suspectInfo);

	/**
	 * 根据id查找用户信息service接口
	 * @param user
	 * @return
	 * @throw
	 * @return PunishmentInfo
	 */
	public SuspectInfo findUserById(SuspectInfo suspectInfo);

	/**
	 * 分页查询用户信息service接口
	 * @param page
	 * @return
	 * @throw
	 * @return List<SuspectInfo>
	 */
	public List<SuspectInfo> findUserByPage(Page page);

}
