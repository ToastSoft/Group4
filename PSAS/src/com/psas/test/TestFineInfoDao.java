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
	/**
	 * 
	 * 查找所有追缴信息DAO单元测试
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll(){
		List<FineInfo> fine=dao.findAll();
		for (FineInfo fineInfo : fine) {
			System.out.println(fineInfo);
		}
	}
	/**
	 * 
	 * 新增追缴信息DAO单元测试
	 * @throw
	 * @return void
	 */
	@Test
	public void testAdd(){
		FineInfo fine=new FineInfo();
		fine.setCaseId(1);
		fine.setFineCharacter("枪");
		fine.setFineReason("非礼");
		fine.setFineTime(new Timestamp(System.currentTimeMillis()));
		fine.setFineType(0);
		fine.setIdCard("210283198908046034");
		fine.setPolicemanId(9);
		dao.add(fine);
		System.out.println(fine);
	}
	/**
	 * 
	 * 删除追缴信息DAO单元测试
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete(){
	   FineInfo fine=new FineInfo(3);
		dao.delete(fine);
	}
	/**
	 * 
	 * 修改追缴信息DAO单元测试
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate(){
		FineInfo fine=new FineInfo(2);
		fine.setFineReason("偷裤衩");
		dao.update(fine);
	}
	/**
	 * 
	 * 追缴信息的分页查询DAO单元测试
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindfineByPage() {
		Page page = new Page(1);
		List<FineInfo> logs = dao.findFine(null, page);
		for (FineInfo fineInfo : logs) {
			System.out.println(fineInfo);
		}
	}
	/**
	 * 
	 * 追缴信息的IDDAO单元测试
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindfine() {
		List<FineInfo> logs = dao.findFine(new FineInfo(1), null);
		for (FineInfo fineInfo : logs) {
			System.out.println(fineInfo);
		}
	}
	/**
	 * 
	 * 追缴信息的idCard的单元测试
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindfine1(){
		List<FineInfo> fine=dao.findFine(new FineInfo("210203199301315266"), null);
		for (FineInfo fineInfo : fine) {
			System.out.println(fineInfo);
		}
	}

}
