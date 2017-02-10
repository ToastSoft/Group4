package com.psas.test;

import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.entity.Page;
import com.psas.entity.PolicemanInfo;
import com.psas.entity.VictimInfo;
import com.psas.service.PolicemanInfoService;

/**
 * 
 * TODO 警员信息表service层测试
 * @author  Cunbao Song
 * @data:  2017年2月9日 下午4:43:29
 * @version:  V1.0
 */
public class TestPolicemanInfoService {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	PolicemanInfoService service;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		service = ac.getBean(PolicemanInfoService.BEAN_NAME, PolicemanInfoService.class);
	}

	/**
	 * 查询所有警员信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<PolicemanInfo> users = service.findAll();
		for (PolicemanInfo policemanInfo : users) {
			System.out.println(policemanInfo);
		}
	}

	/**
	 * 新增警员信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testAdd() {
		PolicemanInfo p = new PolicemanInfo("xx", "x", 1, "xxx", "x", 1);
		service.add(p);
	}

	/**
	 * 删除警员信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		PolicemanInfo p = new PolicemanInfo();
		p.setPolicemanId(9);
		service.delete(p);

	}

	/**
	 * 修改警员信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate() {
		PolicemanInfo p = new PolicemanInfo("xxs", "x", 1, "xxx", "x", 1);
		p.setPolicemanId(10);
		service.update(p);
	}

	/**
	 * 根据id查找警员信息service测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindById() {
		PolicemanInfo p = new PolicemanInfo();
		p.setPolicemanId(1);
		PolicemanInfo p1 = service.findPolicemanById(p);
		System.out.println(p1);
	}

	/**
	 * 分页查询警员信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindByPage() {
		Page page = new Page(1);
		List<PolicemanInfo> users = service.findPolicemanByPage(page);
		for (PolicemanInfo policemanInfo : users) {
			System.out.println(policemanInfo);
		}
	}

}
