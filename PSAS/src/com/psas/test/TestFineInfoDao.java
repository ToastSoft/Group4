package com.psas.test;

import java.sql.Timestamp;
import java.util.List;



import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.FineInfoDao;
import com.psas.entity.FineInfo;
import com.psas.entity.LogInfo;
import com.psas.entity.Page;


public class TestFineInfoDao {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	FineInfoDao dao;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before	
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		dao = ac.getBean(FineInfoDao.BEAN_NAME, FineInfoDao.class);
	}
	@Test
	public void testFindAll(){
		List<FineInfo> fine=dao.findAll();
		for (FineInfo fineInfo : fine) {
			System.out.println(fineInfo);
		}
	}
	@Test
	public void testAdd(){
		FineInfo fine=new FineInfo();
		fine.setCaseId(21);
		fine.setFineCharacter("气枪");
		fine.setFineReason("非礼妇女");
		fine.setFineTime(new Timestamp(System.currentTimeMillis()));
		fine.setFineType(0);
		fine.setIdCard("210283199208046035");
		fine.setPolicemanId(9);
		dao.add(fine);
		System.out.println(fine);
	}
	@Test
	public void testDelete(){
	   FineInfo fine=new FineInfo(3);
		dao.delete(fine);
	}
	@Test
	public void testUpdate(){
		FineInfo fine=new FineInfo(2);
		fine.setFineReason("偷裤衩");
		dao.update(fine);
	}
	
	@Test
	public void testFindfineByPage() {
		Page page = new Page(1);
		List<FineInfo> logs = dao.findFine(null, page);
		for (FineInfo fineInfo : logs) {
			System.out.println(fineInfo);
		}
	}
	@Test
	public void testFindfine() {
		List<FineInfo> logs = dao.findFine(new FineInfo(1), null);
		for (FineInfo fineInfo : logs) {
			System.out.println(fineInfo);
		}
	}
	/*
	 * 根据idCard查
	 */
	@Test
	public void testFindfine1(){
		List<FineInfo> fine=dao.findFine(new FineInfo("210283199208046035"), null);
		for (FineInfo fineInfo : fine) {
			System.out.println(fineInfo);
		}
	}

}
