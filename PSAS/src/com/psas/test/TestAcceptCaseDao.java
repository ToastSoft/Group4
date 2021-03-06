package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.AcceptCaseDao;
import com.psas.entity.AcceptCase;
import com.psas.entity.Page;


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
	@Test
	public void testAdd(){
		AcceptCase acceptCase = new AcceptCase();
		acceptCase.setCaseName("余思言强奸案");
		acceptCase.setCasePlace("雨林科技");
		acceptCase.setCaseTime(new Timestamp(System.currentTimeMillis()));
		acceptCase.setPlaceCaseTime(new Timestamp(System.currentTimeMillis()));
		acceptCase.setDeptId(2);
		acceptCase.setPolicemanId(2);
		acceptCase.setPsId(2);
		acceptCase.setAlarmId(2);
		dao.add(acceptCase);
	}
	@Test
	public void testDelete(){
		AcceptCase acceptCase = new AcceptCase();
		acceptCase.setCaseId(3);
		dao.delete(acceptCase);
	}
	@Test
	public void testFindCase(){
		Page page = new Page(1);
		List<AcceptCase> acceptCase = dao.findCase(null, page);
		for (AcceptCase acceptCase2 : acceptCase) {
			System.out.println(acceptCase2);
		}
	}
	@Test
	public void testFindCase1(){
		AcceptCase acceptCase = new AcceptCase();
		acceptCase.setCaseId(1);
		List<AcceptCase> acceptCases = dao.findCase(acceptCase, null);
		for (AcceptCase acceptCase2 : acceptCases) {
			System.out.println(acceptCase2);
		}
	}

}
