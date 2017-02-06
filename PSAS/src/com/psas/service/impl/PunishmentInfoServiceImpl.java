package com.psas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.psas.dao.PunishmentInfoDao;
import com.psas.dao.UserInfoDao;
import com.psas.entity.Page;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.UserInfo;
import com.psas.service.PunishmentInfoService;
import com.psas.service.UserInfoService;

/**
 * 用户信息service实现
 * @author  XulaiWang
 * @data:  2017年2月4日 下午3:54:35
 * @version:  V1.0
 */
@Service("punishmentInfoService")
public class PunishmentInfoServiceImpl implements PunishmentInfoService {
	@Resource(name = PunishmentInfoDao.BEAN_NAME)
	private PunishmentInfoDao dao;

	/**
	 * 查询所有用户信息service实现
	 * 重载方法
	 * @return List<PunishmentInfo>
	 */
	@Override
	public List<PunishmentInfo> findAll() {
		return dao.findAll();
	}

	/**
	 * 新增用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void add(PunishmentInfo punishment) {
		dao.add(punishment);
	}

	/**
	 * 删除用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void delete(PunishmentInfo punishment) {
		dao.delete(punishment);
	}

	/**
	 * 修改用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void update(PunishmentInfo punishment) {
		dao.update(punishment);
	}

	/**
	 * 根据用户id查找用户信息service实现
	 * 重载方法
	 * @param user
	 * @return PunishmentInfo
	 */
	@Override
	public PunishmentInfo findUserById(PunishmentInfo punishment) {
		List<PunishmentInfo> u = dao.findUser(punishment, null);
		if (u.size() == 1) {
			return u.get(0);
		}
		return null;
	}

	/**
	 * 分页查询用户信息service实现
	 * 重载方法
	 * @param page
	 * @return List<PunishmentInfo>
	 */
	@Override
	public List<PunishmentInfo> findUserByPage(Page page) {
		return dao.findUser(null, page);
	}

	public PunishmentInfoDao getDao() {
		return dao;
	}

	public void setDao(PunishmentInfoDao dao) {
		this.dao = dao;
	}

	

}
