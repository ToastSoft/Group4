package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.CivilDisputeDao;
import com.psas.dao.HelpServiceDao;
import com.psas.entity.CivilDispute;
import com.psas.entity.HelpService;
import com.psas.entity.Page;
import com.psas.entity.SecurityInfo;

/**
 * 
 * TODO 民事纠纷案件登记表dao层测试
 * @author  Cunbao Song
 * @data:  2017年2月7日 上午8:56:53
 * @version:  V1.0
 */
public class TestCivilDisputeDao {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	CivilDisputeDao dao;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		dao = ac.getBean(CivilDisputeDao.BEAN_NAME, CivilDisputeDao.class);
	}

	/**
	 * 查找所有用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		 List<CivilDispute> users = dao.findAll();
		for (CivilDispute civilDispute : users) {
			System.out.println(civilDispute);
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
	CivilDispute c = new CivilDispute("xxx", "xxxx", new Timestamp(System.currentTimeMillis()), "xx", "xxx", "xxxx", 1);
	dao.add(c);
		
	}

	/**
	 * 删除用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		CivilDispute c = new CivilDispute();
		c.setCivilDispute(3);
		dao.delete(c);
	}

	/**
	 * 修改其它用户信息
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate() {
		CivilDispute c = new CivilDispute("xxxxxxx", "xxxx", new Timestamp(System.currentTimeMillis()), "xx", "xxx", "xxxx", 1);
		c.setCivilDispute(4);
		dao.update(c);
	}

	/**
	 * 分页查询用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindUserByPage() {
		CivilDispute c = new CivilDispute();
		c.setCivilDispute(1);
		Page page = new Page(1);
		List<CivilDispute> users = dao.findUser(c, page);
		for (CivilDispute civilDispute : users) {
			System.out.println(civilDispute);
		}
		
	}

}

