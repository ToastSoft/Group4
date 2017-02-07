package com.psas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.psas.dao.AcceptCaseDao;
import com.psas.entity.AcceptCase;
import com.psas.entity.Page;
import com.psas.service.AcceptCaseService;
@Service("acceptCaseService")
public class AcceptCaseServiceImpl implements AcceptCaseService{
	@Resource(name=AcceptCaseDao.BEAN_NAME)
	private AcceptCaseDao dao;
	
	public AcceptCaseDao getDao() {
		return dao;
	}

	public void setDao(AcceptCaseDao dao) {
		this.dao = dao;
	}

	@Override
	public List<AcceptCase> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void add(AcceptCase acceptCase) {
		// TODO Auto-generated method stub
		dao.add(acceptCase);
	}

	@Override
	public void delete(AcceptCase acceptCase) {
		// TODO Auto-generated method stub
		dao.delete(acceptCase);
	}

	@Override
	public void update(AcceptCase acceptCase) {
		// TODO Auto-generated method stub
		dao.update(acceptCase);
	}

	@Override
	public List<AcceptCase> findByPage(Page page) {
		// TODO Auto-generated method stub
		return dao.findCase(null, page);
	}

	@Override
	public List<AcceptCase> findById(AcceptCase acceptCase) {
		// TODO Auto-generated method stub
		return dao.findCase(acceptCase, null);
	}

}
