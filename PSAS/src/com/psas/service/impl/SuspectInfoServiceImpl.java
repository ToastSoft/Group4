package com.psas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.psas.dao.PunishmentInfoDao;
import com.psas.dao.SuspectInfoDao;
import com.psas.dao.UserInfoDao;
import com.psas.entity.Page;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.SuspectInfo;
import com.psas.entity.UserInfo;
import com.psas.service.PunishmentInfoService;
import com.psas.service.SuspectInfoService;
import com.psas.service.UserInfoService;

/**
 * 
 * TODO嫌疑人信息表service实现
 * @author  Cunbao Song
 * @data:  2017年2月7日 下午4:33:54
 * @version:  V1.0
 */
@Service("suspectInfoService")
public class SuspectInfoServiceImpl implements SuspectInfoService {
	@Resource(name = SuspectInfoDao.BEAN_NAME)
	private SuspectInfoDao dao;

	/**
	 * 查询所有用户信息service实现
	 * 重载方法
	 * @return List<SuspectInfo>
	 */
	@Override
	public List<SuspectInfo> findAll() {
		return dao.findAll();
	}

	/**
	 * 新增用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void add(SuspectInfo suspectInfo) {
		dao.add(suspectInfo);
	}

	/**
	 * 删除用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void delete(SuspectInfo suspectInfo) {
		dao.delete(suspectInfo);
	}

	/**
	 * 修改用户信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void update(SuspectInfo suspectInfo) {
		dao.update(suspectInfo);
	}

	/**
	 * 根据用户id查找用户信息service实现
	 * 重载方法
	 * @param user
	 * @return SuspectInfo
	 */
	@Override
	public SuspectInfo findUserById(SuspectInfo suspectInfo) {
		List<SuspectInfo> u = dao.findUser(suspectInfo, null);
		if (u.size() == 1) {
			return u.get(0);
		}
		return null;
	}

	/**
	 * 分页查询用户信息service实现
	 * 重载方法
	 * @param page
	 * @return List<SuspectInfo>
	 */
	@Override
	public List<SuspectInfo> findUserByPage(Page page) {
		return dao.findUser(null, page);
	}

	public SuspectInfoDao getDao() {
		return dao;
	}

	public void setDao(SuspectInfoDao dao) {
		this.dao = dao;
	}

	

	

}
