package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.CaseNotifyDao;
import com.psas.entity.CaseNotify;
import com.psas.entity.Page;

public class TestCaseNotifyDao {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	CaseNotifyDao dao;
	
	@Before
	public void init(){
		ac = new ClassPathXmlApplicationContext(conf);
		dao = ac.getBean(CaseNotifyDao.BEAN_NAME,CaseNotifyDao.class);
	}
	
	@Test
	public void testFindAll(){
		List<CaseNotify> caseNotify = dao.findAll();
		for (CaseNotify caseNotify2 : caseNotify) {
			System.out.println(caseNotify2);
		}
				
	}
	
	@Test
	public void testAdd(){
		CaseNotify caseNotify = new CaseNotify();
		caseNotify.setBenotifiedName("余思言");
		caseNotify.setAlarmAddress("软件园");
		caseNotify.setCaseNotifyConsider("asdsad");
		caseNotify.setCaseId(2);
		caseNotify.setCaseNotifyTime(new Timestamp(System.currentTimeMillis()));
		dao.add(caseNotify);
	}
	
	@Test
	public void testUpdate(){
		CaseNotify caseNotify = new CaseNotify();
		caseNotify.setCaseNotifyId(3);
		caseNotify.setBenotifiedName("王旭来");
		dao.update(caseNotify);
	}
	
	@Test
	public void testDelete(){
		CaseNotify caseNotify = new CaseNotify();
		caseNotify.setCaseNotifyId(3);
		dao.delete(caseNotify);;
	}

	@Test
	public void testFindCaseNotify1(){
		CaseNotify caseNotify = new CaseNotify();
		caseNotify.setCaseNotifyId(1);
		List<CaseNotify> caseNotifies = dao.findCaseNotify(caseNotify, null);
		for (CaseNotify caseNotify2 : caseNotifies) {
			System.out.println(caseNotify2);
		}
	}
	
	@Test
	public void testFindCaseNotify2(){
		Page page = new Page(1);
		List<CaseNotify> caseNotifies = dao.findCaseNotify(null, page);
		for (CaseNotify caseNotify2 : caseNotifies) {
			System.out.println(caseNotify2);
		}
	}
}
