package com.psas.service;

import java.util.List;

import com.psas.entity.FineInfo;

import com.psas.entity.Page;

public interface FineInfoService {
	public static final String BEAN_NAME="fineInfoService";
	
	public List<FineInfo> findAll();

	
	public void add(FineInfo fineInfo);

	
	public void delete(FineInfo fine);

	
	public void update(FineInfo fine);

	
	public List<FineInfo> findByPage(Page page);

	
	public List<FineInfo> findById(FineInfo fine);

}
