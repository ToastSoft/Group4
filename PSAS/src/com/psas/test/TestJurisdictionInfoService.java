package com.psas.test;

import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.entity.JurisdictionInfo;
import com.psas.service.JurisdictionInfoService;
import com.psas.service.LogInfoService;

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

	@Test
	public void testFindAll() {
		List<JurisdictionInfo> jurisdictions = service.findAll();
		for (JurisdictionInfo jurisdictionInfo : jurisdictions) {
			System.out.println(jurisdictionInfo);
		}
	}
	
	
}









