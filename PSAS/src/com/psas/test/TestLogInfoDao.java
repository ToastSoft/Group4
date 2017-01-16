package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * LogInfoDao 单元测试
 * @author  XulaiWang
 * @data:  2017年1月14日 上午9:49:20
 * @version:  V1.0
 */

import com.psas.dao.LogInfoDao;
import com.psas.entity.LogInfo;
import com.psas.entity.Page;

public class TestLogInfoDao {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	LogInfoDao dao;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		dao = ac.getBean(LogInfoDao.BEAN_NAME, LogInfoDao.class);
	}

	/**
	 * 查找所有日志信息DAO单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<LogInfo> log = dao.findAll();
		for (LogInfo l : log) {
			System.out.println(l);
		}
	}

	/**
	 * 新增日志信息DAO单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testAdd() {
		LogInfo log;
		for (int i = 0; i < 20; i++) {
			log = new LogInfo("log测试" + i, 2);
			dao.add(log);
		}

	}

	/**
	 * 删除一条日志信息DAO单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		// 传递日志id，根据id进行删除
		LogInfo log = new LogInfo(1);
		dao.delete(log);
	}

	/**
	 * 修改日志信息的信息字段DAO单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate01() {
		LogInfo log = new LogInfo(2);
		log.setLogMsg("log测试2******");
		dao.update(log);
	}

	/**
	 * 修改日志信息的time字段DAO单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate02() {
		LogInfo log = new LogInfo(2);
		log.setLogTime(new Timestamp(System.currentTimeMillis()));
		dao.update(log);
	}

	/**
	 * 修改日志信息的用户Id字段DAO单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate03() {
		LogInfo log = new LogInfo(2);
		log.setUserId(2);
		dao.update(log);
	}

	/**
	 * 修改日志信息的多个字段DAO单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate04() {
		LogInfo log = new LogInfo(2);
		log.setUserId(1);
		log.setLogMsg("log测试3333******");
		log.setLogTime(new Timestamp(System.currentTimeMillis()));
		dao.update(log);
	}

	/**
	 * 日志信息的分页查询DAO测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindLogByPage() {
		Page page = new Page(2);
		List<LogInfo> logs = dao.findLog(null, page);
		for (LogInfo l : logs) {
			System.out.println(l);
		}
	}

	/**
	 * 日志信息的根据日志id查询DAO测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindLog() {
		List<LogInfo> logs = dao.findLog(new LogInfo(12), null);
		for (LogInfo l : logs) {
			System.out.println(l);
		}
	}
}
