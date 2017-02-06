package com.psas.service;

import java.util.List;

import com.psas.entity.CitizenInfo;
import com.psas.entity.Page;

/**
 * 公民信息service接口
 * @author  XulaiWang
 * @data:  2017年2月6日 上午10:16:19
 * @version:  V1.0
 */
public interface CitizenInfoService {
	public static final String BEAN_NAME = "citizenInfoService";

	/**
	 * 查找所有公民信息service接口
	 * @return
	 * @throw
	 * @return List<CitizenInfo>
	 */
	public List<CitizenInfo> findAll();

	/**
	 * 新增公民信息service接口
	 * @param citizen
	 * @throw
	 * @return void
	 */
	public void add(CitizenInfo citizen);

	/**
	 * 删除公民信息service接口
	 * @param citizen
	 * @throw
	 * @return void
	 */
	public void delete(CitizenInfo citizen);

	/**
	 * 修改公民信息service接口
	 * @param citizen
	 * @throw
	 * @return void
	 */
	public void update(CitizenInfo citizen);

	/**
	 * 根据身份证查找公民信息service接口
	 * @param citizen
	 * @throw
	 * @return CitizenInfo
	 */
	public CitizenInfo findById(CitizenInfo citizen);

/**
 * 根据姓名查找公民信息service接口
 * @param citizen
 * @return
 * @throw
 * @return List<CitizenInfo>
 */
	public List<CitizenInfo> findByName(CitizenInfo citizen);

/**
 * 根据民族查询公民信息service接口
 * @param citizen
 * @return
 * @throw
 * @return List<CitizenInfo>
 */
	public List<CitizenInfo> findByNation(CitizenInfo citizen);
/**
 * 分页查询公民信息service接口
 * @param page
 * @return
 * @throw
 * @return List<CitizenInfo>
 */

	public List<CitizenInfo> findByPage(Page page);

}
