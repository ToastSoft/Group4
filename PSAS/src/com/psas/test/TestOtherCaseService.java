package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.entity.OtherCase;
import com.psas.entity.Page;
import com.psas.entity.UserInfo;
import com.psas.service.OtherCaseService;

/**
 * 
 * TODO其他案件登记表service层测试
 * @author  Cunbao Song
 * @data:  2017年2月7日 下午3:15:17
 * @version:  V1.0
 */
public class TestOtherCaseService {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	OtherCaseService service;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		service = ac.getBean(OtherCaseService.BEAN_NAME, OtherCaseService.class);
	}

	/**
	 * 查询所有用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<OtherCase> users = service.findAll();
		for (OtherCase otherCase : users) {
			System.out.println(otherCase);
		}
	}

	/**
	 * 新增用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testAdd() {
		OtherCase o = new OtherCase("x","x",new Timestamp(System.currentTimeMillis()),"x","x",0);
		service.add(o);
	}

	/**
	 * 删除用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		OtherCase o = new OtherCase();
		o.setOtherId(4);
		service.delete(o);

	}

	/**
	 * 修改用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate() {
		OtherCase o = new OtherCase("xx","x",new Timestamp(System.currentTimeMillis()),"x","x",0);
		o.setOtherId(5);
		service.update(o);
	}

	/**
	 * 根据id查找用户信息service测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindById() {
		OtherCase o = new OtherCase();
		o.setOtherId(1);
		OtherCase o1 = service.findUserById(o);
		System.out.println(o1);
	}

	/**
	 * 分页查询用户信息service单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindByPage() {
		Page page = new Page(1);
		List<OtherCase> users = service.findUserByPage(page);
		for (OtherCase otherCase : users) {
			System.out.println(otherCase);
		}
	}

}
