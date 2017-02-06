package com.psas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.psas.entity.CitizenInfo;
import com.psas.entity.Page;

/**
 * 公民信息dao 接口
 * @author  XulaiWang
 * @data:  2017年2月5日 上午8:58:51
 * @version:  V1.0
 */
public interface CitizenInfoDao {
	public static final String BEAN_NAME = "citizenInfoDao";

	/**
	 * 查找所有公民信息
	 * @return
	 * @throw
	 * @return List<CitizenInfo>
	 */
	public List<CitizenInfo> findAll();

	/**
	 * 新增公民信息
	 * @param citizen
	 * @throw
	 * @return void
	 */
	public void add(@Param("citizen") CitizenInfo citizen);

	/**
	 * 删除公民信息
	 * @param citizen
	 * @throw
	 * @return void
	 */
	public void delete(@Param("citizen") CitizenInfo citizen);

	/**
	 * 修改公民信息
	 * @param citizen
	 * @throw
	 * @return void
	 */
	public void update(@Param("citizen") CitizenInfo citizen);

	/**
	 * 根据公民条件查找公民信息
	 * @param citizen
	 * @param page
	 * @return
	 * @throw
	 * @return List<CitizenInfo>
	 */
	public List<CitizenInfo> findCitizen(@Param("citizen") CitizenInfo citizen, @Param("page") Page page);

}
