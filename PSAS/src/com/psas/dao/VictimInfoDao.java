package com.psas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.psas.entity.Page;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.UserInfo;
import com.psas.entity.VictimInfo;

/**
 * 
 * TODO	受害人信息表
 * @author  Cunbao Song
 * @data:  2017年2月9日 上午8:53:48
 * @version:  V1.0
 */
public interface VictimInfoDao {
	public static final String BEAN_NAME = "victimInfoDao";

	/**
	 * 查找所有用户信息 dao接口
	 * @return
	 * @throw
	 * @return List<VictimInfo>
	 */
	public List<VictimInfo> findAll();

	/**
	 * 新增用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void add(@Param("victimInfo") VictimInfo victimInfo);

	/**
	 * 删除用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void delete(@Param("victimInfo") VictimInfo victimInfo);

	/**
	 * 修改用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void update(@Param("victimInfo") VictimInfo victimInfo);
	
	/**
	 * 根据条件查找用户信息
	 * @param user
	 * @param page
	 * @throw
	 * @return List<VictimInfo>
	 */
	public List<VictimInfo> findUser(@Param("victimInfo") VictimInfo victimInfo, @Param("page") Page page);
}
