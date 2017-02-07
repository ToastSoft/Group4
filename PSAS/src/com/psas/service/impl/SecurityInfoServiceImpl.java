package com.psas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.psas.dao.SecurityInfoDao;
import com.psas.entity.Page;
import com.psas.entity.SecurityInfo;
import com.psas.service.SecurityInfoService;

/**
 * 治安案件登记表的service实现
 * @author  XulaiWang
 * @data:  2017年2月4日 下午3:54:35
 * @version:  V1.0
 */
@Service("securityInfoService")
public class SecurityInfoServiceImpl implements SecurityInfoService {
	@Resource(name = SecurityInfoDao.BEAN_NAME)
	private SecurityInfoDao dao;

	/**
	 * 查询所有用户信息service实现
	 * 重载方法
	 * @return List<SecurityInfo>
	 */
	@Override
	public List<SecurityInfo> findAll() {
		return dao.findAll();
	}

	/**
	 * 新增用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void add(SecurityInfo securityInfo) {
		dao.add(securityInfo);
	}

	/**
	 * 删除用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void delete(SecurityInfo securityInfo) {
		dao.delete(securityInfo);
	}

	/**
	 * 修改用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void update(SecurityInfo securityInfo) {
		dao.update(securityInfo);
	}

	/**
	 * 根据用户id查找用户信息service实现
	 * 重载方法
	 * @param user
	 * @return SecurityInfo
	 */
	@Override
	public SecurityInfo findUserById(SecurityInfo securityInfo) {
		List<SecurityInfo> u = dao.findUser(securityInfo, null);
		if (u.size() == 1) {
			return u.get(0);
		}
		return null;
	}

	/**
	 * 分页查询用户信息service实现
	 * 重载方法
	 * @param page
	 * @return List<SecurityInfo>
	 */
	@Override
	public List<SecurityInfo> findUserByPage(Page page) {
		return dao.findUser(null, page);
	}

	public SecurityInfoDao getDao() {
		return dao;
	}

	public void setDao(SecurityInfoDao dao) {
		this.dao = dao;
	}

	

	

}
