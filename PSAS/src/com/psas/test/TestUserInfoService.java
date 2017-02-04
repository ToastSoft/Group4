package com.psas.test;

import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.apache.tomcat.jni.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.entity.Page;
import com.psas.entity.UserInfo;
import com.psas.service.UserInfoService;

/**
 * 用户信息service层单元测试
 * @author  XulaiWang
 * @data:  2017年2月4日 下午3:53:14
 * @version:  V1.0
 */
public class TestUserInfoService {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	UserInfoService service;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		service = ac.getBean(UserInfoService.BEAN_NAME, UserInfoService.class);
	}

	/**
	 * 查询所有用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<UserInfo> users = service.findAll();
		for (UserInfo u : users) {
			System.out.println(u);
		}
	}

	/**
	 * 新增用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testAdd() {
		UserInfo user = new UserInfo("user09", "000000", 4, "张警官", "0");
		service.add(user);
	}

	/**
	 * 删除用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		UserInfo user = new UserInfo(15);
		service.delete(user);

	}

	/**
	 * 修改用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate() {
		UserInfo user = new UserInfo();
		user.setUserId(13);
		user.setLoginPassword("sbsbsbs2222");
		user.setPoliceId(3);
		service.update(user);
	}

	/**
	 * 根据id查找用户信息service测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindById() {
		UserInfo user = new UserInfo(13);
		UserInfo u = service.findUserById(user);
		System.out.println(u);
	}

	/**
	 * 分页查询用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindByPage() {
		Page page = new Page(2);
		List<UserInfo> users = service.findUserByPage(page);
		for (UserInfo u : users) {
			System.out.println(u);
		}
	}

}
