package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.entity.AlarmInfo;
import com.psas.entity.Page;
import com.psas.service.AlarmInfoService;

public class TestAlarmInfoService {
	ClassPathXmlApplicationContext ac;
	String conf="applicationContext.xml";
	AlarmInfoService service;
	
	static{
		PropertyConfigurator.configure("log/log4j.properties");
	}
	
	@Before
	public void init(){
		ac = new ClassPathXmlApplicationContext(conf);
		service =  ac.getBean(AlarmInfoService.BEAN_NAME,AlarmInfoService.class);
	}
	
	@Test
	public void testFindAll(){
		List<AlarmInfo> alarm = service.findAll();
		for (AlarmInfo alarmInfo : alarm) {
			System.out.println(alarmInfo);
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
		service.add(alarm);
	}
	@Test
	public void testUpdate(){
		AlarmInfo alarm = new AlarmInfo(3);
		alarm.setAlarmName("sss");
		service.update(alarm);
	}
	@Test
	public void testDelete(){
		AlarmInfo alarm = new AlarmInfo(4);
		service.delete(alarm);
	}
	@Test
	public void testFindByPage(){
		Page page = new Page(1);
		List<AlarmInfo> alarms = service.findByPage(page);
		for (AlarmInfo alarmInfo : alarms) {
			System.out.println(alarmInfo);
		}
	}
	@Test
	public void testFindById(){
		AlarmInfo alarm = new AlarmInfo();
		alarm.setAlarmId(1);
		List<AlarmInfo> alarms = service.findById(alarm);
		for (AlarmInfo alarmInfo : alarms) {
			System.out.println(alarmInfo);
		}
	}
}
