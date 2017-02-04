package com.psas.service;

import java.util.List;

import com.psas.entity.NationInfo;

/**
 * 民族信息service 接口
 * @author  XulaiWang
 * @data:  2017年2月4日 下午4:49:45
 * @version:  V1.0
 */
public interface NationInfoService {
	public static final String BEAN_NAME = "nationInfoService";

	/**
	 * 查找所有民族信息service接口
	 * @return
	 * @throw
	 * @return List<NationInfo>
	 */
	public List<NationInfo> findAll();

	/**
	 * 根据民族id查找民族信息service接口
	 * @param nation
	 * @return
	 * @throw
	 * @return NationInfo
	 */
	public NationInfo findById(NationInfo nation);
}
