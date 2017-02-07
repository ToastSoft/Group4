package com.psas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.psas.dao.CriminalInfoDao;
import com.psas.dao.SecurityInfoDao;
import com.psas.entity.CriminalInfo;
import com.psas.entity.Page;
import com.psas.entity.SecurityInfo;
import com.psas.service.CriminalInfoService;
import com.psas.service.SecurityInfoService;

/**
 * 
 * TODO 刑事案件登记表service实现
 * @author  Cunbao Song
 * @data:  2017年2月6日 下午1:35:47
 * @version:  V1.0
 */
@Service("criminalInfoService")
public class CriminalInfoServiceImpl implements CriminalInfoService {
	@Resource(name = CriminalInfoDao.BEAN_NAME)
	private CriminalInfoDao dao;

	/**
	 * 查询所有用户信息service实现
	 * 重载方法
	 * @return List<CriminalInfo>
	 */
	@Override
	public List<CriminalInfo> findAll() {
		return dao.findAll();
	}

	/**
	 * 新增用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void add(CriminalInfo criminalInfo) {
		dao.add(criminalInfo);
	}

	/**
	 * 删除用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void delete(CriminalInfo criminalInfo) {
		dao.delete(criminalInfo);
	}

	/**
	 * 修改用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void update(CriminalInfo criminalInfo) {
		dao.update(criminalInfo);
	}

	/**
	 * 根据用户id查找用户信息service实现
	 * 重载方法
	 * @param user
	 * @return CriminalInfo
	 */
	@Override
	public CriminalInfo findUserById(CriminalInfo criminalInfo) {
		List<CriminalInfo> u = dao.findUser(criminalInfo, null);
		if (u.size() == 1) {
			return u.get(0);
		}
		return null;
	}

	/**
	 * 分页查询用户信息service实现
	 * 重载方法
	 * @param page
	 * @return List<CriminalInfo>
	 */
	@Override
	public List<CriminalInfo> findUserByPage(Page page) {
		return dao.findUser(null, page);
	}

	public CriminalInfoDao getDao() {
		return dao;
	}

	public void setDao(CriminalInfoDao dao) {
		this.dao = dao;
	}

	

	

	

}
