package com.psas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.psas.entity.CriminalReport;
import com.psas.entity.Page;

public interface Criminal_ReportDao {
  public  static final String BEAN_NAME="criminal_ReportDao";
  
  public List<CriminalReport> findAll();
  
  public void add(@Param("criminal") CriminalReport criminal);
  
  public void delete(@Param("criminal") CriminalReport criminal);
  
  public void update(@Param("criminal") CriminalReport criminal);
  
  public List<CriminalReport> findCriminal(@Param("criminal")CriminalReport criminal,@Param("page") Page pag);

}
