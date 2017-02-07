package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.SuspectInfoDao;
import com.psas.entity.CivilDispute;
import com.psas.entity.Page;
import com.psas.entity.SecurityInfo;
import com.psas.entity.SuspectInfo;
import com.psas.entity.UserInfo;

/**
 * 
 * TODO嫌疑人信息表dao层测试
 * @author  Cunbao Song
 * @data:  2017年2月7日 下午4:36:49
 * @version:  V1.0
 */
public class TestSuspectInfoDao {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	SuspectInfoDao dao;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		dao = ac.getBean(SuspectInfoDao.BEAN_NAME, SuspectInfoDao.class);
	}

	/**
	 * 查找所有用户信息单元测试
	 * 
	 * @throw
	 * @return List<SuspectInfo>
	 */
	@Test
	public void testFindAll() {
		List<SuspectInfo> users = dao.findAll();
		for (SuspectInfo suspectInfo : users) {
			System.out.println(suspectInfo);
		}
	}

	/**
	 * 新增用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testAdd() {
		SuspectInfo s = new SuspectInfo();
		s.setCaseId(1);
		s.setIdCard("210203199304121831");
		s.setHandleCondition(1);
		s.setSuspectInttime(new Timestamp(System.currentTimeMillis()));
		s.setSuspectOuttime(new Timestamp(System.currentTimeMillis()));
		dao.add(s);
	}

	/**
	 * 删除用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		SuspectInfo s = new SuspectInfo();
		s.setSuspectId(3);
		dao.delete(s);

	}

	/**
	 * 修改用户单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate() {
		SuspectInfo s = new SuspectInfo();
		s.setCaseId(1);
		s.setIdCard("210203199304121831");
		s.setHandleCondition(1);
		s.setSuspectInttime(new Timestamp(System.currentTimeMillis()));
		s.setSuspectOuttime(new Timestamp(System.currentTimeMillis()));
		s.setSuspectId(4);
		dao.update(s);
		}

	/**
	 * 分页查询用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindUserByPage() {
		SuspectInfo s = new SuspectInfo();
		s.setSuspectId(1);
		Page page = new Page(1);
		List<SuspectInfo> users = dao.findUser(s, page);
		for (SuspectInfo suspectInfo : users) {
			System.out.println(suspectInfo);
		}
		
	}

}
