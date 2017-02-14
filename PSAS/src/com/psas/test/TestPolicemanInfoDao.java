package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.PolicemanInfoDao;
import com.psas.entity.Page;
import com.psas.entity.PolicemanInfo;
import com.psas.entity.PunishmentInfo;

/**
 * 
 * TODO 警员表dao层 测试
 * @author  Cunbao Song
 * @data:  2017年2月9日 下午3:33:29
 * @version:  V1.0
 */
public class TestPolicemanInfoDao {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	PolicemanInfoDao dao;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		dao = ac.getBean(PolicemanInfoDao.BEAN_NAME, PolicemanInfoDao.class);
	}

	/**
	 * 查找所有警员信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<PolicemanInfo> users = dao.findAll();
		for (PolicemanInfo policemanInfo : users) {
			System.out.println(policemanInfo);
		}
	}

	/**
	 * 新增警员信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testAdd() {
		PolicemanInfo p = new PolicemanInfo("xx", "x", 1, "xxx", "x", 1);
		dao.add(p);
		
	}

	/**
	 * 删除警员信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		
		PolicemanInfo p = new PolicemanInfo();
		p.setPolicemanId(8);
		dao.delete(p);
	}

	/**
	 * 修改其它警员信息
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate() {
		PolicemanInfo p = new PolicemanInfo("xxs", "x", 1, "xxx", "x", 1);
		p.setPolicemanId(9);
		dao.update(p);
	}

	/**
	 * 分页查询警员信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindPolicmanByPage() {
		PolicemanInfo p = new PolicemanInfo();
		p.setPolicemanId(1);
		Page page = new Page(1);
		List<PolicemanInfo> p1 = dao.findPoliceman(p, page);
		for (PolicemanInfo policemanInfo : p1) {
			System.out.println(policemanInfo);
		}
		
	}

}

