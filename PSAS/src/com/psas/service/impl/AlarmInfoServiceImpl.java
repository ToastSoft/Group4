package com.psas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.psas.dao.AlarmInfoDao;
import com.psas.entity.AlarmInfo;
import com.psas.entity.Page;
import com.psas.service.AlarmInfoService;
@Service("alarmInfoService")
public class AlarmInfoServiceImpl implements AlarmInfoService{
	@Resource(name=AlarmInfoDao.BEAN_NAME)
	private AlarmInfoDao dao;
	
	
	public AlarmInfoDao getDao() {
		return dao;
	}

	public void setDao(AlarmInfoDao dao) {
		this.dao = dao;
	}

	@Override
	public List<AlarmInfo> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void add(AlarmInfo alarm) {
		// TODO Auto-generated method stub
		dao.add(alarm);
	}

	@Override
	public void delete(AlarmInfo alarm) {
		// TODO Auto-generated method stub
		dao.delete(alarm);
	}

	@Override
	public void update(AlarmInfo alarm) {
		// TODO Auto-generated method stub
		dao.update(alarm);
	}

	@Override
	public List<AlarmInfo> findByPage(Page page) {
		// TODO Auto-generated method stub
		return dao.findAlarm(null, page);
	}

	@Override
	public List<AlarmInfo> findById(AlarmInfo alarm) {
		// TODO Auto-generated method stub
		return dao.findAlarm(alarm, null);
	}

}
