package com.psas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.psas.entity.AcceptCase;
import com.psas.entity.Page;


public interface AcceptCaseDao {
	public static final String BEAN_NAME="acceptCaseDao";
	/**
	 * 查找所有接受案件回执表信息dao接口
	 * @throw
	 * @return List<AcceptCase>
	 */
	public List<AcceptCase> findAll();
	/**
	 * 增加接受案件回执表信息dao接口
	 * @param acceptCase
	 * @throw
	 * @return void
	 */
	public void add(AcceptCase acceptCase);
	/**
	 * 删除接受案件回执表信息dao接口
	 * @param acceptCase
	 * @throw
	 * @return void
	 */
	public void delete(AcceptCase acceptCase);
	/**
	 * 修改接受案件回执表信息dao接口
	 * @param acceptCase
	 * @throw
	 * @return void
	 */
	public void update(AcceptCase acceptCase);
	/**
	 * 根据条件查询接受案件回执表信息dao接口
	 * @param acceptCase
	 * @param page
	 * @throw
	 * @return void
	 */
	public List<AcceptCase> findCase(@Param("acceptCase")AcceptCase acceptCase,@Param("page")Page page);
}
