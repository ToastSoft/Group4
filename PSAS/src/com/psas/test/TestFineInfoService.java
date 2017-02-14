package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.entity.FineInfo;
import com.psas.entity.Page;
import com.psas.service.FineInfoService;

public class TestFineInfoService {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	FineInfoService service;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		service = ac.getBean(FineInfoService.BEAN_NAME, FineInfoService.class);
	}
	/**
	 * 查询所有追缴信息的service测试
	 * TODO<请描述这个方法是干什么的>
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll(){
		List<FineInfo> fine=service.findAll();
		for (FineInfo fineInfo : fine) {
			System.out.println(fineInfo);
		}
	}
	/**
	 * 
	 * 新增追缴信息的service测试
	 * @throw
	 * @return void
	 */
	@Test
	public void testAdd(){
		FineInfo fine=new FineInfo();
		fine.setCaseId(22);
		fine.setFineCharacter("aaa枪");
		fine.setFineId(4);
		fine.setFineReason("调戏妇女");
		fine.setFineTime(new Timestamp(System.currentTimeMillis()));
		fine.setFineType(1);
		fine.setIdCard("21028319920804xxxx");
		fine.setPolicemanId(10);
		service.add(fine);
	}
	/**
	 * 
	 * 删除追缴信息的service测试
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete(){
		FineInfo fine=new FineInfo(4);
		service.delete(fine);
	}
	/**
	 * 
	 * 更改追缴信息的service测试
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate(){
		FineInfo fine=new FineInfo(1);
		fine.setFineReason("耍流氓");
		service.update(fine);
	}
	/**
	 * 
	 * 分页查询追缴信息
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindfineByPage(){
		Page page=new Page(1);
		List<FineInfo> fine=service.findByPage(page);
		for (FineInfo fineInfo : fine) {
			System.out.println(fineInfo);
		}
	}
	/**
	 * 
	 * 根据追缴id查找信息
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindById(){
		FineInfo fine2=new FineInfo(2);
		List<FineInfo> fine=service.findById(fine2);
		if(fine.size()==1){
			System.out.println(fine.get(0));
		}else if(fine.size()==0){
			System.out.println("没有信息");
		}else{
			System.out.println("查找错误");
		}
	}
	/**
	 * 
	 * 根据追缴idCard查找信息
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindByIdCard(){
		FineInfo f=new FineInfo("210203199301315266");
		List<FineInfo> fi=service.findById(f);
		for (FineInfo fineInfo : fi) {
			System.out.println(fineInfo);
		}
	}

}
