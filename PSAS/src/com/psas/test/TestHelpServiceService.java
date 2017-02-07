package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.HelpServiceDao;
import com.psas.entity.HelpService;
import com.psas.entity.Page;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.SecurityInfo;
import com.psas.service.HelpServiceService;

/**
 * 
 * TODO救助服务登记service测试
 * @author  Cunbao Song
 * @data:  2017年2月6日 下午7:27:49
 * @version:  V1.0
 */
public class TestHelpServiceService {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	HelpServiceService service;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		service = ac.getBean(HelpServiceService.BEAN_NAME, HelpServiceService.class);
	}

	/**
	 * 查找所有用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<HelpService> users = service.findAll();
		for (HelpService helpService : users) {
			System.out.println(helpService);
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
	HelpService h = new HelpService();
		h.setAlarmId(0);
		h.setAlarmTime(new Timestamp(System.currentTimeMillis()));
		h.setAlarmPlace("100");
		h.setBehelpName("xx");
		h.setHelpName("wo");
		h.setHelpContent("xxxx");
		service.add(h);
		
	}

	/**
	 * 删除用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		HelpService h = new HelpService();
		h.setHelpId(5);
		
		service.delete(h);
	}

	/**
	 * 修改其它用户信息
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate() {
		HelpService  hs= new HelpService();
		hs.setHelpName("wang");
		hs.setAlarmId(0);
		hs.setAlarmTime(new Timestamp(System.currentTimeMillis()));
		hs.setAlarmPlace("20000");
		hs.setBehelpName("xx");
		hs.setHelpContent("xxxx");
		hs.setHelpId(4);
		service.update(hs);
	}

	/**
	 * 根据id查找用户信息service测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindById() {
		HelpService hs = new HelpService();
		hs.setHelpId(1);
		HelpService hs1 = service.findUserById(hs);
		System.out.println(hs1);
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
		List<HelpService> users = service.findUserByPage(page);
		for (HelpService helpService : users) {
			System.out.println(helpService);
		}
	}

}

