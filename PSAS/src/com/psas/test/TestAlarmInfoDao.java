package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.AlarmInfoDao;
import com.psas.entity.AlarmInfo;
import com.psas.entity.Page;

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
		AlarmInfo alarm = new AlarmInfo();
		alarm.setAlarmName("余思言");
		alarm.setAlarmGender("m");
		alarm.setAlarmTelephone("13941535467");
		alarm.setAlarmCaseTime(new Timestamp(System.currentTimeMillis()));
		alarm.setAlarmFormat(2);
		alarm.setAlarmContent("余思言强奸郝旭珍");
		alarm.setAlarmPlace("雨林科技");
		alarm.setReceptionPoliceman(2);
		alarm.setHandleSituation("拘留15天");
		alarm.setHandlePoliceman(3);
		alarm.setLossSiuation("sadad");
		alarm.setDeathNumber(0);
		alarm.setInjuredNumber(500);
		alarm.setEconomicLoss(23.0);
		alarm.setHandleResult(3);
		alarm.setDutyLeader(2);
		alarm.setAlarmAddress("开发区");
		dao.add(alarm);
		
	}
	@Test
	public void testUpdate(){
		AlarmInfo alarm = new AlarmInfo(3);
		alarm.setAlarmName("sss");
		dao.update(alarm);	
	}
	@Test
	public void testDelete(){
		AlarmInfo alarm = new AlarmInfo(4);
		dao.delete(alarm);
	}
	@Test
	public void testFindAlarm(){
		Page page = new Page(1);
		List<AlarmInfo> alarms = dao.findAlarm(null, page);
		for (AlarmInfo alarmInfo : alarms) {
			System.out.println(alarmInfo);
		}
	}
	@Test
	public void testFindAlarm1(){
		AlarmInfo alarm = new AlarmInfo();
		alarm.setAlarmId(1);
		List<AlarmInfo> alarms = dao.findAlarm(alarm, null);
		for (AlarmInfo alarmInfo : alarms) {
			System.out.println(alarmInfo);
		}
	}
	
}
