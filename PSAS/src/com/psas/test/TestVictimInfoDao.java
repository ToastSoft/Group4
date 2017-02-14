package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.VictimInfoDao;
import com.psas.entity.Page;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.VictimInfo;

/**
 * 
 * TODO 受害人信息表dao层测试
 * @author  Cunbao Song
 * @data:  2017年2月9日 上午9:01:08
 * @version:  V1.0
 */
public class TestVictimInfoDao {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	VictimInfoDao dao;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		dao = ac.getBean(VictimInfoDao.BEAN_NAME, VictimInfoDao.class);
	}

	/**
	 * 查找所有用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<VictimInfo> users = dao.findAll();
		for (VictimInfo victimInfo : users) {
			System.out.println(victimInfo);
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
		VictimInfo v = new VictimInfo();
		v.setCaseId(1);
		v.setIdCard("210203199304121831");
		dao.add(v);
		
	}

	/**
	 * 删除用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		
		VictimInfo v = new VictimInfo();
		v.setVictimId(3);
		dao.delete(v);
	}

	/**
	 * 修改其它用户信息
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate() {
		VictimInfo v = new VictimInfo();
		v.setCaseId(2);
		v.setIdCard("210203199304121831");
		v.setVictimId(4);
		dao.update(v);
	}

	/**
	 * 分页查询用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindUserByPage() {
		Page page = new Page(1);
		List<VictimInfo> users = dao.findUser(null, page);
		for (VictimInfo victimInfo : users) {
			System.out.println(victimInfo);
		}
		
	}

}

