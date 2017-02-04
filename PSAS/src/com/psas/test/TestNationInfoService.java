package com.psas.test;

import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.entity.NationInfo;
import com.psas.service.NationInfoService;

/**
 * 民族信息service单元测试
 * @author  XulaiWang
 * @data:  2017年2月4日 下午4:57:11
 * @version:  V1.0
 */
public class TestNationInfoService {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	NationInfoService service;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		service = ac.getBean(NationInfoService.BEAN_NAME, NationInfoService.class);
	}

	/**
	 * 查找所有民族信息service测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<NationInfo> nations = service.findAll();
		for (NationInfo nation : nations) {
			System.out.println(nation);
		}
	}

	/**
	 * 根据id查找民族信息service测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void findById() {
		NationInfo nation = new NationInfo(10);
		NationInfo nationInfo = service.findById(nation);
		System.out.println(nationInfo);
	}
}
