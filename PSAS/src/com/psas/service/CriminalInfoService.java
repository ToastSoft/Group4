package com.psas.service;

import java.util.List;

import com.psas.entity.CriminalInfo;
import com.psas.entity.Page;

/**
 * 
 * TODO 刑事案件登记表service接口
 * @author  Cunbao Song
 * @data:  2017年2月6日 下午1:33:47
 * @version:  V1.0
 */
public interface CriminalInfoService {
	public static final String BEAN_NAME = "criminalInfoService";

	/**
	 * 查询所有用户信息service接口
	 * @return
	 * @throw
	 * @return List<CriminalInfo>
	 */
	public List<CriminalInfo> findAll();

	/**
	 * 新增用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void add(CriminalInfo criminalInfo);

	/**
	 * 删除用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void delete(CriminalInfo criminalInfo);

	/**
	 * 修改用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void update(CriminalInfo criminalInfo);

	/**
	 * 根据id查找用户信息service接口
	 * @param user
	 * @return
	 * @throw
	 * @return CriminalInfo
	 */
	public CriminalInfo findUserById(CriminalInfo criminalInfo);

	/**
	 * 分页查询用户信息service接口
	 * @param page
	 * @return
	 * @throw
	 * @return List<CriminalInfo>
	 */
	public List<CriminalInfo> findUserByPage(Page page);

}
