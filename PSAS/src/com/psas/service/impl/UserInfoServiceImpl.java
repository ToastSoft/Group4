package com.psas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.psas.dao.UserInfoDao;
import com.psas.entity.Page;
import com.psas.entity.UserInfo;
import com.psas.service.UserInfoService;

/**
 * 用户信息service实现
 * @author  XulaiWang
 * @data:  2017年2月4日 下午3:54:35
 * @version:  V1.0
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
	@Resource(name = UserInfoDao.BEAN_NAME)
	private UserInfoDao dao;

	/**
	 * 查询所有用户信息service实现
	 * 重载方法
	 * @return
	 */
	@Override
	public List<UserInfo> findAll() {
		return dao.findAll();
	}

	/**
	 * 新增用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void add(UserInfo user) {
		dao.add(user);
	}

	/**
	 * 删除用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void delete(UserInfo user) {
		dao.delete(user);
	}

	/**
	 * 修改用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void update(UserInfo user) {
		dao.update(user);
	}

	/**
	 * 根据用户id查找用户信息service实现
	 * 重载方法
	 * @param user
	 * @return
	 */
	@Override
	public UserInfo findUserById(UserInfo user) {
		List<UserInfo> u = dao.findUser(user, null);
		if (u.size() == 1) {
			return u.get(0);
		}
		return null;
	}

	/**
	 * 分页查询用户信息service实现
	 * 重载方法
	 * @param page
	 * @return
	 */
	@Override
	public List<UserInfo> findUserByPage(Page page) {
		return dao.findUser(null, page);
	}

	public UserInfoDao getDao() {
		return dao;
	}

	public void setDao(UserInfoDao dao) {
		this.dao = dao;
	}

}
