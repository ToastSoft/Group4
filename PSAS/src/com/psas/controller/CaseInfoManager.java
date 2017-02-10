package com.psas.controller;

import java.io.IOException;
import java.util.ArrayList;
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
import net.sf.json.JSONObject;

@Controller
public class CaseInfoManager {
	@Resource(name = AlarmInfoServiceImpl.BEAN_NAME)
	public AlarmInfoService alarmInfoService;

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
		JSONArray json=JSONArray.fromObject(alarms);
		resp.getWriter().println(json);
	}

	public AlarmInfoService getAlarmInfoService() {
		return alarmInfoService;
	}

	public void setAlarmInfoService(AlarmInfoService alarmInfoService) {
		this.alarmInfoService = alarmInfoService;
	}

}
