package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.CriminalInfoDao;
import com.psas.dao.SecurityInfoDao;
import com.psas.entity.CriminalInfo;
import com.psas.entity.Page;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.SecurityInfo;

/**
 * 
 * TODO 刑事案件登记表的Dao层测试
 * @author  Cunbao Song
 * @data:  2017年2月6日 上午9:24:20
 * @version:  V1.0
 */
public class TestCriminalInfoDao {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	CriminalInfoDao dao;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		dao = ac.getBean(CriminalInfoDao.BEAN_NAME, CriminalInfoDao.class);
	}

	/**
	 * 查找所有用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<CriminalInfo> users = dao.findAll();
		for (CriminalInfo c : users) {
			System.out.println(c);
		}
	}

	/**
	 * 新增用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testAdd() {
		CriminalInfo c = new CriminalInfo();
		c.setCaseSupply("xxxx");
		c.setCriminalSituation("xxx");
		c.setSupplyInfo("xx");
		c.setCaseId(1);
		c.setCriminalResult("xxxxxx");
		dao.add(c);
		
	}

	/**
	 * 删除用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		CriminalInfo c = new CriminalInfo();
		c.setCriminalId(3);
		dao.delete(c);
	}

	/**
	 * 修改其它用户信息
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate() {
		CriminalInfo c = new CriminalInfo();
		c.setCaseSupply("xxxx");
		c.setCriminalSituation("xxx");
		c.setSupplyInfo("xxxxxx");
		c.setCaseId(1);
		c.setCriminalResult("xxxxxx");
		c.setCriminalId(4);
		dao.update(c);
	}

	/**
	 * 分页查询用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindUserByPage() {
		CriminalInfo c = new CriminalInfo();
		c.setCriminalId(1);
		Page page = new Page(1);
		List<CriminalInfo> users = dao.findUser(c, page);
		for (CriminalInfo criminalInfo : users) {
			System.out.println(criminalInfo);
		}
		
	}

}

