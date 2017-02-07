package com.psas.service;

import java.util.List;

import com.psas.entity.HelpService;
import com.psas.entity.Page;
import com.psas.entity.UserInfo;

/**
 * 
 * TODO救助服务登记service接口
 * @author  Cunbao Song
 * @data:  2017年2月6日 下午7:22:06
 * @version:  V1.0
 */
public interface HelpServiceService {
	public static final String BEAN_NAME = "helpServiceService";

	/**
	 * 查询所有用户信息service接口
	 * @return
	 * @throw
	 * @return List<HelpService>
	 */
	public List<HelpService> findAll();

	/**
	 * 新增用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void add(HelpService helpService);

	/**
	 * 删除用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void delete(HelpService helpService);

	/**
	 * 修改用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void update(HelpService helpService);

	/**
	 * 根据id查找用户信息service接口
	 * @param user
	 * @return
	 * @throw
	 * @return HelpService
	 */
	public HelpService findUserById(HelpService helpService);

	/**
	 * 分页查询用户信息service接口
	 * @param page
	 * @return
	 * @throw
	 * @return List<HelpService>
	 */
	public List<HelpService> findUserByPage(Page page);

}
