package com.psas.test;

import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.JurisdictionInfoDao;
import com.psas.entity.JurisdictionInfo;

/**
 * 权限信息dao单元测试
 * @author  XulaiWang
 * @data:  2017年2月7日 上午9:21:00
 * @version:  V1.0
 */
public class TestJurisdictionInfoDao {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	JurisdictionInfoDao dao;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		dao = ac.getBean(JurisdictionInfoDao.BEAN_NAME, JurisdictionInfoDao.class);
	}

	/**
	 * 查询所有权限信息dao单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<JurisdictionInfo> jurisdictions = dao.findAll();
		for (JurisdictionInfo jurisdictionInfo : jurisdictions) {
			System.out.println(jurisdictionInfo);
		}
	}

	/**
	 * 增加权限信息dao单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testAdd() {
		JurisdictionInfo jurisdictionInfo = new JurisdictionInfo();
		jurisdictionInfo.setJurisdictionName("测试");
		dao.add(jurisdictionInfo);
	}

	/**
	 * 修改权限信息dao测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate() {
		JurisdictionInfo jurisdictionInfo = new JurisdictionInfo();
		jurisdictionInfo.setJurisdictionName("测试2");
		jurisdictionInfo.setJurisdictionId(8);
		dao.update(jurisdictionInfo);

	}

	/**
	 * 删除权限信息dao测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		JurisdictionInfo jurisdictionInfo = new JurisdictionInfo();
		jurisdictionInfo.setJurisdictionId(8);
		dao.delete(jurisdictionInfo);
	}

	/**
	 * 根据id查询权限信息dao测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindById() {
		JurisdictionInfo jurisdictionInfo = new JurisdictionInfo();
		jurisdictionInfo.setJurisdictionId(7);
		JurisdictionInfo jurisdiction = dao.findById(jurisdictionInfo);
		System.out.println(jurisdiction);
	}

}
