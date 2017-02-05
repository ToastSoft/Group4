package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.PunishmentInfoDao;
import com.psas.dao.UserInfoDao;
import com.psas.entity.Page;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.UserInfo;

/**
 * 用户信息dao层单元测试
 * @author  XulaiWang
 * @data:  2017年1月17日 下午4:32:50
 * @version:  V1.0
 */
public class TestPunishmentInfoDao {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	PunishmentInfoDao dao;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		dao = ac.getBean(PunishmentInfoDao.BEAN_NAME, PunishmentInfoDao.class);
	}

	/**
	 * 查找所有用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<PunishmentInfo> users = dao.findAll();
		for (PunishmentInfo punishmentInfo : users) {
			System.out.println(punishmentInfo);
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
		
	}

	/**
	 * 删除用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		

	}

	/**
	 * 修改用户登录密码单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate01() {
		
	}

	/**
	 * 修改其它用户信息
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate02() {
		
	}

	/**
	 * 根据ID查找用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindUserById() {
		
	}

	/**
	 * 分页查询用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindUserByPage() {
		Page page = new Page(1);
		List<UserInfo> users = dao.findUser(null, page);
		for (UserInfo u : users) {
			System.out.println(u);
		}
	}
}

