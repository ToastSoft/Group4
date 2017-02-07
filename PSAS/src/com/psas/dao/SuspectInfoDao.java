package com.psas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.psas.entity.Page;
import com.psas.entity.SuspectInfo;
import com.psas.entity.UserInfo;

/**
 * 
 * TODO嫌疑人信息表dao层接口
 * @author  Cunbao Song
 * @data:  2017年2月7日 下午3:36:53
 * @version:  V1.0
 */
public interface SuspectInfoDao {
	public static final String BEAN_NAME = "suspectInfoDao";

	/**
	 * 查找所有用户信息 dao接口
	 * @return
	 * @throw
	 * @return List<SuspectInfo>
	 */
	public List<SuspectInfo> findAll();

	/**
	 * 新增用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void add(@Param("suspectInfo") SuspectInfo suspectInfo);

	/**
	 * 删除用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void delete(@Param("suspectInfo") SuspectInfo suspectInfo);

	/**
	 * 修改用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void update(@Param("suspectInfo") SuspectInfo suspectInfo);

	/**
	 * 根据条件查找用户信息
	 * @param user
	 * @param page
	 * @throw
	 * @return List<SuspectInfo>
	 */
	public List<SuspectInfo> findUser(@Param("suspectInfo") SuspectInfo suspectInfo, @Param("page") Page page);
}
