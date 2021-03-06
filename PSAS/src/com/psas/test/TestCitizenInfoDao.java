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
import com.psas.entity.Page;

/**
 * 公民信息dao单元测试
 * @author  XulaiWang
 * @data:  2017年2月6日 上午10:07:58
 * @version:  V1.0
 */
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

	/**
	 * 查询所有公民信息dao单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<CitizenInfo> citizens = dao.findAll();
		for (CitizenInfo c : citizens) {
			System.out.println(c);
		}
	}

	/**
	 * 删除公民信息dao单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		CitizenInfo citizenInfo = new CitizenInfo("210203199101311544");
		dao.delete(citizenInfo);

	}

	/**
	 * 增加公民信息dao单元测试
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
		CitizenInfo citizen = new CitizenInfo("210203199101311544", "王大", 22, "1", bir, "马栏河", "程序员", "yulinInfo", 1);
		dao.add(citizen);
	}

	/**
	 * 修改公民信息dao单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate() {
		CitizenInfo citizen = new CitizenInfo();
		citizen.setIdCard("210203199101311544");
		citizen.setIdName("王老六2");
		citizen.setIdAge(10);
		citizen.setIdGender("0");
		citizen.setIdBirthday(new Date());
		citizen.setIdAddress("泉水");
		citizen.setIdProfessional("无业游民");
		citizen.setIdCompany("没有");
		citizen.setNationId(2);
		dao.update(citizen);
	}

	/**
	 * 根据身份证查询公民信息dao单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindById() {
		CitizenInfo citizenInfo = new CitizenInfo("210203199101311544");
		List<CitizenInfo> citizen = dao.findCitizen(citizenInfo, null);
		for (CitizenInfo c : citizen) {
			System.out.println(c);
		}
	}

	/**
	 * 根据姓名查找公民信息dao单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindByName() {
		CitizenInfo citizenInfo = new CitizenInfo();
		citizenInfo.setIdName("王老六2");
		List<CitizenInfo> citizen = dao.findCitizen(citizenInfo, null);
		for (CitizenInfo c : citizen) {
			System.out.println(c);
		}
	}

	/**
	 * 根据民族查询公民信息dao单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindByNation() {
		CitizenInfo citizenInfo = new CitizenInfo();
		citizenInfo.setNationId(16);
		List<CitizenInfo> citizen = dao.findCitizen(citizenInfo, null);
		for (CitizenInfo c : citizen) {
			System.out.println(c);
		}
	}

	/**
	 * 分页查询公民信息dao单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindByPage() {
		Page page = new Page(2);
		List<CitizenInfo> citizen = dao.findCitizen(null, page);
		for (CitizenInfo c : citizen) {
			System.out.println(c);
		}

	}

}
