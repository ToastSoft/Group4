package com.psas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.psas.entity.LogInfo;
import com.psas.entity.Page;

/**
 * 日志信息DAO接口
 * 
 * @author XulaiWang
 * @data: 2017年1月14日 上午9:42:36
 * @version: V1.0
 */
public interface LogInfoDao {

	public static final String BEAN_NAME = "logInfoDao";

	/**
	 * 查找所有日志信息
	 * 
	 * @return
	 * @throw
	 * @return List<LogInfo>
	 */
	public List<LogInfo> findAll();

	/**
	 * 增加一条日志
	 * 
	 * @param log
	 * @throw
	 * @return void
	 */
	public void add(@Param("log") LogInfo log);

	/**
	 * 删除一条日志
	 * 
	 * @param log
	 * @throw
	 * @return void
	 */
	public void delete(@Param("log") LogInfo log);

	/**
	 * 修改一条日志信息
	 * 
	 * @param log
	 * @throw
	 * @return void
	 */
	public void update(@Param("log") LogInfo log);

	/**
	 * 按条件查询日志
	 * 
	 * @param log
	 * @param page
	 * @return
	 * @throw
	 * @return LogInfo
	 */
	public List<LogInfo> findLog(@Param("log") LogInfo log, @Param("page") Page page);

}
