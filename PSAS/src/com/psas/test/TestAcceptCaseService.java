package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.entity.AcceptCase;
import com.psas.entity.Page;
import com.psas.service.AcceptCaseService;

public class TestAcceptCaseService {
	ClassPathXmlApplicationContext ac;
	String conf="applicationContext.xml";
	AcceptCaseService service;
	
	static{
		PropertyConfigurator.configure("log/log4j.properties");
	}
	
	@Before
	public void init(){
		ac = new ClassPathXmlApplicationContext(conf);
		service = ac.getBean(AcceptCaseService.BEAN_NAME,AcceptCaseService.class);
	}
	@Test
	public void testFindAll(){
		List<AcceptCase> acceptCases = service.findAll();
		for (AcceptCase acceptCase : acceptCases) {
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
		service.add(acceptCase);
	}
	@Test
	public void testDelete(){
		AcceptCase acceptCase = new AcceptCase();
		acceptCase.setCaseId(3);
		service.delete(acceptCase);
	}
	@Test
	public void testFindCase(){
		Page page = new Page(1);
		List<AcceptCase> acceptCase = service.findByPage(page);
		for (AcceptCase acceptCase2 : acceptCase) {
			System.out.println(acceptCase2);
		}
	}
	@Test
	public void testFindCase1(){
		AcceptCase acceptCase = new AcceptCase();
		acceptCase.setCaseId(1);
		List<AcceptCase> acceptCases = service.findById(acceptCase);
		for (AcceptCase acceptCase2 : acceptCases) {
			System.out.println(acceptCase2);
		}
	}
}
