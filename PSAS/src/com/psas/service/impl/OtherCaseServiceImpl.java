package com.psas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.psas.dao.OtherCaseDao;
import com.psas.dao.UserInfoDao;
import com.psas.entity.OtherCase;
import com.psas.entity.Page;
import com.psas.entity.UserInfo;
import com.psas.service.OtherCaseService;
import com.psas.service.UserInfoService;

/**
 * 
 * TODO其他案件登录service层接口实现
 * @author  Cunbao Song
 * @data:  2017年2月7日 下午3:12:05
 * @version:  V1.0
 */
@Service("otherCaseService")
public class OtherCaseServiceImpl implements OtherCaseService {
	@Resource(name = OtherCaseDao.BEAN_NAME)
	private OtherCaseDao dao;

	/**
	 * 查询所有用户信息service实现
	 * 重载方法
	 * @return List<OtherCase>
	 */
	@Override
	public List<OtherCase> findAll() {
		return dao.findAll();
	}

	/**
	 * 新增用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void add(OtherCase otherCase) {
		dao.add(otherCase);
	}

	/**
	 * 删除用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void delete(OtherCase otherCase) {
		dao.delete(otherCase);
	}

	/**
	 * 修改用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void update(OtherCase otherCase) {
		dao.update(otherCase);
	}

	/**
	 * 根据用户id查找用户信息service实现
	 * 重载方法
	 * @param user
	 * @return
	 */
	@Override
	public OtherCase findUserById(OtherCase otherCase) {
		List<OtherCase> u = dao.findUser(otherCase, null);
		if (u.size() == 1) {
			return u.get(0);
		}
		return null;
	}

	/**
	 * 分页查询用户信息service实现
	 * 重载方法
	 * @param page
	 * @return List<OtherCase>
	 */
	@Override
	public List<OtherCase> findUserByPage(Page page) {
		return dao.findUser(null, page);
	}

	public OtherCaseDao getDao() {
		return dao;
	}

	public void setDao(OtherCaseDao dao) {
		this.dao = dao;
	}



}
