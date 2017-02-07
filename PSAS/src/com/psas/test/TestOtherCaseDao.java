package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.OtherCaseDao;
import com.psas.dao.SecurityInfoDao;
import com.psas.entity.OtherCase;
import com.psas.entity.Page;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.SecurityInfo;

/**
 * 
 * TODO治安案件登记表的Dao层测试
 * @author  Cunbao Song
 * @data:  2017年2月6日 上午9:24:20
 * @version:  V1.0
 */
public class TestOtherCaseDao {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	OtherCaseDao dao;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		dao = ac.getBean(OtherCaseDao.BEAN_NAME, OtherCaseDao.class);
	}

	/**
	 * 查找所有用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<OtherCase> users = dao.findAll();
		for (OtherCase otherCase : users) {
			System.out.println(otherCase);
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
		OtherCase o = new OtherCase("x","x",new Timestamp(System.currentTimeMillis()),"x","x",0);
		dao.add(o);
		
	}

	/**
	 * 删除用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		OtherCase o = new OtherCase();
		o.setOtherId(3);
		dao.delete(o);
	}

	/**
	 * 修改其它用户信息
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate() {
		OtherCase o = new OtherCase("xx","x",new Timestamp(System.currentTimeMillis()),"x","x",0);
		o.setOtherId(4);
		dao.update(o);
	}

	/**
	 * 分页查询用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindUserByPage() {
		OtherCase o = new OtherCase();
		o.setOtherId(1);
		Page page = new Page(1);
		List<OtherCase> users = dao.findUser(o, page);
		for (OtherCase otherCase : users) {
			System.out.println(otherCase);
		}
		
	}

}

