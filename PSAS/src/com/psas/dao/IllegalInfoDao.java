package com.psas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.psas.entity.IllegalInfo;
import com.psas.entity.Page;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.UserInfo;
import com.psas.entity.VictimInfo;

/**
 * 
 * TODO 违法人员信息表
 * @author  Cunbao Song
 * @data:  2017年2月9日 下午2:18:55
 * @version:  V1.0
 */
public interface IllegalInfoDao {
	public static final String BEAN_NAME = "illegalInfoDao";

	/**
	 * 查找所有用户信息 dao接口
	 * @return
	 * @throw
	 * @return List<VictimInfo>
	 */
	public List<IllegalInfo> findAll();

	/**
	 * 新增用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void add(@Param("illegalInfo") IllegalInfo illegalInfo);

	/**
	 * 删除用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void delete(@Param("illegalInfo") IllegalInfo illegalInfo);

	/**
	 * 修改用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void update(@Param("illegalInfo") IllegalInfo illegalInfo);
	
	/**
	 * 根据条件查找用户信息
	 * @param user
	 * @param page
	 * @throw
	 * @return List<IllegalInfo>
	 */
	public List<IllegalInfo> findUser(@Param("illegalInfo") IllegalInfo illegalInfo, @Param("page") Page page);
}
