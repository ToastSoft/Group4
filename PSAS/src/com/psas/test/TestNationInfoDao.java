package com.psas.test;

import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.NationInfoDao;
import com.psas.entity.NationInfo;

public class TestNationInfoDao {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	NationInfoDao dao;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		dao = ac.getBean(NationInfoDao.BEAN_NAME, NationInfoDao.class);
	}

	/**
	 * 查询所有民族信息dao单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<NationInfo> nations = dao.findAll();
		for (NationInfo n : nations) {
			System.out.println(n);
		}
	}

	/**
	 * 根据民族id查找民族信息dao单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindById() {
		NationInfo nation = new NationInfo(54);
		NationInfo n = dao.findNationInfoById(nation);
		System.out.println(n);
	}
}
