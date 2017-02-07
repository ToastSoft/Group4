package com.psas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.psas.entity.CivilDispute;
import com.psas.entity.HelpService;
import com.psas.entity.Page;
import com.psas.entity.SecurityInfo;

/**
 * 
 * TODO民事纠纷案件登记表
 * @author  Cunbao Song
 * @data:  2017年2月7日 上午8:48:43
 * @version:  V1.0
 */
public interface CivilDisputeDao {
	public static final String BEAN_NAME = "civilDisputeDao";

	/**
	 * 查找所有用户信息 dao接口
	 * @return
	 * @throw
	 * @return List<CivilDispute>
	 */
	public List<CivilDispute> findAll();

	/**
	 * 新增用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void add(@Param("civilDispute") CivilDispute civilDispute);

	/**
	 * 删除用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void delete(@Param("civilDispute") CivilDispute civilDispute);

	/**
	 * 修改用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void update(@Param("civilDispute") CivilDispute civilDispute);
	
	/**
	 * 根据条件查找用户信息
	 * @param user
	 * @param page
	 * @throw
	 * @return void
	 */
	public List<CivilDispute> findUser(@Param("civilDispute") CivilDispute civilDispute, @Param("page") Page page);
}
