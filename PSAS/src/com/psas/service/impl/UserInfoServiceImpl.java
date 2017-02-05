package com.psas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.psas.dao.UserInfoDao;
import com.psas.entity.Page;
import com.psas.entity.UserInfo;
import com.psas.service.UserInfoService;
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
	@Resource(name = UserInfoDao.BEAN_NAME)
	private UserInfoDao dao;

	@Override
	public List<UserInfo> findAll() {
		return dao.findAll();
	}

	@Override
	public void add(UserInfo user) {
		dao.add(user);
	}

	@Override
	public void delete(UserInfo user) {
		dao.delete(user);
	}

	@Override
	public void update(UserInfo user) {
		dao.update(user);
	}

	@Override
	public UserInfo findUserById(UserInfo user) {
		List<UserInfo> u = dao.findUser(user, null);
		if (u.size() == 1) {
			return u.get(0);
		}
		return null;
	}

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
