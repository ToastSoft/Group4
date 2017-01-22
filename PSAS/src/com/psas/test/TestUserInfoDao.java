package com.psas.test;

import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.UserInfoDao;
import com.psas.entity.UserInfo;

/**
 * 用户信息dao层单元测试
 * @author  XulaiWang
 * @data:  2017年1月17日 下午4:32:50
 * @version:  V1.0
 */
public class TestUserInfoDao {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	UserInfoDao dao;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		dao = ac.getBean(UserInfoDao.BEAN_NAME, UserInfoDao.class);
	}

	/**
	 * 查找所有用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<UserInfo> users = dao.findAll();
		for (UserInfo user : users) {
			System.out.println(user);
		}
	}
}
