package com.psas.test;

import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.entity.UserJurisdictionInfo;
import com.psas.service.UserJurisdictionInfoService;

/**
 * 用户与权限service单元测试
 * @author  XulaiWang
 * @data:  2017年2月7日 下午3:40:57
 * @version:  V1.0
 */
public class TestUserJurisdictionInfoService {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	UserJurisdictionInfoService service;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		service = ac.getBean(UserJurisdictionInfoService.BEAN_NAME, UserJurisdictionInfoService.class);
	}

	/**
	 * 查找所有用户与权限service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<UserJurisdictionInfo> ujs = service.findAll();
		for (UserJurisdictionInfo uj : ujs) {
			System.out.println(uj);
		}
	}

	/**
	 * 增加用户与权限service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testAdd() {
		UserJurisdictionInfo uj = new UserJurisdictionInfo();
		uj.setUserId(4);
		uj.setJurisdictionId(6);
		service.add(uj);
	}

	/**
	 * 根据id删除用户与权限service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDeleteById() {
		UserJurisdictionInfo uj = new UserJurisdictionInfo();
		uj.setId(14);
		service.delete(uj);
	}

	/**
	 * 根据userId删除用户与权限service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDeleteByUserId() {
		UserJurisdictionInfo uj = new UserJurisdictionInfo();
		uj.setUserId(4);
		service.delete(uj);
	}

	/**
	 * 根据id查找用户与权限service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindById() {
		UserJurisdictionInfo uj = new UserJurisdictionInfo();
		uj.setId(9);
		UserJurisdictionInfo userJurisdictionInfo = service.findById(uj);
		System.out.println(userJurisdictionInfo);

	}

	/**
	 * 根据userId查找用户与权限service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindByUserId() {
		UserJurisdictionInfo uj = new UserJurisdictionInfo();
		uj.setUserId(1);
		List<UserJurisdictionInfo> ujs = service.findByUserId(uj);
		for (UserJurisdictionInfo u : ujs) {
			System.out.println(u);
		}
	}

	/**
	 * 根据jurisdictionId查找用户与权限service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindByJurisdictionId() {
		UserJurisdictionInfo uj = new UserJurisdictionInfo();
		uj.setJurisdictionId(1);
		List<UserJurisdictionInfo> ujs = service.findByJurisdictionId(uj);
		for (UserJurisdictionInfo u : ujs) {
			System.out.println(u);
		}

	}

}
