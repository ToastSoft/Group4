package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.DeptDao;
import com.psas.dao.OtherCaseDao;
import com.psas.entity.CivilDispute;
import com.psas.entity.Dept;
import com.psas.entity.OtherCase;
import com.psas.entity.Page;
import com.psas.service.DeptService;

/**
 * 
 * TODO 部门信息service层测试
 * @author  Cunbao Song
 * @data:  2017年2月10日 上午10:05:25
 * @version:  V1.0
 */
public class TestDeptService {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	DeptService service;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		service = ac.getBean(DeptService.BEAN_NAME, DeptService.class);
	}

	/**
	 * 查找所有用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<Dept> users = service.findAll();
		for (Dept dept : users) {
			System.out.println(dept);
		}
		
	}

	/**
	 * 新增用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testAdd() {
		Dept d = new Dept("xx");
		service.add(d);
		
	}

	/**
	 * 删除用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		Dept d = new Dept();
		d.setDeptId(7);
		service.delete(d);
	}

	/**
	 * 修改其它用户信息
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate() {
		Dept d = new Dept("zz");
		d.setDeptId(8);
		service.update(d);
	}

	/**
	 * 根据id查找用户信息service测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDeptById() {
		Dept d = new Dept();
		d.setDeptId(1);
		Dept d1 = service.findDeptById(d);
		System.out.println(d1);
	}

	/**
	 * 分页查询用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDeptByPage() {
		Page page = new Page(1);
		List<Dept> p = service.findDeptByPage(page);
		for (Dept dept : p) {
			System.out.println(dept);
		}
	}

}

