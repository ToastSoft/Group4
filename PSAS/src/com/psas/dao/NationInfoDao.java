package com.psas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.psas.entity.NationInfo;

/**
 * 民族信息dao 接口
 * @author  XulaiWang
 * @data:  2017年2月4日 下午4:35:37
 * @version:  V1.0
 */
public interface NationInfoDao {
	public static final String BEAN_NAME = "nationInfoDao";

	/**
	 * 查找所有民族信息dao接口
	 * @return
	 * @throw
	 * @return List<NationInfo>
	 */
	public List<NationInfo> findAll();

	/**
	 * 根据民族id查找民族信息dao接口
	 * @param nation
	 * @return
	 * @throw
	 * @return NationInfo
	 */
	public NationInfo findNationInfoById(@Param("nation") NationInfo nation);

}
