package com.psas.service;

import java.util.List;

import com.psas.entity.IllegalInfo;
import com.psas.entity.Page;

/**
 * 
 * TODO 违法人员信息表service层接口
 * @author  Cunbao Song
 * @data:  2017年2月9日 下午2:34:48
 * @version:  V1.0
 */
public interface IllegalInfoService {
	public static final String BEAN_NAME = "illegalInfoService";

	/**
	 * 查询所有用户信息service接口
	 * @return
	 * @throw
	 * @return List<IllegalInfo>
	 */
	public List<IllegalInfo> findAll();

	/**
	 * 新增用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void add(IllegalInfo illegalInfo);

	/**
	 * 删除用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void delete(IllegalInfo illegalInfo);

	/**
	 * 修改用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void update(IllegalInfo illegalInfo);

	/**
	 * 根据id查找用户信息service接口
	 * @param user
	 * @return
	 * @throw
	 * @return VictimInfo
	 */
	public IllegalInfo findUserById(IllegalInfo illegalInfo);

	/**
	 * 分页查询用户信息service接口
	 * @param page
	 * @return
	 * @throw
	 * @return List<IllegalInfo>
	 */
	public List<IllegalInfo> findUserByPage(Page page);

}
