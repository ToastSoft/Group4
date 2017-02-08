package com.psas.service;

import java.util.List;

import com.psas.entity.FineInfo;

import com.psas.entity.Page;
/**
 * 
 * 追缴信息的service接口
 * @author  XuzhenHAO
 * @data:  2017年2月7日 上午8:53:34
 * @version:  V1.0
 */
public interface FineInfoService {
	public static final String BEAN_NAME="fineInfoService";
/**
 * 
 * 查找所有追缴信息的service接口
 * @return
 * @throw
 * @return List<FineInfo>
 */
	public List<FineInfo> findAll();

/**
 * 
 * 增加一条追缴信息的service 接口
 * @param fineInfo
 * @throw
 * @return void
 */
	public void add(FineInfo fineInfo);

/**
 * 
 * 删除一条追缴信息的service接口
 * @param fine
 * @throw
 * @return void
 */
	public void delete(FineInfo fine);

/**
 * 	
 * 修改一条追缴信息的service接口
 * @param fine
 * @throw
 * @return void
 */
	public void update(FineInfo fine);

/**
 * 
 * 追缴信息分页查询service接口
 * @param page
 * @return
 * @throw
 * @return List<FineInfo>
 */
	public List<FineInfo> findByPage(Page page);
/**
 * 
 * 根据追缴信息id查询service接口
 * @param fine
 * @return
 * @throw
 * @return List<FineInfo>
 */
	public List<FineInfo> findById(FineInfo fine);

}
