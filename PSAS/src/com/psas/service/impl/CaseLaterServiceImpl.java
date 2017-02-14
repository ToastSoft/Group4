package com.psas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.psas.dao.CaseLaterDao;
import com.psas.entity.CaseLater;
import com.psas.entity.Page;
import com.psas.service.CaseLaterService;

/**
 * 
 * 未及时破案书信息service实现类
 * @author  XuzhenHAO
 * @data:  2017年2月7日 上午9:42:24
 * @version:  V1.0
 */
@Service("caseLaterService")
public class CaseLaterServiceImpl implements CaseLaterService{
@Resource(name=CaseLaterDao.BEAN_NAME)
private CaseLaterDao dao;

public CaseLaterDao getDao() {
	return dao;
}

public void setDao(CaseLaterDao dao) {
	this.dao = dao;
}

@Override
public List<CaseLater> findAll() {
	return dao.findAll();
}

@Override
public void add(CaseLater caseLater) {
	dao.add(caseLater);
	
}

@Override
public void delete(CaseLater caseLater) {
	dao.delete(caseLater);
	
}

@Override
public void update(CaseLater caseLater) {
	dao.update(caseLater);
	
}

@Override
public List<CaseLater> findById(CaseLater caseLater) {
	
	return dao.findCase(caseLater, null);
}

@Override
public List<CaseLater> findByPage(Page page) {
	
	return dao.findCase(null, page);
}


}
