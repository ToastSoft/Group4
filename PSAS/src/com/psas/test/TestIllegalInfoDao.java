package com.psas.test;

import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.IllegalInfoDao;
import com.psas.entity.IllegalInfo;
import com.psas.entity.Page;

/**
 * 
 * TODO 违反人员信息表dao层测试
 * @author  Cunbao Song
 * @data:  2017年2月9日 下午2:26:07
 * @version:  V1.0
 */
public class TestIllegalInfoDao {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	IllegalInfoDao dao;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		dao = ac.getBean(IllegalInfoDao.BEAN_NAME, IllegalInfoDao.class);
	}

	/**
	 * 查找所有用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<IllegalInfo> users = dao.findAll();
		for (IllegalInfo illegalInfo : users) {
			System.out.println(illegalInfo);
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
		IllegalInfo i = new IllegalInfo();
		i.setCaseId(1);
		i.setIdCard("210203199304121831");
		dao.add(i);
		
	}

	/**
	 * 删除用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		
		IllegalInfo i = new IllegalInfo();
		i.setIllegalId(4);
		dao.delete(i);
	}

	/**
	 * 修改其它用户信息
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate() {
		IllegalInfo i = new IllegalInfo();
		i.setCaseId(2);
		i.setIdCard("210203199304121831");
		i.setIllegalId(5);
		dao.update(i);
	}

	/**
	 * 分页查询用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindUserByPage() {
		Page page = new Page(1);
		List<IllegalInfo> users = dao.findUser(null, page);
		for (IllegalInfo illegalInfo : users) {
			System.out.println(illegalInfo);
		}
		
	}

}

