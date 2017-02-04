package com.psas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.psas.dao.NationInfoDao;
import com.psas.entity.NationInfo;
import com.psas.service.NationInfoService;

/**
 * 民族信息service 实现
 * @author  XulaiWang
 * @data:  2017年2月4日 下午4:52:18
 * @version:  V1.0
 */
@Service("nationInfoService")
public class NationInfoServiceImpl implements NationInfoService {
	@Resource(name = NationInfoDao.BEAN_NAME)
	public NationInfoDao dao;

	/**
	 * 查询所有民族信息service实现
	 * 重载方法
	 * @return
	 */
	@Override
	public List<NationInfo> findAll() {
		return dao.findAll();
	}

	/**
	 * 根据民族id查找民族信息service实现
	 * 重载方法
	 * @param nation
	 * @return
	 */
	@Override
	public NationInfo findById(NationInfo nation) {
		return dao.findNationInfoById(nation);
	}

	public NationInfoDao getDao() {
		return dao;
	}

	public void setDao(NationInfoDao dao) {
		this.dao = dao;
	}

}
