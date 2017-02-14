package com.psas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.psas.dao.FineInfoDao;
import com.psas.entity.FineInfo;
import com.psas.entity.Page;
import com.psas.service.FineInfoService;
/**
 * 
 *追缴信息service实现类
 * @author  XuzhenHAO
 * @data:  2017年2月7日 上午8:58:07
 * @version:  V1.0
 */
@Service("fineInfoService")
public class FineInfoServiceImpl implements FineInfoService{
	@Resource(name=FineInfoDao.BEAN_NAME)
	private FineInfoDao dao;
	public FineInfoDao getDao() {
		return dao;
	}
	public void setDao(FineInfoDao dao) {
		this.dao = dao;
	}

	@Override
	public List<FineInfo> findAll() {
		
		return dao.findAll();
	}

	@Override
	public void add(FineInfo fine) {
		dao.add(fine);
		
	}

	@Override
	public void delete(FineInfo fine) {
		dao.delete(fine);
		
	}

	@Override
	public void update(FineInfo fine) {
		dao.update(fine);
		
		
	}

	@Override
	public List<FineInfo> findByPage(Page page) {
		
		return dao.findFine(null, page);
	}

	@Override
	public List<FineInfo> findById(FineInfo fine) {
		
		return dao.findFine(fine, null);
	}

}
