package com.psas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.psas.entity.CaseLater;
import com.psas.entity.Page;

public interface CaseLaterDao {
	public static final String BEAN_NAME="caseLaterDao";
	
	public List<CaseLater> findAll();
	
	public void add(@Param("caseLater") CaseLater caseLater);
	
	public void delete(@Param("caseLater") CaseLater caseLater);
	
	public void update(@Param("caseLater") CaseLater caseLater);
	 
	public List<CaseLater> findCase(@Param("caseLater") CaseLater caseLater,@Param("page") Page page);

}
