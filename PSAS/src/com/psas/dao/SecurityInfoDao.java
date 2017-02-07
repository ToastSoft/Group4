package com.psas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.psas.entity.Page;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.SecurityInfo;
import com.psas.entity.UserInfo;

/**
 * 
 * TODO治安案件登记表的dao层接口
 * @author  Cunbao Song
 * @data:  2017年2月6日 上午10:26:57
 * @version:  V1.0
 */
public interface SecurityInfoDao {
	public static final String BEAN_NAME = "securityInfoDao";

	/**
	 * 查找所有用户信息 dao接口
	 * @return
	 * @throw
	 * @return List<UserInfo>
	 */
	public List<SecurityInfo> findAll();

	/**
	 * 新增用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void add(@Param("security") SecurityInfo security);

	/**
	 * 删除用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void delete(@Param("security") SecurityInfo security);

	/**
	 * 修改用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void update(@Param("security") SecurityInfo security);
	
	/**
	 * 根据条件查找用户信息
	 * @param user
	 * @param page
	 * @throw
	 * @return void
	 */
	public List<SecurityInfo> findUser(@Param("security") SecurityInfo security, @Param("page") Page page);
}
