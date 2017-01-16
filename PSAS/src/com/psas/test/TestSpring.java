package com.psas.test;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Spring 单元测试
 * @author  XulaiWang
 * @data:  2017年1月14日 上午9:48:20
 * @version:  V1.0
 */
public class TestSpring {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
	}

	@Test
	public void testSpring() {
		SqlSessionFactory ssf = (SqlSessionFactory) ac.getBean("sqlSessionFactory");
		System.out.println(ssf);
	}
}
