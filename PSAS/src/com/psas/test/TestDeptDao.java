package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.DeptDao;
import com.psas.dao.OtherCaseDao;
import com.psas.entity.Dept;
import com.psas.entity.OtherCase;
import com.psas.entity.Page;

/**
 * 
 * TODO 部门表dao层测试
 * @author  Cunbao Song
 * @data:  2017年2月10日 上午9:48:50
 * @version:  V1.0
 */
public class TestDeptDao {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	DeptDao dao;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		dao = ac.getBean(DeptDao.BEAN_NAME, DeptDao.class);
	}

	/**
	 * 查找所有用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<Dept> users = dao.findAll();
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
		dao.add(d);
		
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
		d.setDeptId(6);
		dao.delete(d);
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
		d.setDeptId(7);
		dao.update(d);
	}

	/**
	 * 分页查询用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindUserByPage() {
		Dept d = new Dept();
		d.setDeptId(1);
		Page page = new Page(1);
		List<Dept> d1 = dao.findDept(d, page);
		System.out.println(d1);
		
	}

}

