package com.psas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.psas.entity.CaseLater;
import com.psas.entity.Page;
/**
 * 
 * 未及时破案书DAO接口
 * @author  XuzhenHAO
 * @data:  2017年2月7日 上午8:44:25
 * @version:  V1.0
 */
public interface CaseLaterDao {
	public static final String BEAN_NAME="caseLaterDao";
/**
 * 
 * 查找未及时破案说明书所有信息
 * @return
 * @throw
 * @return List<CaseLater>
 */
	public List<CaseLater> findAll();
	/**
	 * 
	 * 增加一条未及时破案信息
	 * @param caseLater
	 * @throw
	 * @return void
	 */
	
	public void add(@Param("caseLater") CaseLater caseLater);
    /**
     * 
     * 删除一条未及时破案信息
     * @param caseLater
     * @throw
     * @return void
     */
	
	public void delete(@Param("caseLater") CaseLater caseLater);
	/**
	 * 
	 * 修改一条未及时破案信息
	 * @param caseLater
	 * @throw
	 * @return void
	 */
	
	public void update(@Param("caseLater") CaseLater caseLater);
	/**
	 * 
	 * 按条件查询未及时破案信息
	 * @param caseLater
	 * @param page
	 * @return
	 * @throw
	 * @return List<CaseLater>
	 */
	 
	public List<CaseLater> findCase(@Param("caseLater") CaseLater caseLater,@Param("page") Page page);

}
