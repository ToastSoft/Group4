package com.psas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.psas.entity.Dept;
import com.psas.entity.Page;
import com.psas.entity.PolicemanInfo;
import com.psas.entity.PublicSecurity;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.UserInfo;
import com.psas.entity.VictimInfo;

/**
 * 
 * TODO 部门信息表
 * @author  Cunbao Song
 * @data:  2017年2月10日 上午9:35:42
 * @version:  V1.0
 */
public interface DeptDao {
	public static final String BEAN_NAME = "deptDao";

	/**
	 * 查找所有部门信息 dao接口
	 * @return
	 * @throw
	 * @return List<Dept>
	 */
	public List<Dept> findAll();

	/**
	 * 新增警局信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void add(@Param("dept") Dept dept);

	/**
	 * 删除警局信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void delete(@Param("dept") Dept publicSecurity);

	/**
	 * 修改警局信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void update(@Param("dept") Dept publicSecurity);
	
	/**
	 * 根据条件查找警局信息
	 * @param user
	 * @param page
	 * @throw
	 * @return List<Dept>
	 */
	public List<Dept> findDept(@Param("dept") Dept publicSecurity, @Param("page") Page page);
}
