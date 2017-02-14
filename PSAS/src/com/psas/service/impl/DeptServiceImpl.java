package com.psas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.psas.dao.DeptDao;
import com.psas.entity.Dept;
import com.psas.entity.Page;
import com.psas.service.DeptService;

/**
 * 
 * TODO受害人信息表service层 实现
 * @author  Cunbao Song
 * @data:  2017年2月9日 上午9:47:58
 * @version:  V1.0
 */
@Service("deptService")
public class DeptServiceImpl implements DeptService {
	@Resource(name = DeptDao.BEAN_NAME)
	private DeptDao dao;

	/**
	 * 查询所有部门信息service实现
	 * 重载方法
	 * @return List<Dept>
	 */
	@Override
	public List<Dept> findAll() {
		return dao.findAll();
	}

	/**
	 * 新增部门信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void add(Dept dept) {
		dao.add(dept);
	}

	/**
	 * 删除部门信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void delete(Dept dept) {
		dao.delete(dept);
	}

	/**
	 * 修改部门信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void update(Dept dept) {
		dao.update(dept);
	}

	/**
	 * 根据用户id查找部门信息service实现
	 * 重载方法
	 * @param user
	 * @return Dept
	 */
	@Override
	public Dept findDeptById(Dept dept) {
		List<Dept> u = dao.findDept(dept, null);
		if (u.size() == 1) {
			return u.get(0);
		}
		return null;
	}

	/**
	 * 分页查询部门信息service实现
	 * 重载方法
	 * @param page
	 * @return List<IllegalInfo>
	 */
	@Override
	public List<Dept> findDeptByPage(Page page) {
		return dao.findDept(null, page);
	}

	public DeptDao getDao() {
		return dao;
	}

	public void setDao(DeptDao dao) {
		this.dao = dao;
	}

	

	

	

	

}
