package com.psas.test;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.LogInfoDao;

/**
 * MyBatis单元测试
 * 
 * @author XulaiWang
 * @data: 2017年1月14日 上午9:48:30
 * @version: V1.0
 */
public class TestMyBatis {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
	}

	@Test
	public void testMyBatis() {
		LogInfoDao logInfoDao = ac.getBean(LogInfoDao.BEAN_NAME, LogInfoDao.class);
		System.out.println(logInfoDao);
	}

}
