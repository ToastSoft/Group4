package com.psas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.psas.dao.Criminal_ReportDao;
import com.psas.entity.CriminalReport;
import com.psas.entity.Page;
import com.psas.service.Criminal_ReportService;
/**
 * 
 * 刑事案件登记书信息service实现类
 * @author  XuzhenHAO
 * @data:  2017年2月7日 上午9:20:18
 * @version:  V1.0
 */
@Service("criminal_ReportService")
public class Criminal_ReportServiceImpl implements Criminal_ReportService{
	@Resource(name=Criminal_ReportDao.BEAN_NAME)
	private Criminal_ReportDao dao;

	@Override
	public void add(CriminalReport criminal) {
		dao.add(criminal);
		
	}

	@Override
	public void delete(CriminalReport criminal) {
		dao.delete(criminal);
		
	}

	@Override
	public List<CriminalReport> findAll() {
		
		return dao.findAll();
	}

	@Override
	public List<CriminalReport> findCriminalById(CriminalReport criminal) {
		
		
		return dao.findCriminal(criminal, null);
	}

	@Override
	public List<CriminalReport> findCriminalByPage(Page page) {
	
		return dao.findCriminal(null, page);
	}

	public Criminal_ReportDao getDao() {
		return dao;
	}

	public void setDao(Criminal_ReportDao dao) {
		this.dao = dao;
	}

	@Override
	public void update(CriminalReport criminal) {
		dao.update(criminal);
		
	}

}
