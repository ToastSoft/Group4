package com.psas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.psas.dao.CitizenInfoDao;
import com.psas.entity.CitizenInfo;
import com.psas.entity.Page;
import com.psas.service.CitizenInfoService;

/**
 * 公民信息service实现
 * @author  XulaiWang
 * @data:  2017年2月6日 上午10:29:36
 * @version:  V1.0
 */
@Service(CitizenInfoService.BEAN_NAME)
public class CitizenInfoServiceImpl implements CitizenInfoService {
	@Resource(name = CitizenInfoDao.BEAN_NAME)
	public CitizenInfoDao dao;

	/**
	 * 查询所有公民信息service实现
	 * 重载方法
	 * @return
	 */
	@Override
	public List<CitizenInfo> findAll() {
		return dao.findAll();
	}

	/**
	 * 增加公民信息service实现
	 * 重载方法
	 * @param citizen
	 */
	@Override
	public void add(CitizenInfo citizen) {
		dao.add(citizen);
	}

	/**
	 * 删除公民信息service实现
	 * 重载方法
	 * @param citizen
	 */
	@Override
	public void delete(CitizenInfo citizen) {
		dao.delete(citizen);
	}

	/**
	 * 修改公民信息service实现
	 * 重载方法
	 * @param citizen
	 */
	@Override
	public void update(CitizenInfo citizen) {
		dao.update(citizen);
	}

	/**
	 * 根据id查找公民信息service实现
	 * 重载方法
	 * @param citizen
	 * @return
	 */
	@Override
	public CitizenInfo findById(CitizenInfo citizen) {
		return dao.findCitizen(citizen, null).get(0);
	}

	/**
	 * 根据姓名查找公民service实现
	 * 重载方法
	 * @param citizen
	 * @return
	 */
	@Override
	public List<CitizenInfo> findByName(CitizenInfo citizen) {
		return dao.findCitizen(citizen, null);
	}

	/**
	 * 根据民族查找公民信息service实现
	 * 重载方法
	 * @param citizen
	 * @return
	 */
	@Override
	public List<CitizenInfo> findByNation(CitizenInfo citizen) {
		return dao.findCitizen(citizen, null);
	}

	/**
	 * 分页查询公民信息service实现
	 * 重载方法
	 * @param page
	 * @return
	 */
	@Override
	public List<CitizenInfo> findByPage(Page page) {
		return dao.findCitizen(null, page);
	}

	public CitizenInfoDao getDao() {
		return dao;
	}

	public void setDao(CitizenInfoDao dao) {
		this.dao = dao;
	}

}
