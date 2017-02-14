package com.psas.service;

import java.util.List;

import com.psas.entity.CaseLater;
import com.psas.entity.LogInfo;
import com.psas.entity.Page;

/**
 * 
 * 未及时破案书信息service接口
 * @author  XuzhenHAO
 * @data:  2017年2月7日 上午9:34:07
 * @version:  V1.0
 */
public interface CaseLaterService {
  public static final String BEAN_NAME="caseLaterService";
  /**
	 * 查询所有未及时破案书信息Service接口
	 * 
	 * @return
	 * @throw
	 * @return List<CaseLater>
	 */
	public List<CaseLater> findAll();

	/**
	 * 新增未及时破案书信息Service接口
	 * 
	 * @param caseLater
	 * @throw
	 * @return void
	 */
	public void add(CaseLater caseLater);

	/**
	 * 删除未及时破案书信息Service接口
	 * 
	 * @param caseLater
	 * @throw
	 * @return void
	 */
	public void delete(CaseLater caseLater);

	/**
	 * 修改未及时破案信息Service接口
	 * 
	 * @param caseLater
	 * @throw
	 * @return void
	 */
	public void update(CaseLater caseLater);

	/**
	 * 未及时破案书信息分页查询Service接口
	 * 
	 * @param page
	 * @return
	 * @throw
	 * @return List<CaseLater>
	 */
	public List<CaseLater> findByPage(Page page);

	/**
	 * 根据未及时破案书信息id查询日志信息
	 * 
	 * @param caseLater
	 * @param page
	 * @return
	 * @throw
	 * @return List<LogInfo>
	 */
	public List<CaseLater> findById(CaseLater caseLater);

}
