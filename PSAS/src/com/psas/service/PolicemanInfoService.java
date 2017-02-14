package com.psas.service;

import java.util.List;

import com.psas.entity.HelpService;
import com.psas.entity.Page;
import com.psas.entity.PolicemanInfo;
import com.psas.entity.UserInfo;

/**
 * 
 * TODO 警员信息service层接口
 * @author  Cunbao Song
 * @data:  2017年2月9日 下午4:35:10
 * @version:  V1.0
 */
public interface PolicemanInfoService {
	public static final String BEAN_NAME = "policemanInfoService";

	/**
	 * 查询所有警员信息service接口
	 * @return
	 * @throw
	 * @return List<PolicemanInfo>
	 */
	public List<PolicemanInfo> findAll();

	/**
	 * 新增警员信息service接口
	 * @param policemanInfo
	 * @throw
	 * @return void
	 */
	public void add(PolicemanInfo policemanInfo);

	/**
	 * 删除警员信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void delete(PolicemanInfo policemanInfo);

	/**
	 * 修改警员信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void update(PolicemanInfo policemanInfo);

	/**
	 * 根据id查找用户信息service接口
	 * @param user
	 * @return
	 * @throw
	 * @return PolicemanInfo
	 */
	public PolicemanInfo findPolicemanById(PolicemanInfo policemanInfo);

	/**
	 * 分页查询警员信息service接口
	 * @param page
	 * @return
	 * @throw
	 * @return List<PolicemanInfo>
	 */
	public List<PolicemanInfo> findPolicemanByPage(Page page);

}
