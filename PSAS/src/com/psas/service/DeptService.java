package com.psas.service;

import java.util.List;

import com.psas.entity.Dept;
import com.psas.entity.OtherCase;
import com.psas.entity.Page;

/**
 * 
 * TODO 部门信息service 接口
 * @author  Cunbao Song
 * @data:  2017年2月10日 上午9:57:38
 * @version:  V1.0
 */
public interface DeptService {
	public static final String BEAN_NAME = "deptService";

	/**
	 * 查询所有部门信息service接口
	 * @return
	 * @throw
	 * @return List<Dept>
	 */
	public List<Dept> findAll();

	/**
	 * 新增部门信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void add(Dept dept);

	/**
	 * 删除部门信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void delete(Dept dept);

	/**
	 * 修改部门信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void update(Dept dept);

	/**
	 * 根据id查找部门信息service接口
	 * @param user
	 * @return
	 * @throw
	 * @return Dept
	 */
	public Dept findDeptById(Dept dept);

	/**
	 * 分页查询部门信息service接口
	 * @param page
	 * @return
	 * @throw
	 * @return List<Dept>
	 */
	public List<Dept> findDeptByPage(Page page);

}
