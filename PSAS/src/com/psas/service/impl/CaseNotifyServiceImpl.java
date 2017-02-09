package com.psas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.psas.dao.CaseNotifyDao;
import com.psas.entity.CaseNotify;
import com.psas.entity.Page;
import com.psas.service.CaseNotifyService;
@Service("caseNotifyService")
public class CaseNotifyServiceImpl implements CaseNotifyService {
	@Resource(name=CaseNotifyDao.BEAN_NAME)
	private CaseNotifyDao dao;
	
	
	public CaseNotifyDao getDao() {
		return dao;
	}

	public void setDao(CaseNotifyDao dao) {
		this.dao = dao;
	}

	@Override
	public List<CaseNotify> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void add(CaseNotify caseNotify) {
		// TODO Auto-generated method stub
		dao.add(caseNotify);
	}

	@Override
	public void delete(CaseNotify caseNotify) {
		// TODO Auto-generated method stub
		dao.delete(caseNotify);
	}

	@Override
	public void update(CaseNotify caseNotify) {
		// TODO Auto-generated method stub
		dao.update(caseNotify);
	}

	@Override
	public List<CaseNotify> findByPage(Page page) {
		// TODO Auto-generated method stub
		return dao.findCaseNotify(null, page);
	}

	@Override
	public List<CaseNotify> findById(CaseNotify caseNotify) {
		// TODO Auto-generated method stub
		return dao.findCaseNotify(caseNotify, null);
	}

}
