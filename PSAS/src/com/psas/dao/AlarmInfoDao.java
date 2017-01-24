package com.psas.dao;

import java.util.List;

import com.psas.entity.AlarmInfo;
import com.psas.entity.Page;

/**
 * 
 * 接处警信息dao接口
 * 
 * @author HeLei
 * @data: 2017年1月24日 上午9:57:09
 *
 */
public interface AlarmInfoDao {
	
	public static final String BEAN_NAME="alarmInfoDao";
	
	/**
	 * 查找所有接处警信息 dao接口
	 * @throw
	 * @return List<AlarmInfo>
	 */
	public List<AlarmInfo>	findAll();
	
	/**
	 * 增加接处警信息 dao接口
	 * @param alarm
	 * @throw
	 * @return void
	 */
	public void add(AlarmInfo alarm);
	/**
	 * 删除接处警信息 dao接口
	 * @param alarm
	 * @throw
	 * @return void
	 */
	public void delete(AlarmInfo alarm);
	/**
	 * 修改接处警信息dao接口
	 * @param alarm
	 * @throw
	 * @return void
	 */
	public void update(AlarmInfo alarm);
	/**
	 * 根据条件查找接处警信息
	 * @param alarm
	 * @param page
	 * @throw
	 * @return void
	 */
	public void findAlarm(AlarmInfo alarm,Page page);

}
