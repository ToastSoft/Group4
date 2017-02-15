package com.psas.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.psas.entity.AlarmInfo;
import com.psas.service.AlarmInfoService;
import com.psas.service.impl.AlarmInfoServiceImpl;

import net.sf.json.JSONArray;

/**
 * 案件信息管理controller
 * @author  XulaiWang
 * @data:  2017年2月10日 下午1:39:27
 * @version:  V1.0
 */
@Controller
public class CaseInfoManager {
	@Resource(name = AlarmInfoServiceImpl.BEAN_NAME)
	public AlarmInfoService alarmInfoService;

	/**
	 * 处理跳转到案件信息管理页面的请求
	 * @param select
	 * @param data
	 * @return
	 * @throw
	 * @return ModelAndView
	 */
	@RequestMapping("/case_info_manager.do")
	public ModelAndView toCaseInfoManager(String select, ModelMap data) {
		System.out.println(select);
		data.addAttribute("select", select);
		return new ModelAndView("case_info_manager");
	}

	@RequestMapping("form/getAlarmInfo.do")
	public void getAlarmInfo(HttpServletResponse resp) throws IOException {
		resp.setCharacterEncoding("UTF-8");
		List<AlarmInfo> alarms = alarmInfoService.findAll();
		for (AlarmInfo a : alarms) {
			System.out.println(a);
		}
		JSONArray json = JSONArray.fromObject(alarms);
		resp.getWriter().println(json);
	}

	public AlarmInfoService getAlarmInfoService() {
		return alarmInfoService;
	}

	public void setAlarmInfoService(AlarmInfoService alarmInfoService) {
		this.alarmInfoService = alarmInfoService;
	}

	@RequestMapping("toalarm_info.do")
	public ModelAndView toalarm_info(HttpServletResponse resp, ModelMap data) throws IOException {
		//		resp.setCharacterEncoding("UTF-8");
		List<AlarmInfo> alarms = alarmInfoService.findAll();
		//		for (AlarmInfo a : alarms) {
		//			System.out.println(a);
		//		}
		JSONArray json = JSONArray.fromObject(alarms);
		//		resp.getWriter().println(json);
		data.addAttribute("alarmInfo", json);
		return new ModelAndView("form/alarm_info");
	}

}
