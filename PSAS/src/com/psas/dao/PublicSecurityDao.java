package com.psas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.psas.entity.Page;
import com.psas.entity.PolicemanInfo;
import com.psas.entity.PublicSecurity;
import com.psas.entity.PunishmentInfo;
import com.psas.entity.UserInfo;
import com.psas.entity.VictimInfo;

/**
 * 
 * TODO 警局信息Dao层接口
 * @author  Cunbao Song
 * @data:  2017年2月9日 下午5:15:19
 * @version:  V1.0
 */
public interface PublicSecurityDao {
	public static final String BEAN_NAME = "publicSecurityDao";

	/**
	 * 查找所有警局信息 dao接口
	 * @return
	 * @throw
	 * @return List<PublicSecurity>
	 */
	public List<PublicSecurity> findAll();

	/**
	 * 新增警局信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void add(@Param("publicSecurity") PublicSecurity publicSecurity);

	/**
	 * 删除警局信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void delete(@Param("publicSecurity") PublicSecurity publicSecurity);

	/**
	 * 修改警局信息dao接口
	 * @param user
	 * @throw
	 * @return void
	 */
	public void update(@Param("publicSecurity") PublicSecurity publicSecurity);
	
	/**
	 * 根据条件查找警局信息
	 * @param user
	 * @param page
	 * @throw
	 * @return List<PublicSecurity>
	 */
	public List<PublicSecurity> findPublicSecurity(@Param("publicSecurity") PublicSecurity publicSecurity, @Param("page") Page page);
}
