package com.psas.service;

import java.util.List;

import com.psas.entity.AlarmInfo;
import com.psas.entity.Page;

public interface AlarmInfoService {
	public static final String BEAN_NAME="alarmInfoService";
	
	public List<AlarmInfo> findAll();
	
	public void add(AlarmInfo alarm);
	
	public void delete(AlarmInfo alarm);
	
	public void update(AlarmInfo alarm);
	
	public List<AlarmInfo> findByPage(Page page);
	
	public List<AlarmInfo> findById(AlarmInfo alarm);

}
