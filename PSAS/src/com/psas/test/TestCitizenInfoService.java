package com.psas.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.entity.CitizenInfo;
import com.psas.entity.Page;
import com.psas.service.CitizenInfoService;

/**
 * 公民信息service单元测试
 * @author  XulaiWang
 * @data:  2017年2月6日 上午11:04:43
 * @version:  V1.0
 */
public class TestCitizenInfoService {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	CitizenInfoService service;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		service = ac.getBean(CitizenInfoService.BEAN_NAME, CitizenInfoService.class);
	}

	/**
	 * 查找所有公民信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<CitizenInfo> citizens = service.findAll();
		for (CitizenInfo c : citizens) {
			System.out.println(c);
		}
	}

	/**
	 * 增加公民信息service单元测试
	 * @throws ParseException
	 * @throw
	 * @return void
	 */
	@Test
	public void testAdd() throws ParseException {
		Date bir = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String str = new String("1991-01-31");
		bir = sdf.parse(str);
		System.out.println(bir);
		CitizenInfo citizen = new CitizenInfo("210203199101311234", "新民振", 22, "1", bir, "马栏河", "程序员", "yulinInfo", 1);
		service.add(citizen);
	}

	/**
	 * 删除公民信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		String idCard = "210203199101311234";
		CitizenInfo citizen = new CitizenInfo(idCard);
		service.delete(citizen);
	}

	/**
	 * 修改公民信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate() {
		CitizenInfo citizen = new CitizenInfo();
		citizen.setIdCard("210203199101311234");
		citizen.setIdName("王老六5");
		citizen.setIdAge(10);
		citizen.setIdGender("0");
		citizen.setIdBirthday(new Date());
		citizen.setIdAddress("泉水");
		citizen.setIdProfessional("无业游民");
		citizen.setIdCompany("没有");
		citizen.setNationId(2);
		service.update(citizen);
	}

	/**
	 * 根据身份证查找公民信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindById() {
		CitizenInfo citizen = new CitizenInfo("210203199101311234");
		CitizenInfo citizenInfo = service.findById(citizen);
		System.out.println(citizenInfo);
	}

	/**
	 * 根据姓名查找公民信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindName() {
		CitizenInfo citizen = new CitizenInfo();
		citizen.setIdName("王老六5");
		List<CitizenInfo> citizens = service.findByName(citizen);
		for (CitizenInfo c : citizens) {
			System.out.println(c);
		}
	}

	/**
	 * 根据民族查找公民信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindByNation() {
		CitizenInfo citizen = new CitizenInfo();
		citizen.setNationId(16);
		List<CitizenInfo> citizens = service.findByNation(citizen);
		for (CitizenInfo c : citizens) {
			System.out.println(c);
		}
	}

	/**
	 * 分页查询公民信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindByPage() {
		Page page = new Page(2);
		List<CitizenInfo> citizens = service.findByPage(page);
		for (CitizenInfo c : citizens) {
			System.out.println(c);
		}
	}

}
