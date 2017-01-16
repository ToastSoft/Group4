package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.entity.LogInfo;
import com.psas.entity.Page;
import com.psas.service.LogInfoService;
import com.psas.service.impl.LogInfoServiceImpl;

/**
 * 日志信息Service单元测试
 * 
 * @author XulaiWang
 * @data: 2017年1月16日 上午11:27:00
 * @version: V1.0
 */
public class TestLogInfoService {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	LogInfoService service;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		service = ac.getBean(LogInfoService.BEAN_NAME, LogInfoService.class);
	}

	/**
	 * 查询所有日志信息Service测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<LogInfo> logs = service.findAll();
		for (LogInfo log : logs) {
			System.out.println(log);
		}
	}

	/**
	 * 新增日志信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testAdd() {
		service.add(new LogInfo("loginfo单元测试*****", 1));
	}

	/**
	 * 删除日志信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		service.delete(new LogInfo(65));
	}

	/**
	 * 修改日志信息单元测试 
	 * 日志信息，日志时间，用户id为可修改项 
	 * 日志id为必要条件，根据日志id修改
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate() {
		LogInfo log = new LogInfo();
		log.setLogId(64);
		log.setLogMsg("log 测试 19-*-*-*-");
		log.setLogTime(new Timestamp(System.currentTimeMillis()));
		log.setUserId(1);
		service.update(log);
	}

	/**
	 * 分页查询日志信息
	 * 传递一个Page对象，对象中存储page(页数)
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindByPage() {
		Page page = new Page(3);
		List<LogInfo> logs = service.findByPage(page);
		for (LogInfo log : logs) {
			System.out.println(log);
		}
	}
	/**
	 * 根据日志id，查找日志信息
	 * 需要传递一个日志对象，对象中存放日志ID
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindById(){
		LogInfo logInfo = new LogInfo(16);
		List<LogInfo> log = service.findById(logInfo);
		if (log.size()==1) {
			System.out.println(log.get(0));
		}else if(log.size()==0){
			System.out.println("没有找到日志信息");
		}else {
			System.out.println("查找错误");
		}
	}

}
