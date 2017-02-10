package com.psas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.psas.dao.HelpServiceDao;
import com.psas.dao.PolicemanInfoDao;
import com.psas.dao.UserInfoDao;
import com.psas.entity.HelpService;
import com.psas.entity.Page;
import com.psas.entity.PolicemanInfo;
import com.psas.entity.UserInfo;
import com.psas.service.HelpServiceService;
import com.psas.service.PolicemanInfoService;
import com.psas.service.UserInfoService;

/**
 * 
 * TODO 警员信息service层实现
 * @author  Cunbao Song
 * @data:  2017年2月9日 下午4:34:55
 * @version:  V1.0
 */
@Service("policemanInfoService")
public class PolicemanInfoServiceImpl implements PolicemanInfoService {
	@Resource(name = PolicemanInfoDao.BEAN_NAME)
	private PolicemanInfoDao dao;

	/**
	 * 查询所有警员信息service实现
	 * 重载方法
	 * @return List<HelpService>
	 */
	@Override
	public List<PolicemanInfo> findAll() {
		return dao.findAll();
	}

	/**
	 * 新增警员信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void add(PolicemanInfo policemanInfo) {
		dao.add(policemanInfo);
	}

	/**
	 * 删除警员信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void delete(PolicemanInfo policemanInfo) {
		dao.delete(policemanInfo);
	}

	/**
	 * 修改警员信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void update(PolicemanInfo policemanInfo) {
		dao.update(policemanInfo);
	}

	/**
	 * 根据警员id查找用户信息service实现
	 * 重载方法
	 * @param user
	 * @return HelpService
	 */
	@Override
	public PolicemanInfo findPolicemanById(PolicemanInfo policemanInfo) {
		List<PolicemanInfo> u = dao.findPoliceman(policemanInfo, null);
		if (u.size() == 1) {
			return u.get(0);
		}
		return null;
	}

	/**
	 * 分页查询警员信息service实现
	 * 重载方法
	 * @param page
	 * @return List<PolicemanInfo>
	 */
	@Override
	public List<PolicemanInfo> findPolicemanByPage(Page page) {
		return dao.findPoliceman(null, page);
	}

	public PolicemanInfoDao getDao() {
		return dao;
	}

	public void setDao(PolicemanInfoDao dao) {
		this.dao = dao;
	}

	

	

	

}
