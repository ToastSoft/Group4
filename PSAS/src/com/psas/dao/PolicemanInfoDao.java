package com.psas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.psas.entity.Page;
import com.psas.entity.PolicemanInfo;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.UserInfo;
import com.psas.entity.VictimInfo;

/**
 * 
 * TODO	警员表dao层接口
 * @author  Cunbao Song
 * @data:  2017年2月9日 下午3:18:13
 * @version:  V1.0
 */
public interface PolicemanInfoDao {
	public static final String BEAN_NAME = "policemanInfoDao";

	/**
	 * 查找所有警员信息 dao接口
	 * @return
	 * @throw
	 * @return List<PolicemanInfo>
	 */
	public List<PolicemanInfo> findAll();

	/**
	 * 新增警员信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void add(@Param("policemanInfo") PolicemanInfo policemanInfo);

	/**
	 * 删除警员信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void delete(@Param("policemanInfo") PolicemanInfo policemanInfo);

	/**
	 * 修改警员信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void update(@Param("policemanInfo") PolicemanInfo policemanInfo);
	
	/**
	 * 根据条件查找警员信息
	 * @param user
	 * @param page
	 * @throw
	 * @return List<PolicemanInfo>
	 */
	public List<PolicemanInfo> findPoliceman(@Param("policemanInfo") PolicemanInfo policemanInfo, @Param("page") Page page);
}
