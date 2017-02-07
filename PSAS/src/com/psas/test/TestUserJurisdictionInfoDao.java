package com.psas.test;

import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.UserJurisdictionInfoDao;
import com.psas.entity.UserJurisdictionInfo;

/**
 * 用户与权限dao单元测试
 * @author  XulaiWang
 * @data:  2017年2月7日 下午3:17:34
 * @version:  V1.0
 */
public class TestUserJurisdictionInfoDao {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	UserJurisdictionInfoDao dao;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		dao = ac.getBean(UserJurisdictionInfoDao.BEAN_NAME, UserJurisdictionInfoDao.class);
	}

	/**
	 * 查询所有用户与权限dao单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<UserJurisdictionInfo> ujs = dao.findAll();
		for (UserJurisdictionInfo uj : ujs) {
			System.out.println(uj);
		}
	}

	/**
	 * 增加用户与权限dao单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testAdd() {
		UserJurisdictionInfo uj = new UserJurisdictionInfo();
		uj.setUserId(4);
		uj.setJurisdictionId(1);
		dao.add(uj);
	}

	/**
	 * 删除用户与权限dao单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		UserJurisdictionInfo uj = new UserJurisdictionInfo(11);
		dao.delete(uj);
	}

	/**
	 * 根据id查找用户与dao单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindUserJurisdictionInfo01() {
		UserJurisdictionInfo uj = new UserJurisdictionInfo();
		uj.setId(2);
		List<UserJurisdictionInfo> u = dao.findUserJurisdictionInfo(uj);
		for (UserJurisdictionInfo userJurisdictionInfo : u) {
			System.out.println(userJurisdictionInfo);
		}
	}

	/**
	 * 根据用户id查找用户与权限dao单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindUserJurisdictionInfo02() {
		UserJurisdictionInfo uj = new UserJurisdictionInfo();
		uj.setUserId(1);
		List<UserJurisdictionInfo> u = dao.findUserJurisdictionInfo(uj);
		for (UserJurisdictionInfo userJurisdictionInfo : u) {
			System.out.println(userJurisdictionInfo);
		}
	}

	/**
	 * 根据权限id查找用户与权限dao单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindUserJurisdictionInfo03() {
		UserJurisdictionInfo uj = new UserJurisdictionInfo();
		uj.setJurisdictionId(1);
		List<UserJurisdictionInfo> u = dao.findUserJurisdictionInfo(uj);
		for (UserJurisdictionInfo userJurisdictionInfo : u) {
			System.out.println(userJurisdictionInfo);
		}
	}
}
