package com.psas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.psas.dao.LogInfoDao;
import com.psas.entity.LogInfo;
import com.psas.entity.Page;
import com.psas.service.LogInfoService;

/**
 * 日志信息service实现类
 * 
 * @author XulaiWang
 * @data: 2017年1月14日 上午11:20:15
 * @version: V1.0
 */
@Service("logInfoService")
public class LogInfoServiceImpl implements LogInfoService {

	@Resource(name = LogInfoDao.BEAN_NAME)
	private LogInfoDao dao;

	@Override
	public List<LogInfo> findAll() {
		return dao.findAll();
	}

	@Override
	public void add(LogInfo log) {
		dao.add(log);
	}

	@Override
	public void delete(LogInfo log) {
		dao.delete(log);
	}

	@Override
	public void update(LogInfo log) {
		dao.update(log);
	}

	@Override
	public List<LogInfo> findByPage(Page page) {
		return dao.findLog(null, page);
	}

	@Override
	public List<LogInfo> findById(LogInfo log) {
		return dao.findLog(log, null);
	}

	public LogInfoDao getDao() {
		return dao;
	}

	public void setDao(LogInfoDao dao) {
		this.dao = dao;
	}

}
