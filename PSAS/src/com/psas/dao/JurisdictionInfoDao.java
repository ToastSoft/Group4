package com.psas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.psas.entity.JurisdictionInfo;

/**
 * 权限信息dao接口
 * @author  XulaiWang
 * @data:  2017年2月7日 上午8:56:49
 * @version:  V1.0
 */
public interface JurisdictionInfoDao {
	public static final String BEAN_NAME = "jurisdictionInfoDao";

	/**
	 * 查询所有权限信息dao接口
	 * @return
	 * @throw
	 * @return List<JurisdictionInfo>
	 */
	public List<JurisdictionInfo> findAll();

	/**
	 * 增加权限信息dao接口
	 * @param jurisdiction
	 * @throw
	 * @return void
	 */
	public void add(@Param("jurisdiction")JurisdictionInfo jurisdiction);

	/**
	 * 删除权限信息dao接口
	 * @param jurisdiction
	 * @throw
	 * @return void
	 */
	public void delete(@Param("jurisdiction")JurisdictionInfo jurisdiction);

	/**
	 * 修改权限信息dao接口
	 * @param jurisdiction
	 * @throw
	 * @return void
	 */
	public void update(@Param("jurisdiction")JurisdictionInfo jurisdiction);

	/**
	 * 根据id查询权限信息dao接口
	 * @param jurisdiction
	 * @return
	 * @throw
	 * @return JurisdictionInfo
	 */
	public JurisdictionInfo findById(@Param("jurisdiction")JurisdictionInfo jurisdiction);

}
