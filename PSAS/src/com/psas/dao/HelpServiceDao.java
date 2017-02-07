package com.psas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.psas.entity.HelpService;
import com.psas.entity.Page;
import com.psas.entity.SecurityInfo;

/**
 * 
 * TODO治安案件登记表的dao层接口
 * @author  Cunbao Song
 * @data:  2017年2月6日 上午10:26:57
 * @version:  V1.0
 */
public interface HelpServiceDao {
	public static final String BEAN_NAME = "helpServiceDao";

	/**
	 * 查找所有用户信息 dao接口
	 * @return
	 * @throw
	 * @return List<UserInfo>
	 */
	public List<HelpService> findAll();

	/**
	 * 新增用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void add(@Param("helpService") HelpService helpSecurity);

	/**
	 * 删除用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void delete(@Param("helpService") HelpService helpSecurity);

	/**
	 * 修改用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void update(@Param("helpService") HelpService helpSecurity);
	
	/**
	 * 根据条件查找用户信息
	 * @param user
	 * @param page
	 * @throw
	 * @return void
	 */
	public List<HelpService> findUser(@Param("helpService") HelpService helpSecurity, @Param("page") Page page);
}
