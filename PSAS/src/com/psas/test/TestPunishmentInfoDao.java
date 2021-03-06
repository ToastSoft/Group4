package com.psas.test;

import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psas.dao.PunishmentInfoDao;
import com.psas.dao.UserInfoDao;
import com.psas.entity.Page;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.UserInfo;

/**
 * 
 * TODO 公安局治安，行政处罚人员情况登记表的dao层测试
 * @author  Cunbao Song
 * @data:  2017年2月5日 下午2:37:04
 * @version:  V1.0
 */
public class TestPunishmentInfoDao {
	ClassPathXmlApplicationContext ac;
	String conf = "applicationContext.xml";
	PunishmentInfoDao dao;

	static {
		PropertyConfigurator.configure("log/log4j.properties");
	}

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext(conf);
		dao = ac.getBean(PunishmentInfoDao.BEAN_NAME, PunishmentInfoDao.class);
	}

	/**
	 * 查找所有用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindAll() {
		List<PunishmentInfo> users = dao.findAll();
		for (PunishmentInfo punishmentInfo : users) {
			System.out.println(punishmentInfo);
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
		PunishmentInfo p=new PunishmentInfo();
		p.setCaseId(1);
		p.setIdCard("210203199304121831");
		p.setPsId(1);
		p.setPunishmentSituation("见义勇为卡到了");
		p.setPunishmentTime(new Timestamp(System.currentTimeMillis()));
		dao.add(p);
		
	}

	/**
	 * 删除用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testDelete() {
		
		PunishmentInfo p=new PunishmentInfo();
		p.setPunishmentId(3);
		dao.delete(p);
	}

	/**
	 * 修改其它用户信息
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testUpdate() {
		PunishmentInfo p=new PunishmentInfo();
		p.setPunishmentId(3);
		p.setCaseId(2);
		p.setIdCard("210203199301315277");
		p.setPsId(2);
		p.setPunishmentTime(new Timestamp(System.currentTimeMillis()));
		dao.update(p);
	}

	/**
	 * 分页查询用户信息单元测试
	 * 
	 * @throw
	 * @return void
	 */
	@Test
	public void testFindUserByPage() {
		Page page = new Page(2);
		List<PunishmentInfo> users = dao.findUser(null, page);
		for (PunishmentInfo p : users) {
			System.out.println(p);
		}
		
	}

}

