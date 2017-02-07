package com.psas.service;

import java.util.List;

import com.psas.entity.JurisdictionInfo;

/**
 * 权限信息service接口
 * @author  XulaiWang
 * @data:  2017年2月7日 上午9:24:45
 * @version:  V1.0
 */
public interface JurisdictionInfoService {
	public static final String BEAN_NAME = "jurisdictionInfoService";

	/**
	 * 查询所有权限信息service接口
	 * @return
	 * @throw
	 * @return List<JurisdictionInfo>
	 */
	public List<JurisdictionInfo> findAll();

	/**
	 * 新增权限信息service接口
	 * @param jurisdiction
	 * @throw
	 * @return void
	 */
	public void add(JurisdictionInfo jurisdiction);

	/**
	 * 修改权限信息service接口
	 * @param jurisdiction
	 * @throw
	 * @return void
	 */
	public void update(JurisdictionInfo jurisdiction);

	/**
	 * 删除权限信息service接口
	 * @param jurisdiction
	 * @throw
	 * @return void
	 */
	public void delete(JurisdictionInfo jurisdiction);

	/**
	 * 根据id查询权限信息service接口
	 * @param jurisdiction
	 * @return
	 * @throw
	 * @return JurisdictionInfo
	 */
	public JurisdictionInfo findById(JurisdictionInfo jurisdiction);

}
