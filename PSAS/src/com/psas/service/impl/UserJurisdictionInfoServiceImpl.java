package com.psas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.psas.dao.UserJurisdictionInfoDao;
import com.psas.entity.UserJurisdictionInfo;
import com.psas.service.UserJurisdictionInfoService;

/**
 * 用户与权限service实现
 * @author  XulaiWang
 * @data:  2017年2月7日 下午3:29:20
 * @version:  V1.0
 */
@Service(UserJurisdictionInfoService.BEAN_NAME)
public class UserJurisdictionInfoServiceImpl implements UserJurisdictionInfoService {
	@Resource(name = UserJurisdictionInfoDao.BEAN_NAME)
	private UserJurisdictionInfoDao dao;

	/**
	 * 查找所有用户与权限service实现
	 * 重载方法
	 * @return
	 */
	@Override
	public List<UserJurisdictionInfo> findAll() {
		return dao.findAll();
	}

	/**
	 * 增加用户与权限service实现
	 * 重载方法
	 * @param userJurisdictionInfo
	 */
	@Override
	public void add(UserJurisdictionInfo userJurisdictionInfo) {
		dao.add(userJurisdictionInfo);
	}

	/**
	 * 删除用户与权限service实现
	 * 重载方法
	 * @param userJurisdictionInfo
	 */
	@Override
	public void delete(UserJurisdictionInfo userJurisdictionInfo) {
		dao.delete(userJurisdictionInfo);
	}

	/**
	 * 根据id查找用户与权限service实现
	 * 重载方法
	 * @param userJurisdictionInfo
	 * @return
	 */
	@Override
	public UserJurisdictionInfo findById(UserJurisdictionInfo userJurisdictionInfo) {
		return dao.findUserJurisdictionInfo(userJurisdictionInfo).get(0);
	}

	/**
	 * 根据userId查找用户与权限service实现
	 * 重载方法
	 * @param userJurisdictionInfo
	 * @return
	 */
	@Override
	public List<UserJurisdictionInfo> findByUserId(UserJurisdictionInfo userJurisdictionInfo) {
		return dao.findUserJurisdictionInfo(userJurisdictionInfo);
	}

	/**
	 * 根据jurisdictionId查找用户与权限service实现
	 * 重载方法
	 * @param userJurisdictionInfo
	 * @return
	 */
	@Override
	public List<UserJurisdictionInfo> findByJurisdictionId(UserJurisdictionInfo userJurisdictionInfo) {
		return dao.findUserJurisdictionInfo(userJurisdictionInfo);
	}

	public UserJurisdictionInfoDao getDao() {
		return dao;
	}

	public void setDao(UserJurisdictionInfoDao dao) {
		this.dao = dao;
	}

}
