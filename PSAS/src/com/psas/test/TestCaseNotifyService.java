package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Case;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.entity.CaseNotify;
import com.psas.entity.Page;
import com.psas.service.CaseNotifyService;

public class TestCaseNotifyService {
	ClassPathXmlApplicationContext ac;
	String conf="applicationContext.xml";
	CaseNotifyService service;
	
	static{
		PropertyConfigurator.configure("log/log4j.properties");
	}
	
	@Before
	public void init(){
		ac=new ClassPathXmlApplicationContext(conf);
		service = ac.getBean(CaseNotifyService.BEAN_NAME,CaseNotifyService.class);
	}
	
	@Test
	public void testFindAll(){
		List<CaseNotify> caseNotifies = service.findAll();
		for (CaseNotify caseNotify : caseNotifies) {
			System.out.println(caseNotify);
		}
	}
	@Test
	public void testAdd(){
		CaseNotify caseNotify = new CaseNotify();
		caseNotify.setAlarmAddress("sss");
		caseNotify.setBenotifiedName("sssss");
		caseNotify.setCaseId(2);
		caseNotify.setCaseNotifyConsider("sssss");
		caseNotify.setCaseNotifyTime(new Timestamp(System.currentTimeMillis()));
		service.add(caseNotify);
	}
	@Test
	public void testUpdate(){
		CaseNotify caseNotify = new CaseNotify();
		caseNotify.setCaseNotifyId(4);
		caseNotify.setBenotifiedName("王旭来");
		service.update(caseNotify);
	}
	@Test
	public void testDelete(){
		CaseNotify caseNotify = new CaseNotify();
		caseNotify.setCaseNotifyId(4);
		service.delete(caseNotify);
	}
	
	@Test
	public void testFindById(){
		CaseNotify caseNotify = new CaseNotify();
		caseNotify.setCaseNotifyId(1);
		List<CaseNotify> caseNotifies = service.findById(caseNotify);
		for (CaseNotify caseNotify2 : caseNotifies) {
			System.out.println(caseNotify2);
		}
	}
	
	@Test
	public void testFindByPage(){
		Page page = new Page(1);
		List<CaseNotify> caseNotifies = service.findByPage(page);
		for (CaseNotify caseNotify : caseNotifies) {
			System.out.println(caseNotify);
		}
	}
}
