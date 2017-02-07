package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.SecurityInfoDao;
import com.psas.entity.Page;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.SecurityInfo;

/**
 * 
 * TODO治安案件登记表的Dao层测试
 * @author  Cunbao Song
 * @data:  2017年2月6日 上午9:24:20
 * @version:  V1.0
 */
public class TestSecurityInfoDao {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	SecurityInfoDao dao;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		dao = ac.getBean(SecurityInfoDao.BEAN_NAME, SecurityInfoDao.class);
	}

	/**
	 * 查找所有用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<SecurityInfo> users = dao.findAll();
		for (SecurityInfo s : users) {
			System.out.println(s);
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
		SecurityInfo s=new SecurityInfo();
		s.setSupplyInfo("阴雪天路滑不小心和我表妹进了这里，让你们找到了");
		s.setSecurityResult("嫖娼拘留15天");
		s.setFineId(1);
		s.setCaseId(1);
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
		SecurityInfo s = new SecurityInfo();
		s.setSecurityId(3);
		dao.delete(s);
	}

	/**
	 * 修改其它用户信息
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate() {
		SecurityInfo s = new SecurityInfo();
		s.setSupplyInfo("警察叔叔，阴雪天路滑不小心和我表妹进了这里，让你们找到了");
		s.setSecurityId(4);
		s.setSecurityResult("嫖娼拘留15天");
		s.setFineId(1);
		s.setCaseId(1);
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
		SecurityInfo s1 = new SecurityInfo();
		s1.setSecurityId(1);
		Page page = new Page(1);
		List<SecurityInfo> users = dao.findUser(s1, page);
		for (SecurityInfo s : users) {
			System.out.println(s);
		}
		
	}

}

