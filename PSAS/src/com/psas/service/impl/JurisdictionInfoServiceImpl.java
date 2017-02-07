package com.psas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.psas.dao.JurisdictionInfoDao;
import com.psas.entity.JurisdictionInfo;
import com.psas.service.JurisdictionInfoService;

/**
 * 权限信息service实现
 * @author  XulaiWang
 * @data:  2017年2月7日 上午9:32:30
 * @version:  V1.0
 */
@Service(JurisdictionInfoService.BEAN_NAME)
public class JurisdictionInfoServiceImpl implements JurisdictionInfoService {

	@Resource(name = JurisdictionInfoDao.BEAN_NAME)
	public JurisdictionInfoDao dao;

	/**
	 * 查询所有权限信息service实现
	 * @return
	 * @throw
	 * @return List<JurisdictionInfo>
	 */
	@Override
	public List<JurisdictionInfo> findAll() {
		return dao.findAll();
	}

	/**
	 * 增加权限信息service实现
	 * @param jurisdiction
	 * @throw
	 * @return void
	 */
	@Override
	public void add(JurisdictionInfo jurisdiction) {
		dao.add(jurisdiction);
	}

	/**
	 * 修改权限service实现
	 * @param jurisdiction
	 * @throw
	 * @return void
	 */
	@Override
	public void update(JurisdictionInfo jurisdiction) {
		dao.update(jurisdiction);
	}

	/**
	 * 删除权限信息service实现
	 * @param jurisdiction
	 * @throw
	 * @return void
	 */
	@Override
	public void delete(JurisdictionInfo jurisdiction) {
		dao.delete(jurisdiction);
	}

	/**
	 * 根据id查询权限信息service实现
	 * @param jurisdiction
	 * @return
	 * @throw
	 * @return JurisdictionInfo
	 */
	@Override
	public JurisdictionInfo findById(JurisdictionInfo jurisdiction) {
		return dao.findById(jurisdiction);
	}

	public JurisdictionInfoDao getDao() {
		return dao;
	}

	public void setDao(JurisdictionInfoDao dao) {
		this.dao = dao;
	}

}
