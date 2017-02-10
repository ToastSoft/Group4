package com.psas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.psas.dao.PublicSecurityDao;
import com.psas.dao.PunishmentInfoDao;
import com.psas.dao.UserInfoDao;
import com.psas.entity.Page;
import com.psas.entity.PublicSecurity;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.UserInfo;
import com.psas.service.PublicSecurityService;
import com.psas.service.PunishmentInfoService;
import com.psas.service.UserInfoService;

/**
 * 
 * TODO  警局表service层实现
 * @author  Cunbao Song
 * @data:  2017年2月10日 上午9:08:29
 * @version:  V1.0
 */
@Service("publicSecurityService")
public class PublicSecurityServiceImpl implements PublicSecurityService {
	@Resource(name =PublicSecurityDao.BEAN_NAME)
	private PublicSecurityDao dao;

	/**
	 * 查询所有警局信息service实现
	 * 重载方法
	 * @return List<PublicSecurity>
	 */
	@Override
	public List<PublicSecurity> findAll() {
		return dao.findAll();
	}

	/**
	 * 新增警局信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void add(PublicSecurity publicSecurity) {
		dao.add(publicSecurity);
	}

	/**
	 * 删除警局信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void delete(PublicSecurity publicSecurity) {
		dao.delete(publicSecurity);
	}

	/**
	 * 修改警局信息service实现
	 * 重载方法
	 * @param user
	 */
	@Override
	public void update(PublicSecurity publicSecurity) {
		dao.update(publicSecurity);
	}

	/**
	 * 根据警局id查找用户信息service实现
	 * 重载方法
	 * @param user
	 * @return PublicSecurity
	 */
	@Override
	public PublicSecurity findPublicSecurityById(PublicSecurity publicSecurity) {
		List<PublicSecurity> u = dao.findPublicSecurity(publicSecurity, null);
		if (u.size() == 1) {
			return u.get(0);
		}
		return null;
	}

	/**
	 * 分页查询警局信息service实现
	 * 重载方法
	 * @param page
	 * @return List<PublicSecurity>
	 */
	@Override
	public List<PublicSecurity> findPublicSecurityByPage(Page page) {
		return dao.findPublicSecurity(null, page);
	}

	public PublicSecurityDao getDao() {
		return dao;
	}

	public void setDao(PublicSecurityDao dao) {
		this.dao = dao;
	}

	

	

}
