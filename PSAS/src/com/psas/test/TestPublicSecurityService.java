package com.psas.test;

import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.PublicSecurityDao;
import com.psas.entity.IllegalInfo;
import com.psas.entity.Page;
import com.psas.entity.PublicSecurity;
import com.psas.service.PublicSecurityService;

/**
 * 
 * TODO 警局表service层实现测试
 * @author  Cunbao Song
 * @data:  2017年2月10日 上午9:15:29
 * @version:  V1.0
 */
public class TestPublicSecurityService {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	PublicSecurityService service;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		service = ac.getBean(PublicSecurityService.BEAN_NAME, PublicSecurityService.class);
	}

	/**
	 * 查找所有警局信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<PublicSecurity> users = service.findAll();
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
	service.add(p);
		
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
		p.setPsId(6);
		service.delete(p);
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
		p.setPsId(8);
		service.update(p);
	}


	/**
	 * 根据id查找用户信息service测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindById() {
		PublicSecurity p = new PublicSecurity();
		p.setPsId(1);
		PublicSecurity p1 = service.findPublicSecurityById(p);
		System.out.println(p1);
	}

	/**
	 * 分页查询用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindByPage() {
		Page page = new Page(2);
		List<PublicSecurity> p = service.findPublicSecurityByPage(page);
		for (PublicSecurity publicSecurity : p) {
			System.out.println(publicSecurity);
		}
	}

}

