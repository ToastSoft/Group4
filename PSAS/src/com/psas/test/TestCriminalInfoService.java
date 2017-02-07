package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import javax.xml.crypto.dsig.SignedInfo;

import org.apache.log4j.PropertyConfigurator;
import org.apache.tomcat.jni.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.entity.CriminalInfo;
import com.psas.entity.Page;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.SecurityInfo;
import com.psas.entity.UserInfo;
import com.psas.service.CriminalInfoService;
import com.psas.service.PunishmentInfoService;
import com.psas.service.SecurityInfoService;
import com.psas.service.UserInfoService;

/**
 * 
 * TODO 刑事案件登记表service层测试
 * @author  Cunbao Song
 * @data:  2017年2月6日 下午1:42:49
 * @version:  V1.0
 */
public class TestCriminalInfoService {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	CriminalInfoService service;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		service = ac.getBean(CriminalInfoService.BEAN_NAME, CriminalInfoService.class);
	}

	/**
	 * 查询所有用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<CriminalInfo> users = service.findAll();
		for (CriminalInfo criminalInfo : users) {
			System.out.println(criminalInfo);
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
		CriminalInfo c = new CriminalInfo();
		c.setCaseSupply("xxxx");
		c.setCriminalSituation("xxx");
		c.setSupplyInfo("xx");
		c.setCaseId(1);
		c.setCriminalResult("xxxxxx");
		service.add(c);
	}

	/**
	 * 删除用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		CriminalInfo c = new CriminalInfo();
		c.setCriminalId(4);
		service.delete(c);

	}

	/**
	 * 修改用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate() {
		CriminalInfo c = new CriminalInfo();
		c.setCaseSupply("xxxx");
		c.setCriminalSituation("xxx");
		c.setSupplyInfo("xxxxxx");
		c.setCaseId(1);
		c.setCriminalResult("xxxxxx");
		c.setCriminalId(5);
		service.update(c);
	}

	/**
	 * 根据id查找用户信息service测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindById() {
	CriminalInfo c = new CriminalInfo();
	c.setCriminalId(1);
	CriminalInfo s1 = service.findUserById(c);
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
		List<CriminalInfo> users = service.findUserByPage(page);
		for (CriminalInfo criminalInfo : users) {
			System.out.println(criminalInfo);
		}
		
	}

}
