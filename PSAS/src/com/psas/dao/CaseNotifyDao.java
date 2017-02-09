package com.psas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.psas.entity.CaseNotify;
import com.psas.entity.Page;

public interface CaseNotifyDao {
	public static final String BEAN_NAME="caseNotifyDao";
	
	public List<CaseNotify> findAll();
	
	public void add(CaseNotify caseNotify);
	
	public void delete(CaseNotify caseNotify);
	
	public void update(CaseNotify caseNotify);
	
	public List<CaseNotify> findCaseNotify(@Param("caseNotify") CaseNotify caseNotify,@Param("page") Page page);

}
