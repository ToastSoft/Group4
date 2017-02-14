package com.psas.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.psas.entity.CriminalReport;
import com.psas.entity.Page;
/**
 * 
 * 刑事案件登记书DAO接口
 * @author  XuzhenHAO
 * @data:  2017年2月7日 上午9:11:13
 * @version:  V1.0
 */
public interface Criminal_ReportDao {
  public  static final String BEAN_NAME="criminal_ReportDao";
  /**
   * 
   * 查找所有刑事案件登记书信息
   * @return
   * @throw
   * @return List<CriminalReport>
   */
  public List<CriminalReport> findAll();
  /**
   * 
   * 增加一条刑事案件登记信息
   * @param criminal
   * @throw
   * @return void
   */
  
  public void add(@Param("criminal") CriminalReport criminal);
  /**
   * 
   * 删除一条刑事案件登记信息
   * @param criminal
   * @throw
   * @return void
   */
  
  public void delete(@Param("criminal") CriminalReport criminal);
  /**
   * 
   * 修改一条刑事案件登记信息
   * @param criminal
   * @throw
   * @return void
   */
  
  public void update(@Param("criminal") CriminalReport criminal);
  /**
   * 
   * 按条件查询刑事案件登记书信息
   * @param criminal
   * @param pag
   * @return
   * @throw
   * @return List<CriminalReport>
   */
  
  public List<CriminalReport> findCriminal(@Param("criminal")CriminalReport criminal,@Param("page") Page pag);

}
