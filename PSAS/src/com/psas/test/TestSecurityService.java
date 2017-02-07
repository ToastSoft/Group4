package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import javax.xml.crypto.dsig.SignedInfo;

import org.apache.log4j.PropertyConfigurator;
import org.apache.tomcat.jni.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.entity.Page;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.SecurityInfo;
import com.psas.entity.UserInfo;
import com.psas.service.PunishmentInfoService;
import com.psas.service.SecurityInfoService;
import com.psas.service.UserInfoService;

/**
 * 
 * TODO治安案件登记表的service测试
 * @author  Cunbao Song
 * @data:  2017年2月6日 上午10:35:19
 * @version:  V1.0
 */
public class TestSecurityService {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	SecurityInfoService service;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		service = ac.getBean(SecurityInfoService.BEAN_NAME, SecurityInfoService.class);
	}

	/**
	 * 查询所有用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<SecurityInfo> users = service.findAll();
		for (SecurityInfo s : users) {
			System.out.println(s);
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
		SecurityInfo s=new SecurityInfo();
		s.setSupplyInfo("阴雪天路滑不小心和我表妹进了这里，让你们找到了");
		s.setSecurityResult("组长嫖娼拘留15天");
		s.setFineId(1);
		s.setCaseId(1);
		service.add(s);
	}

	/**
	 * 删除用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		SecurityInfo s = new SecurityInfo();
		s.setSecurityId(4);
		service.delete(s);

	}

	/**
	 * 修改用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate() {
		SecurityInfo s = new SecurityInfo();
		s.setSupplyInfo("警察叔叔，阴雪天路滑不小心和我表妹进了这里，让你们找到了");
		s.setSecurityId(5);
		s.setSecurityResult("嫖娼拘留15天");
		s.setFineId(1);
		s.setCaseId(1);
		service.update(s);
	}

	/**
	 * 根据id查找用户信息service测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindById() {
	SecurityInfo s = new SecurityInfo();
		s.setSecurityId(1);
		 SecurityInfo s1 = service.findUserById(s);
		System.out.println(s1);
	}

	/**
	 * 分页查询用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindByPage() {
		Page page = new Page(1);
		List<SecurityInfo> users = service.findUserByPage(page);
		for (SecurityInfo s : users) {
			System.out.println(s);
		}
	}

}
