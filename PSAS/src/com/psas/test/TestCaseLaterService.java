package com.psas.test;

import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.entity.CaseLater;
import com.psas.entity.Page;
import com.psas.service.CaseLaterService;


/**
 * 
 * 未及时破案书信息service测试
 * @author  XuzhenHAO
 * @data:  2017年2月7日 上午10:08:50
 * @version:  V1.0
 */
public class TestCaseLaterService {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	CaseLaterService service;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		service = ac.getBean(CaseLaterService.BEAN_NAME, CaseLaterService.class);
	}
/**
 * 
 * 查找所有未及时破案书信息service测试
 * @throw
 * @return void
 */
@Test
 public void testFindAll(){
	List<CaseLater> cs=service.findAll();
	for (CaseLater caseLater : cs) {
		System.out.println(caseLater);
	}
}
/**
 * 
 * 新增未及时破案书信息service测试
 * @throw
 * @return void
 */
@Test
public void testAdd(){
	CaseLater cs=new CaseLater();
	cs.setCaseId(2);
	cs.setLaterReason("黑社会的老牛逼");
	cs.setSupplyInfo("不屌他");
	service.add(cs);
}
/**
 * 
 * 删除未及时破案书信息service测试
 * @throw
 * @return void
 */
@Test
public void testDelete(){
	service.delete(new CaseLater(2));
}
/**
 * 
 * 修改未及时破案书信息service测试
 * @throw
 * @return void
 */
@Test
public void testUpdate(){
	CaseLater cs=new CaseLater(2);
	cs.setLaterReason("黑白通吃");
	cs.setSupplyInfo("厉害");
	service.update(cs);
	
}
/**
 * 
 * 分页查询未及时破案书信息
 * @throw
 * @return void
 */
@Test
public void testFindByPage(){
	Page page=new Page(1);
	List<CaseLater> cs=service.findByPage(page);
	for (CaseLater caseLater : cs) {
		System.out.println(caseLater);
	}
}
/**
 * 
 * 根据id查未及时破案书信息
 * @throw
 * @return void
 */
@Test
public void testFindById(){
	CaseLater caseLater=new CaseLater(3);
	List<CaseLater> cs=service.findById(caseLater);
	for (CaseLater caseLater2 : cs) {
		System.out.println(caseLater2);
	}
	
}

}
