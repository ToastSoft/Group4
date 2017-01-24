package com.psas.service;

import java.util.List;

import com.psas.entity.LogInfo;
import com.psas.entity.Page;

/**
 * 日志信息的service接口
 * 
 * @author XulaiWang
 * @data: 2017年1月14日 上午11:12:02
 * @version: V1.0
 */
public interface LogInfoService {
	public static final String BEAN_NAME = "logInfoService";

	/**
	 * 查询所有日志信息Service接口
	 * 
	 * @return
	 * @throw
	 * @return List<LogInfo>
	 */
	public List<LogInfo> findAll();

	/**
	 * 新增日志信息Service接口
	 * 
	 * @param log
	 * @throw
	 * @return void
	 */
	public void add(LogInfo log);

	/**
	 * 删除日志信息Service接口
	 * 
	 * @param log
	 * @throw
	 * @return void
	 */
	public void delete(LogInfo log);

	/**
	 * 修改日志信息Service接口
	 * 
	 * @param log
	 * @throw
	 * @return void
	 */
	public void update(LogInfo log);

	/**
	 * 日志信息分页查询Service接口
	 * 
	 * @param page
	 * @return
	 * @throw
	 * @return List<LogInfo>
	 */
	public List<LogInfo> findByPage(Page page);

	/**
	 * 根据日志id查询日志信息
	 * 
	 * @param log
	 * @param page
	 * @return
	 * @throw
	 * @return List<LogInfo>
	 */
	public List<LogInfo> findById(LogInfo log);
}
