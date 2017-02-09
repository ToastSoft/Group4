package com.psas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.psas.dao.PunishmentInfoDao;
import com.psas.dao.UserInfoDao;
import com.psas.dao.VictimInfoDao;
import com.psas.entity.Page;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.UserInfo;
import com.psas.entity.VictimInfo;
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
@Service("victimInfoService")
public class VictimInfoServiceImpl implements VictimInfoService {
	@Resource(name = VictimInfoDao.BEAN_NAME)
	private VictimInfoDao dao;

	/**
	 * 查询所有用户信息service实现
	 * 重载方法
	 * @return List<VictimInfo>
	 */
	@Override
	public List<VictimInfo> findAll() {
		return dao.findAll();
	}

	/**
	 * 新增用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void add(VictimInfo victimInfo) {
		dao.add(victimInfo);
	}

	/**
	 * 删除用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void delete(VictimInfo victimInfo) {
		dao.delete(victimInfo);
	}

	/**
	 * 修改用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void update(VictimInfo victimInfo) {
		dao.update(victimInfo);
	}

	/**
	 * 根据用户id查找用户信息service实现
	 * 重载方法
	 * @param user
	 * @return VictimInfo
	 */
	@Override
	public VictimInfo findUserById(VictimInfo victimInfo) {
		List<VictimInfo> u = dao.findUser(victimInfo, null);
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
	public List<VictimInfo> findUserByPage(Page page) {
		return dao.findUser(null, page);
	}

	public VictimInfoDao getDao() {
		return dao;
	}

	public void setDao(VictimInfoDao dao) {
		this.dao = dao;
	}

	

	

}
