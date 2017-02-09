package com.psas.service;

import java.util.List;

import com.psas.entity.CaseNotify;
import com.psas.entity.Page;

public interface CaseNotifyService {
	public static final String BEAN_NAME="caseNotifyService";
	
	public List<CaseNotify> findAll();
	
	public void add(CaseNotify caseNotify);
	
	public void delete(CaseNotify caseNotify);
	
	public void update(CaseNotify caseNotify);
	
	public List<CaseNotify> findByPage(Page page);
	
	public List<CaseNotify> findById(CaseNotify caseNotify);

}
