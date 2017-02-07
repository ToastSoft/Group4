package com.psas.test;

import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.AcceptCaseDao;
import com.psas.entity.AcceptCase;


public class TestAcceptCaseDao {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	AcceptCaseDao dao;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		dao = ac.getBean(AcceptCaseDao.BEAN_NAME,AcceptCaseDao.class);
	}
	@Test
	public void testFindAll(){
		List<AcceptCase> cl=dao.findAll();
		for (AcceptCase acceptCase : cl) {
			System.out.println(acceptCase);
		}
		
	}
	
}
