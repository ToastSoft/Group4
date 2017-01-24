package com.psas.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.AlarmInfoDao;
import com.psas.entity.AlarmInfo;

public class TestAlarmInfoDao {
	ClassPathXmlApplicationContext ac;
	String conf="applicationContext.xml";
	AlarmInfoDao dao;
	
	@Before
	public void init(){
		ac = new ClassPathXmlApplicationContext(conf);
		dao = ac.getBean(AlarmInfoDao.BEAN_NAME,AlarmInfoDao.class);
	}
	
	/**
	 * 查找所有接处警信息DAO单元测试
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll(){
		List<AlarmInfo> alarm = dao.findAll();
		for (AlarmInfo a : alarm) {
			System.out.println(a);
		}
	}
	
	@Test
	public void testAdd(){
		AlarmInfo alarm = new AlarmInfo( "田馥甄", "1", "18698688666", "中南海", "2017-01-13 14:03:02", 0, "有人非礼", "2016-12-25 14:02:21", "软件园B8", 2, "处警情况", 2, "损失xxxx", 100, 500, 15, 0, 3);
		
	}
	
	
}
