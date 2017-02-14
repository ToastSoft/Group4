package com.psas.service;

import java.util.List;

import com.psas.entity.Page;
import com.psas.entity.PublicSecurity;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.UserInfo;

/**
 * 
 * TODO 警局表service层接口
 * @author  Cunbao Song
 * @data:  2017年2月10日 上午9:05:03
 * @version:  V1.0
 */
public interface PublicSecurityService {
	public static final String BEAN_NAME = "publicSecurityService";

	/**
	 * 查询所有警局信息service接口
	 * @return
	 * @throw
	 * @return List<PublicSecurity>
	 */
	public List<PublicSecurity> findAll();

	/**
	 * 新增警局信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void add(PublicSecurity publicSecurity);

	/**
	 * 删除警局信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void delete(PublicSecurity publicSecurity);

	/**
	 * 修改警局信息service接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void update(PublicSecurity publicSecurity);

	/**
	 * 根据id查找警局信息service接口
	 * @param user
	 * @return
	 * @throw
	 * @return PublicSecurity
	 */
	public PublicSecurity findPublicSecurityById(PublicSecurity publicSecurity);

	/**
	 * 分页查询警局信息service接口
	 * @param page
	 * @return
	 * @throw
	 * @return List<PublicSecurity>
	 */
	public List<PublicSecurity> findPublicSecurityByPage(Page page);

}
