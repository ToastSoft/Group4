package com.psas.service;

import java.util.List;

import com.psas.entity.AcceptCase;
import com.psas.entity.Page;

public interface AcceptCaseService {
	public static final String BEAN_NAME="acceptCaseService";
	
	public List<AcceptCase> findAll();
	
	public void add(AcceptCase acceptCase);
	
	public void delete(AcceptCase acceptCase);
	
	public void update(AcceptCase acceptCase);
	
	public List<AcceptCase> findByPage(Page page);
	
	public List<AcceptCase> findById(AcceptCase acceptCase);

}
