package com.psas.aop;

import javax.annotation.Resource;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.psas.entity.LogInfo;
import com.psas.service.LogInfoService;
@Component
@Aspect
public class ControllerLog {
	LogInfo log;
	@Resource(name = LogInfoService.BEAN_NAME)
	private LogInfoService logInfoService;
	
	@Around("within(com.psas.controller..*)")
	public Object testAroundLog(ProceedingJoinPoint p) throws Throwable {
		String className = p.getTarget().getClass().getName();
		String methodName = p.getSignature().getName();
		logInfoService.add(new LogInfo("调用  " + className + " 类, " + methodName + " 方法", 1));
		Object proceed = p.proceed();
		logInfoService.add(new LogInfo("调用  " + className + " 类, " + methodName + " 方法结束", 1));
		return proceed;
	}
	
	

	public LogInfoService getLogInfoService() {
		return logInfoService;
	}

	public void setLogInfoService(LogInfoService logInfoService) {
		this.logInfoService = logInfoService;
	}


}
