package com.psas.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.CitizenInfoDao;
import com.psas.dao.LogInfoDao;
import com.psas.entity.CitizenInfo;

public class TestCitizenInfoDao {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	CitizenInfoDao dao;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		dao = ac.getBean(CitizenInfoDao.BEAN_NAME, CitizenInfoDao.class);
	}

	@Test
	public void testFindAll() {
		List<CitizenInfo> citizens = dao.findAll();
		for (CitizenInfo c : citizens) {
			System.out.println(c);
		}
	}

	@Test
	public void testDelete() {
		CitizenInfo citizenInfo = new CitizenInfo("210203199101311544");
		dao.delete(citizenInfo);

	}

	@Test
	public void testAdd() throws ParseException {
		Date bir = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String str = new String("1991-01-31");
		bir = sdf.parse(str);
		System.out.println(bir);
		CitizenInfo citizen = new CitizenInfo("210203199101311544", "王大", 22, "1", bir, "马栏河", "程序员", "yulinInfo", 1);
		dao.add(citizen);
	}

}
