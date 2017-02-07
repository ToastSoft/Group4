package com.psas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.psas.dao.CivilDisputeDao;
import com.psas.dao.HelpServiceDao;
import com.psas.dao.UserInfoDao;
import com.psas.entity.CivilDispute;
import com.psas.entity.HelpService;
import com.psas.entity.Page;
import com.psas.entity.UserInfo;
import com.psas.service.CivilDisputeService;
import com.psas.service.HelpServiceService;
import com.psas.service.UserInfoService;

/**
 * 
 * TODO民事纠纷案件登记表service层实现
 * @author  Cunbao Song
 * @data:  2017年2月7日 上午9:39:48
 * @version:  V1.0
 */
@Service("civilDisputeService")
public class CivilDisputeServiceImpl implements CivilDisputeService {
	@Resource(name = CivilDisputeDao.BEAN_NAME)
	private CivilDisputeDao dao;

	/**
	 * 查询所有用户信息service实现
	 * 重载方法
	 * @return List<CivilDispute>
	 */
	@Override
	public List<CivilDispute> findAll() {
		return dao.findAll();
	}

	/**
	 * 新增用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void add(CivilDispute civilDispute) {
		dao.add(civilDispute);
	}

	/**
	 * 删除用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void delete(CivilDispute civilDispute) {
		dao.delete(civilDispute);
	}

	/**
	 * 修改用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void update(CivilDispute helpService) {
		dao.update(helpService);
	}

	/**
	 * 根据用户id查找用户信息service实现
	 * 重载方法
	 * @param user
	 * @return CivilDispute
	 */
	@Override
	public CivilDispute findUserById(CivilDispute civilDispute) {
		List<CivilDispute> u = dao.findUser(civilDispute, null);
		if (u.size() == 1) {
			return u.get(0);
		}
		return null;
	}

	/**
	 * 分页查询用户信息service实现
	 * 重载方法
	 * @param page
	 * @return List<CivilDispute>
	 */
	@Override
	public List<CivilDispute> findUserByPage(Page page) {
		return dao.findUser(null, page);
	}

	public CivilDisputeDao getDao() {
		return dao;
	}

	public void setDao(CivilDisputeDao dao) {
		this.dao = dao;
	}


	

	

}
