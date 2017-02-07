package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.entity.CivilDispute;
import com.psas.entity.HelpService;
import com.psas.entity.Page;
import com.psas.service.CivilDisputeService;

/**
 * 
 * TODO民事纠纷案件登记表service测试
 * @author  Cunbao Song
 * @data:  2017年2月7日 上午9:34:09
 * @version:  V1.0
 */
public class TestCiviDisputeService {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	CivilDisputeService service;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		service = ac.getBean(CivilDisputeService.BEAN_NAME, CivilDisputeService.class);
	}

	/**
	 * 查找所有用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<CivilDispute> users = service.findAll();
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
		CivilDispute c = new CivilDispute("王旭来", "xxxx", new Timestamp(System.currentTimeMillis()), "xx", "xxx", "xxxx", 1);
		service.add(c);
		
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
		c.setCivilDispute(4);
		service.delete(c);
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
		c.setCivilDispute(5);
		service.update(c);
	}

	/**
	 * 根据id查找用户信息service测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindById() {
		CivilDispute c= new CivilDispute();
		c.setCivilDispute(1);
		CivilDispute c1 = service.findUserById(c);
		System.out.println(c1);
	}

	/**
	 * 分页查询用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindByPage() {
		Page page = new Page(1);
		List<CivilDispute> users = service.findUserByPage(page);
		for (CivilDispute civilDispute : users) {
			System.out.println(civilDispute);
		}
	}

}

