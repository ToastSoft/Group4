package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.apache.tomcat.jni.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.entity.Page;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.UserInfo;
import com.psas.entity.VictimInfo;
import com.psas.service.PunishmentInfoService;
import com.psas.service.UserInfoService;
import com.psas.service.VictimInfoService;

/**
 * 
 * TODO 受害人信息表service层测试
 * @author  Cunbao Song
 * @data:  2017年2月9日 上午9:52:33
 * @version:  V1.0
 */
public class TestVictimInfoService {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	VictimInfoService service;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		service = ac.getBean(VictimInfoService.BEAN_NAME, VictimInfoService.class);
	}

	/**
	 * 查询所有用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<VictimInfo> users = service.findAll();
		for (VictimInfo victimInfo : users) {
			System.out.println(victimInfo);
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
		VictimInfo v = new VictimInfo();
		v.setCaseId(1);
		v.setIdCard("210203199304121831");
		service.add(v);
	}

	/**
	 * 删除用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		VictimInfo v = new VictimInfo();
		v.setVictimId(4);
		service.delete(v);

	}

	/**
	 * 修改用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate() {
		VictimInfo v = new VictimInfo();
		v.setCaseId(2);
		v.setIdCard("210203199304121831");
		v.setVictimId(5);
		service.update(v);
	}

	/**
	 * 根据id查找用户信息service测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindById() {
		VictimInfo v = new VictimInfo();
		v.setVictimId(1);
		VictimInfo p1 = service.findUserById(v);
		System.out.println(p1);
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
		List<VictimInfo> users = service.findUserByPage(page);
		for (VictimInfo victimInfo : users) {
			System.out.println(victimInfo);
		}
	}

}
