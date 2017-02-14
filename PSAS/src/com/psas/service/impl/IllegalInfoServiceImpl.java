package com.psas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.psas.dao.IllegalInfoDao;
import com.psas.dao.PunishmentInfoDao;
import com.psas.dao.UserInfoDao;
import com.psas.dao.VictimInfoDao;
import com.psas.entity.IllegalInfo;
import com.psas.entity.Page;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.UserInfo;
import com.psas.entity.VictimInfo;
import com.psas.service.IllegalInfoService;
import com.psas.service.PunishmentInfoService;
import com.psas.service.UserInfoService;
import com.psas.service.VictimInfoService;

/**
 * 
 * TODO受害人信息表service层 实现
 * @author  Cunbao Song
 * @data:  2017年2月9日 上午9:47:58
 * @version:  V1.0
 */
@Service("illegalInfoService")
public class IllegalInfoServiceImpl implements IllegalInfoService {
	@Resource(name = IllegalInfoDao.BEAN_NAME)
	private IllegalInfoDao dao;

	/**
	 * 查询所有用户信息service实现
	 * 重载方法
	 * @return List<IllegalInfo>
	 */
	@Override
	public List<IllegalInfo> findAll() {
		return dao.findAll();
	}

	/**
	 * 新增用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void add(IllegalInfo iIllegalInfo) {
		dao.add(iIllegalInfo);
	}

	/**
	 * 删除用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void delete(IllegalInfo iIllegalInfo) {
		dao.delete(iIllegalInfo);
	}

	/**
	 * 修改用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void update(IllegalInfo iIllegalInfo) {
		dao.update(iIllegalInfo);
	}

	/**
	 * 根据用户id查找用户信息service实现
	 * 重载方法
	 * @param user
	 * @return IllegalInfo
	 */
	@Override
	public IllegalInfo findUserById(IllegalInfo iIllegalInfo) {
		List<IllegalInfo> u = dao.findUser(iIllegalInfo, null);
		if (u.size() == 1) {
			return u.get(0);
		}
		return null;
	}

	/**
	 * 分页查询用户信息service实现
	 * 重载方法
	 * @param page
	 * @return List<IllegalInfo>
	 */
	@Override
	public List<IllegalInfo> findUserByPage(Page page) {
		return dao.findUser(null, page);
	}

	public IllegalInfoDao getDao() {
		return dao;
	}

	public void setDao(IllegalInfoDao dao) {
		this.dao = dao;
	}

	

	

	

}
