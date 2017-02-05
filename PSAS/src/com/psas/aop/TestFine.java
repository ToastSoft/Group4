package com.psas.aop;

import javax.annotation.Resource;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.psas.entity.FineInfo;
import com.psas.service.FineInfoService;

@Component
@Aspect
public class TestFine {
	FineInfo fine;
	@Resource(name = FineInfoService.BEAN_NAME)
	private FineInfoService fineInfoService;

	public FineInfoService getFineInfoService() {
		return fineInfoService;
	}

	public void setFineInfoService(FineInfoService fineInfoService) {
		this.fineInfoService = fineInfoService;
	}

	@Around("within(com.psas.test..*)")
	public Object testAroundFine(ProceedingJoinPoint p) throws Throwable {
		String className = p.getTarget().getClass().getName();
		String methodName = p.getSignature().getName();
		fineInfoService.add(new FineInfo(null, null, "调用  " + className + " 类, " + methodName + " 方法", methodName, methodName, 1, null));
		Object proceed = p.proceed();
		fineInfoService.add(new FineInfo(null, null, "调用  " + className + " 类, " + methodName + " 方法结束", methodName, methodName, 1, null));
		return proceed;

	}

	
}
