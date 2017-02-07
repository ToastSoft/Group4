package com.psas.test;

import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.entity.JurisdictionInfo;
import com.psas.service.JurisdictionInfoService;

/**
 * 权限信息service单元测试
 * @author  XulaiWang
 * @data:  2017年2月7日 上午10:07:59
 * @version:  V1.0
 */
public class TestJurisdictionInfoService {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	JurisdictionInfoService service;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		service = ac.getBean(JurisdictionInfoService.BEAN_NAME, JurisdictionInfoService.class);
	}

	/**
	 * 查看所有权限信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<JurisdictionInfo> jurisdictions = service.findAll();
		for (JurisdictionInfo jurisdictionInfo : jurisdictions) {
			System.out.println(jurisdictionInfo);
		}
	}

	/**
	 * 增加权限信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testAdd() {
		JurisdictionInfo jurisdictionInfo = new JurisdictionInfo();
		jurisdictionInfo.setJurisdictionName("测试");
		service.add(jurisdictionInfo);
	}

	/**
	 * 修改权限信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate() {
		JurisdictionInfo jurisdictionInfo = new JurisdictionInfo();
		jurisdictionInfo.setJurisdictionName("测试222");
		jurisdictionInfo.setJurisdictionId(9);
		service.update(jurisdictionInfo);
	}

	/**
	 * 删除权限信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		JurisdictionInfo jurisdictionInfo = new JurisdictionInfo();
		jurisdictionInfo.setJurisdictionId(9);
		service.delete(jurisdictionInfo);
	}

	/**
	 * 根据id查找权限信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindById() {
		JurisdictionInfo jurisdictionInfo = new JurisdictionInfo();
		jurisdictionInfo.setJurisdictionId(2);
		JurisdictionInfo jurisdiction = service.findById(jurisdictionInfo);
		System.out.println(jurisdiction);
	}

}
