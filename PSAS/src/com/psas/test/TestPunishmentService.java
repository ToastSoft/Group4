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
import com.psas.service.PunishmentInfoService;
import com.psas.service.UserInfoService;

/**
 * 
 * TODO公安局治安，行政处罚人员情况登记表的service层测试
 * @author  Cunbao Song
 * @data:  2017年2月5日 下午4:17:16
 * @version:  V1.0
 */
public class TestPunishmentService {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	PunishmentInfoService service;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		service = ac.getBean(PunishmentInfoService.BEAN_NAME, PunishmentInfoService.class);
	}

	/**
	 * 查询所有用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<PunishmentInfo> users = service.findAll();
		for (PunishmentInfo p : users) {
			System.out.println(p);
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
		PunishmentInfo p=new PunishmentInfo();
		p.setCaseId(1);
		p.setIdCard("210203199304121831");
		p.setPsId(1);
		p.setPunishmentSituation("见义勇为卡到了");
		p.setPunishmentTime(new Timestamp(System.currentTimeMillis()));
		
		service.add(p);
	}

	/**
	 * 删除用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		PunishmentInfo p=new PunishmentInfo();
		p.setPunishmentId(5);
		service.delete(p);

	}

	/**
	 * 修改用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate() {
		PunishmentInfo p=new PunishmentInfo();
		p.setPunishmentId(4);
		p.setCaseId(2);
		p.setIdCard("210203199301315277");
		p.setPsId(2);
		p.setPunishmentTime(new Timestamp(System.currentTimeMillis()));
		service.update(p);
	}

	/**
	 * 根据id查找用户信息service测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindById() {
		PunishmentInfo p = new PunishmentInfo();
		p.setPunishmentId(1);
		 PunishmentInfo p1 = service.findUserById(p);
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
		Page page = new Page(2);
		List<PunishmentInfo> users = service.findUserByPage(page);
		for (PunishmentInfo p : users) {
			System.out.println(p);
		}
	}

}
