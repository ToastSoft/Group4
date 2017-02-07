package com.psas.service;

import java.util.List;

import com.psas.entity.CivilDispute;
import com.psas.entity.HelpService;
import com.psas.entity.Page;
import com.psas.entity.UserInfo;

/**
 * 
 * TODO 民事纠纷案件登记表service层接口
 * @author  Cunbao Song
 * @data:  2017年2月7日 上午9:28:02
 * @version:  V1.0
 */
public interface CivilDisputeService {
	public static final String BEAN_NAME = "civilDisputeService";

	/**
	 * 查询所有用户信息service接口
	 * @return
	 * @throw
	 * @return List<CivilDispute>
	 */
	public List<CivilDispute> findAll();

	/**
	 * 新增用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void add(CivilDispute civilDispute);

	/**
	 * 删除用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void delete(CivilDispute civilDispute);

	/**
	 * 修改用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void update(CivilDispute civilDispute);

	/**
	 * 根据id查找用户信息service接口
	 * @param user
	 * @return
	 * @throw
	 * @return CivilDispute
	 */
	public CivilDispute findUserById(CivilDispute civilDispute);

	/**
	 * 分页查询用户信息service接口
	 * @param page
	 * @return
	 * @throw
	 * @return List<CivilDispute>
	 */
	public List<CivilDispute> findUserByPage(Page page);

}
