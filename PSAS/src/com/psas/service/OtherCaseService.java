package com.psas.service;

import java.util.List;

import com.psas.entity.OtherCase;
import com.psas.entity.Page;
import com.psas.entity.UserInfo;
/**
 * 
 * TODO其他案件登记表service层接口
 * @author  Cunbao Song
 * @data:  2017年2月7日 下午3:10:14
 * @version:  V1.0
 */
public interface OtherCaseService {
	public static final String BEAN_NAME = "otherCaseService";

	/**
	 * 查询所有用户信息service接口
	 * @return
	 * @throw
	 * @return List<OtherCase>
	 */
	public List<OtherCase> findAll();

	/**
	 * 新增用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void add(OtherCase otherCase);

	/**
	 * 删除用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void delete(OtherCase otherCase);

	/**
	 * 修改用户信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void update(OtherCase otherCase);

	/**
	 * 根据id查找用户信息service接口
	 * @param user
	 * @return
	 * @throw
	 * @return OtherCase
	 */
	public OtherCase findUserById(OtherCase otherCase);

	/**
	 * 分页查询用户信息service接口
	 * @param page
	 * @return
	 * @throw
	 * @return List<OtherCase>
	 */
	public List<OtherCase> findUserByPage(Page page);

}
