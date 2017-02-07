package com.psas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.psas.dao.HelpServiceDao;
import com.psas.dao.UserInfoDao;
import com.psas.entity.HelpService;
import com.psas.entity.Page;
import com.psas.entity.UserInfo;
import com.psas.service.HelpServiceService;
import com.psas.service.UserInfoService;

/**
 * 用户信息service实现
 * @author  XulaiWang
 * @data:  2017年2月4日 下午3:54:35
 * @version:  V1.0
 */
@Service("helpServiceService")
public class HelpServiceServiceImpl implements HelpServiceService {
	@Resource(name = HelpServiceDao.BEAN_NAME)
	private HelpServiceDao dao;

	/**
	 * 查询所有用户信息service实现
	 * 重载方法
	 * @return List<HelpService>
	 */
	@Override
	public List<HelpService> findAll() {
		return dao.findAll();
	}

	/**
	 * 新增用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void add(HelpService helpService) {
		dao.add(helpService);
	}

	/**
	 * 删除用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void delete(HelpService helpService) {
		dao.delete(helpService);
	}

	/**
	 * 修改用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void update(HelpService helpService) {
		dao.update(helpService);
	}

	/**
	 * 根据用户id查找用户信息service实现
	 * 重载方法
	 * @param user
	 * @return HelpService
	 */
	@Override
	public HelpService findUserById(HelpService helpService) {
		List<HelpService> u = dao.findUser(helpService, null);
		if (u.size() == 1) {
			return u.get(0);
		}
		return null;
	}

	/**
	 * 分页查询用户信息service实现
	 * 重载方法
	 * @param page
	 * @return List<HelpService>
	 */
	@Override
	public List<HelpService> findUserByPage(Page page) {
		return dao.findUser(null, page);
	}

	public HelpServiceDao getDao() {
		return dao;
	}

	public void setDao(HelpServiceDao dao) {
		this.dao = dao;
	}

	

	

}
