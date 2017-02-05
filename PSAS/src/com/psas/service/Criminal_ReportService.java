package com.psas.service;

import java.util.List;

import com.psas.entity.CriminalReport;
import com.psas.entity.Page;

public interface Criminal_ReportService {
public static final String BEAN_NAME="criminal_ReportService";
	
	public List<CriminalReport> findAll();

	
	public void add(CriminalReport criminal);

	
	public void delete(CriminalReport criminal);

	
	public void update(CriminalReport criminal);

	
	public List<CriminalReport> findCriminalByPage(Page page);

	
	public List<CriminalReport> findCriminalById(CriminalReport criminal);

	
}
