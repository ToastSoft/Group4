package com.psas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.psas.entity.CriminalInfo;
import com.psas.entity.Page;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.SecurityInfo;
import com.psas.entity.UserInfo;

/**
 * 
 * TODO 刑事案件登记表的dao层接口
 * @author  Cunbao Song
 * @data:  2017年2月6日 上午10:54:54
 * @version:  V1.0
 */
public interface CriminalInfoDao {
	public static final String BEAN_NAME = "criminalInfoDao";

	/**
	 * 查找所有用户信息 dao接口
	 * @return
	 * @throw
	 * @return List<UserInfo>
	 */
	public List<CriminalInfo> findAll();

	/**
	 * 新增用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void add(@Param("criminal") CriminalInfo criminal);

	/**
	 * 删除用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void delete(@Param("criminal") CriminalInfo criminal);

	/**
	 * 修改用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void update(@Param("criminal") CriminalInfo criminal);
	
	/**
	 * 根据条件查找用户信息
	 * @param user
	 * @param page
	 * @throw
	 * @return void
	 */
	public List<CriminalInfo> findUser(@Param("criminal") CriminalInfo criminal, @Param("page") Page page);
}
