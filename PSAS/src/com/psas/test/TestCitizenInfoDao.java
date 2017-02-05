package com.psas.test;

import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.CitizenInfoDao;
import com.psas.dao.LogInfoDao;
import com.psas.entity.CitizenInfo;

public class TestCitizenInfoDao {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	CitizenInfoDao dao;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		dao = ac.getBean(CitizenInfoDao.BEAN_NAME,CitizenInfoDao.class);
	}
	@Test
	public void testFindAll(){
		List<CitizenInfo> citizens = dao.findAll();
		for (CitizenInfo c : citizens) {
			System.out.println(c);
		}
	}
}
