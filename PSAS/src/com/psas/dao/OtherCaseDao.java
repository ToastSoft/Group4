package com.psas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.psas.entity.OtherCase;
import com.psas.entity.Page;
import com.psas.entity.UserInfo;

/**
 * 
 * TODO 其他案件登记表dao层
 * @author  Cunbao Song
 * @data:  2017年2月7日 下午2:21:56
 * @version:  V1.0
 */
public interface OtherCaseDao {
	public static final String BEAN_NAME = "otherCaseDao";

	/**
	 * 查找所有用户信息 dao接口
	 * @return
	 * @throw
	 * @return List<OtherCase>
	 */
	public List<OtherCase> findAll();

	/**
	 * 新增用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void add(@Param("otherCase") OtherCase otherCase);

	/**
	 * 删除用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void delete(@Param("otherCase") OtherCase otherCase);

	/**
	 * 修改用户信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void update(@Param("otherCase") OtherCase otherCase);

	/**
	 * 根据条件查找用户信息
	 * @param user
	 * @param page
	 * @throw
	 * @return void
	 */
	public List<OtherCase> findUser(@Param("otherCase") OtherCase otherCase, @Param("page") Page page);
}
