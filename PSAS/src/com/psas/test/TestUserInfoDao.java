package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.UserInfoDao;
import com.psas.entity.Page;
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

	/**
	 * 新增用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testAdd() {
		UserInfo user = new UserInfo("user05", "000000", 4, "张警官", "0");
		dao.add(user);
	}

	/**
	 * 删除用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		UserInfo user = new UserInfo(7);
		dao.delete(user);

	}

	/**
	 * 修改用户登录密码单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate01() {
		UserInfo user = new UserInfo();
		user.setLoginPassword("123456");
		user.setUserId(3);
		dao.update(user);
	}

	/**
	 * 修改其它用户信息
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate02() {
		UserInfo user = new UserInfo();
		user.setPoliceId(1);
		user.setPoliceName("好警官");
		user.setCreateTime(new Timestamp(System.currentTimeMillis()));
		user.setDeleteTime(new Timestamp(System.currentTimeMillis()));
		user.setUserStatus("1");
		user.setUserId(3);
		dao.update(user);
	}

	/**
	 * 根据ID查找用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindUserById() {
		UserInfo user = new UserInfo(2);
		List<UserInfo> users = dao.findUser(user, null);
		for (UserInfo u : users) {
			System.out.println(u);
		}
	}

	/**
	 * 分页查询用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindUserByPage() {
		Page page = new Page(2);
		List<UserInfo> users = dao.findUser(null, page);
		for (UserInfo u : users) {
			System.out.println(u);
		}
	}
}
