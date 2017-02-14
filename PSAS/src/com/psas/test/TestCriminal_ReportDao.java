package com.psas.test;

import java.sql.Timestamp;
import java.util.List;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.Criminal_ReportDao;
import com.psas.entity.CriminalReport;
import com.psas.entity.Page;


public class TestCriminal_ReportDao {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	Criminal_ReportDao dao;
	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		dao = ac.getBean(Criminal_ReportDao.BEAN_NAME, Criminal_ReportDao.class);
	}
	/**
	 * 
	 * 查找所有刑事案件登记书信息DAO单元测试
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll(){
		List<CriminalReport> cr=dao.findAll();
		for (CriminalReport criminalReport : cr) {
			System.out.println(criminalReport);
		}
	}
	/**
	 * 
	 * 新增刑事案件登记书信息DAO单元测试
	 * @throw
	 * @return void
	 */
	@Test
	public void testAdd(){
		CriminalReport cr=new CriminalReport();
		cr.setCaseId(1);
		cr.setCaseReport("hahh");
		cr.setReportTime(new Timestamp(System.currentTimeMillis()));
		dao.add(cr);
		System.out.println(cr.toString());
	}
	/**
	 * 
	 * 删除刑事案件登记书信息DAO单元测试
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete(){
		CriminalReport cr=new CriminalReport(null, 4);
		dao.delete(cr);
	}
	/**
	 * 
	 * 修改刑事案件登记书信息DAO单元测试
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate(){
		CriminalReport cr=new CriminalReport(null,3);
		cr.setCaseReport("草尼玛");
		cr.setCaseId(18);
		dao.update(cr);
	}
	/**
	 * 
	 * 刑事案件登记书信息分页查询DAO单元测试
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindCriminalByPage() {
		Page page = new Page(1);
		List<CriminalReport> cr = dao.findCriminal(null, page);
		for (CriminalReport criminalReport : cr) {
			System.out.println(criminalReport);
		}
	}
	/**
	 * 
	 *  刑事案件登记书信息根据id查询DAO测试
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindCriminal() {
		List<CriminalReport> cr = dao.findCriminal(new CriminalReport(1,null), null);
		for (CriminalReport criminalReport : cr) {
			System.out.println(criminalReport);
		}
		
	}

}
