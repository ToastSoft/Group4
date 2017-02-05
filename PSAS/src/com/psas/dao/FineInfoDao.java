package com.psas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.psas.entity.FineInfo;
import com.psas.entity.Page;
import com.psas.entity.UserInfo;

/**
 * 追缴信息DAO 接口
 * @author  XulaiWang
 * @data:  2017年1月22日 上午11:43:06
 * @version:  V1.0
 */
public interface FineInfoDao {
	public static final String BEAN_NAME="fineInfoDao";
	/**
	 * 查找所有追缴信息 dao接口
	 * @return
	 * @throw
	 * @return List<FineInfo>
	 */
	public List<FineInfo> findAll();

	/**
	 * 新增追缴信息dao接口
	 * @param fine
	 * @throw
	 * @return void
	 */
	public void add(@Param("fine") FineInfo fine);

	/**
	 * 删除追缴信息dao接口
	 * @param fine
	 * @throw
	 * @return void
	 */
	public void delete(@Param("fine") FineInfo fine);

	/**
	 * 修改追缴信息dao接口
	 * @param fine
	 * @throw
	 * @return void
	 */
	public void update(@Param("fine") FineInfo fine);

	/**
	 * 根据条件查找追缴信息
	 * @param fine
	 * @param page
	 * @throw
	 * @return void
	 */
	public List<FineInfo> findFine(@Param("fine")FineInfo fine,@Param("page") Page page);

}
