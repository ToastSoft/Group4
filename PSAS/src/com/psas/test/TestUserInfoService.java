package com.psas.test;

import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.entity.UserInfo;
import com.psas.service.UserInfoService;

public class TestUserInfoService {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	UserInfoService service;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		service = ac.getBean(UserInfoService.BEAN_NAME, UserInfoService.class);
	}

	@Test
	public void findAll() {
		List<UserInfo> users = service.findAll();
		for (UserInfo u : users) {
			System.out.println(u);
		}
	}
}
