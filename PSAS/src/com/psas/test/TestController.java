package com.psas.test;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.psas.entity.LogInfo;
import com.psas.service.LogInfoService;

@Controller
@RequestMapping("/test")
public class TestController {
	@Resource(name = LogInfoService.BEAN_NAME)
	private LogInfoService logInfoService;

	@RequestMapping("/test01.do")
	public String test01(ModelMap data) {
		List<LogInfo> logs = logInfoService.findAll();
		data.addAttribute("logs", logs);
		return "test_jsp";

	}

	public LogInfoService getLogInfoService() {
		return logInfoService;
	}

	public void setLogInfoService(LogInfoService logInfoService) {
		this.logInfoService = logInfoService;
	}

}
