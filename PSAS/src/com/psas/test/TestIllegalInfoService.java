package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.apache.tomcat.jni.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.entity.IllegalInfo;
import com.psas.entity.Page;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.UserInfo;
import com.psas.entity.VictimInfo;
import com.psas.service.IllegalInfoService;
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
public class TestIllegalInfoService {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	IllegalInfoService service;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		service = ac.getBean(IllegalInfoService.BEAN_NAME, IllegalInfoService.class);
	}

	/**
	 * 查询所有用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<IllegalInfo> users = service.findAll();
		for (IllegalInfo illegalInfo : users) {
			System.out.println(illegalInfo);
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
		IllegalInfo i = new IllegalInfo();
		i.setCaseId(1);
		i.setIdCard("210203199304121831");
		service.add(i);
	}

	/**
	 * 删除用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		IllegalInfo i = new IllegalInfo();
		i.setIllegalId(4);
		service.delete(i);

	}

	/**
	 * 修改用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate() {
		IllegalInfo i = new IllegalInfo();
		i.setCaseId(2);
		i.setIdCard("210203199304121831");
		i.setIllegalId(5);
		service.update(i);
	}

	/**
	 * 根据id查找用户信息service测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindById() {
		IllegalInfo i = new IllegalInfo();
		i.setIllegalId(1);
		IllegalInfo i1 = service.findUserById(i);
		System.out.println(i1);
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
		List<IllegalInfo> users = service.findUserByPage(page);
		for (IllegalInfo illegalInfo : users) {
			System.out.println(illegalInfo);
		}
	}

}
