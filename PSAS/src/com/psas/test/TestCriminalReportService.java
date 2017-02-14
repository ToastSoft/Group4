package com.psas.test;

import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.entity.CriminalReport;
import com.psas.entity.FineInfo;
import com.psas.entity.Page;
import com.psas.service.Criminal_ReportService;

/**
 * 
 * 刑事案件信息service测试
 * @author  XuzhenHAO
 * @data:  2017年2月7日 上午9:28:12
 * @version:  V1.0
 */
public class TestCriminalReportService {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	Criminal_ReportService service;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		service = ac.getBean(Criminal_ReportService.BEAN_NAME, Criminal_ReportService.class);
	}
	/**
	 * 
	 * 查询所有刑事案件登记书信息service测试
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll(){
		List<CriminalReport> cr=service.findAll();
		for (CriminalReport criminalReport : cr) {
			System.out.println(criminalReport);
		}
	}
	/**
	 * 新增刑事案件登记书信息的单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testAdd(){
		CriminalReport cr=new CriminalReport();
		cr.setCaseReport("不知");
		cr.setCaseId(19);
		service.add(cr);
	}
	/**
	 * 
	 * 删除刑事案件登记书信息的单元测试
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete(){
		CriminalReport cr=new CriminalReport(null,3);
		service.delete(cr);
	}
	/**
	 * 
	 * 修改刑事案件登记书信息的单元测试
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate(){
		CriminalReport cr=new CriminalReport(null, 5);
		cr.setCaseReport("你是萨比");
		service.update(cr);
	}
	/**
	 * 
	 * 刑事案件登记书信息的分页查询测试
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindCriminalByPage(){
		Page page=new Page(1);
		List<CriminalReport> cr=service.findCriminalByPage(page);
		for (CriminalReport criminalReport : cr) {
			System.out.println(criminalReport);
		}
	}
	/**
	 * 
	 * 根据id查询刑事案件登记书信息
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindCriminalById(){
		CriminalReport cr=new CriminalReport(17, null);
		List<CriminalReport> cr1=service.findCriminalById(cr);
		for (CriminalReport criminalReport : cr1) {
			System.out.println(criminalReport);
		}
}
}
