package com.psas.test;

import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.CaseLaterDao;
import com.psas.entity.CaseLater;
import com.psas.entity.Page;

public class TestCaseLaterDao {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	CaseLaterDao dao;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		dao = ac.getBean(CaseLaterDao.BEAN_NAME, CaseLaterDao.class);
	}
	/**
	 * 
	 * 查找所有未及时破案说明书信息DAO单元测试
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll(){
		List<CaseLater> cl=dao.findAll();
		for (CaseLater caseLater : cl) {
			System.out.println(caseLater);
		}
		
	}
	/**
	 * 
	 * 新增未及时破案说明书信息DAO单元测试
	 * @throw
	 * @return void
	 */
	@Test
	public void testAdd(){
		CaseLater later=new CaseLater();
		later.setCaseId(17);
		later.setLaterReason("么么哒");
		later.setSupplyInfo("没了");
		dao.add(later);
	}
	/**
	 * 
	 * 删除未及时说明书信息DAO单元测试
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete(){
		CaseLater later=new CaseLater(4);
		dao.delete(later);
	}
	/**
	 * 
	 * 修改未及时破案书信息DAO单元测试
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate(){
		CaseLater later=new CaseLater(3);
		later.setLaterReason("拿包走了");
		later.setSupplyInfo("I don't know");
		dao.update(later);
	}
	/**
	 * 
	 * 未及时破案书信息分页查询DAO单元测试
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindCaseByPage(){
		Page page=new Page(1);
		List<CaseLater> cl=dao.findCase(null, page);
		for (CaseLater caseLater : cl) {
			System.out.println(caseLater);
		}
	}
	/**
	 * 
	 * 根据ID查找所有未及时破案书信息
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindCaseById(){
		List<CaseLater> cl1=dao.findCase(new CaseLater(1),null);
		for (CaseLater caseLater : cl1) {
			System.out.println(caseLater);
		}
	}

}
