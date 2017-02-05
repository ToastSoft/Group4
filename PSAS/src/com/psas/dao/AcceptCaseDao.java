package com.psas.dao;

import java.util.List;

import com.psas.entity.AcceptCase;

public interface AcceptCaseDao {
	public static final String BEAN_NAME="acceptCaseDao";
	
	public List<AcceptCase> findAll();
	
}
