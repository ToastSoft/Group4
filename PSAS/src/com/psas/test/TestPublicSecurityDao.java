package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.HelpServiceDao;
import com.psas.dao.PublicSecurityDao;
import com.psas.entity.HelpService;
import com.psas.entity.Page;
import com.psas.entity.PublicSecurity;

/**
 * 
 * TODO 警局表Dao层测试
 * @author  Cunbao Song
 * @data:  2017年2月9日 下午5:20:39
 * @version:  V1.0
 */
public class TestPublicSecurityDao {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	PublicSecurityDao dao;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		dao = ac.getBean(PublicSecurityDao.BEAN_NAME, PublicSecurityDao.class);
	}

	/**
	 * 查找所有警局信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<PublicSecurity> users = dao.findAll();
		for (PublicSecurity publicSecurity : users) {
			System.out.println(publicSecurity);
		}
	}

	/**
	 * 新增警局信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testAdd() {
	PublicSecurity p = new PublicSecurity("xxx", "18302460916", "x","x");
	dao.add(p);
		
	}

	/**
	 * 删除警局信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		PublicSecurity p = new PublicSecurity();
		p.setPsId(7);
		dao.delete(p);
	}

	/**
	 * 修改警局用户信息
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate() {
		PublicSecurity p = new PublicSecurity("zz", "18302460916", "x","x");
		p.setPsId(6);
		dao.update(p);
	}

	/**
	 * 分页查询警局信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindUserByPage() {
		PublicSecurity p = new PublicSecurity();
		Page page = new Page(2);
		List<PublicSecurity> p1 = dao.findPublicSecurity(p, page);
		for (PublicSecurity publicSecurity : p1) {
			System.out.println(publicSecurity);
		}
	}

}

