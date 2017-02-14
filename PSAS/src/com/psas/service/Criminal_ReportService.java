package com.psas.service;

import java.util.List;

import com.psas.entity.CriminalReport;
import com.psas.entity.Page;
/**
 * 
 * 刑事案件登记书service接口
 * @author  XuzhenHAO
 * @data:  2017年2月7日 上午9:15:41
 * @version:  V1.0
 */
public interface Criminal_ReportService {
public static final String BEAN_NAME="criminal_ReportService";
	/**
	 * 
	 * 查找所有刑事案件信息service接口
	 * @return
	 * @throw
	 * @return List<CriminalReport>
	 */
	public List<CriminalReport> findAll();

	/**
	 * 
	 * 增加刑事案件信息service接口
	 * @param criminal
	 * @throw
	 * @return void
	 */
	public void add(CriminalReport criminal);

	/**
	 * 
	 * 删除刑事案件信息service接口
	 * @param criminal
	 * @throw
	 * @return void
	 */
	public void delete(CriminalReport criminal);

	/**
	 * 
	 * 修改刑事案件信息service接口
	 * @param criminal
	 * @throw
	 * @return void
	 */
	public void update(CriminalReport criminal);

	/**
	 * 
	 * 刑事案件登记书分页查询service接口
	 * @param page
	 * @return
	 * @throw
	 * @return List<CriminalReport>
	 */
	public List<CriminalReport> findCriminalByPage(Page page);
   /**
    * 
    * 根据刑事案件id查找信息
    * @param criminal
    * @return
    * @throw
    * @return List<CriminalReport>
    */
	
	public List<CriminalReport> findCriminalById(CriminalReport criminal);

	
}
