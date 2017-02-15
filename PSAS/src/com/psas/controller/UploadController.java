package com.psas.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.psas.entity.AlarmInfo;
import com.psas.service.AlarmInfoService;

@Controller
public class UploadController {
	
	@Resource(name=AlarmInfoService.BEAN_NAME)
	AlarmInfoService alarmInfoService;

	@RequestMapping("toUpload.do")
	public ModelAndView toUpload() {
		return new ModelAndView("upload");

	}

	@RequestMapping()
	public ModelAndView upload(@Param("select") String select, @RequestParam(required = false) MultipartFile file,
			HttpServletRequest req, HttpServletResponse resp, HttpSession session)
					throws IllegalStateException, IOException {
		Workbook workbook = null;
		String path = session.getServletContext().getRealPath("upload");
		String pathName = path + "\\" + file.getOriginalFilename();
		File targetFile = new File(pathName);
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}
		file.transferTo(targetFile);
		// 指定要读取的文件
		FileInputStream readFile = new FileInputStream(pathName);
		// 从文件流中创建一个workbook
		if (pathName.endsWith("xls")) {
			System.out.println("xls");
			workbook = new HSSFWorkbook(readFile);
		} else if (pathName.endsWith("xlsx")) {
			System.out.println("xlsx");
			workbook = new XSSFWorkbook(readFile);
		} else {
			System.out.println("not excel");
		}
		//		HSSFWorkbook wb = new HSSFWorkbook(readFile);
		//		int numberOfSheets = wb.getNumberOfSheets();
		Sheet sheet = workbook.getSheetAt(0);
		String aaa = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(aaa);
		System.out.println(sheet.getLastRowNum());//获得一共有多少行
		System.out.println(sheet.getRow(0).getPhysicalNumberOfCells());//获得一行有多少元素
		for (int i = 1;; i++) {
			if (sheet.getRow(i).getCell(1) == null) {
				break;
			}
			AlarmInfo alarmInfo = new AlarmInfo();
			alarmInfo.setAlarmName(sheet.getRow(i).getCell(1).getStringCellValue());
			alarmInfo.setAlarmGender(String.valueOf((int) sheet.getRow(i).getCell(2).getNumericCellValue()));
			alarmInfo.setAlarmTelephone(sheet.getRow(i).getCell(3).getStringCellValue());
			alarmInfo.setAlarmAddress(sheet.getRow(i).getCell(4).getStringCellValue());
			alarmInfo.setAlarmTime(Timestamp.valueOf(sheet.getRow(i).getCell(5).getStringCellValue()));
			alarmInfo.setAlarmFormat((int) sheet.getRow(i).getCell(6).getNumericCellValue());
			alarmInfo.setAlarmContent(sheet.getRow(i).getCell(7).getStringCellValue());
			alarmInfo.setAlarmCaseTime(Timestamp.valueOf(sheet.getRow(i).getCell(8).getStringCellValue()));
			alarmInfo.setAlarmPlace(sheet.getRow(i).getCell(9).getStringCellValue());
			alarmInfo.setReceptionPoliceman((int) sheet.getRow(i).getCell(10).getNumericCellValue());
			alarmInfo.setHandleSituation(sheet.getRow(i).getCell(11).getStringCellValue());
			alarmInfo.setHandlePoliceman((int) sheet.getRow(i).getCell(12).getNumericCellValue());
			alarmInfo.setLossSiuation(sheet.getRow(i).getCell(13).getStringCellValue());
			alarmInfo.setDeathNumber((int) sheet.getRow(i).getCell(14).getNumericCellValue());
			alarmInfo.setInjuredNumber((int) sheet.getRow(i).getCell(15).getNumericCellValue());
			alarmInfo.setEconomicLoss(sheet.getRow(i).getCell(16).getNumericCellValue());
			alarmInfo.setHandleResult((int) sheet.getRow(i).getCell(17).getNumericCellValue());
			alarmInfo.setDutyLeader((int) sheet.getRow(i).getCell(18).getNumericCellValue());
			alarmInfoService.add(alarmInfo);
		}
		
		return null;

	}

	public AlarmInfoService getAlarmInfoService() {
		return alarmInfoService;
	}

	public void setAlarmInfoService(AlarmInfoService alarmInfoService) {
		this.alarmInfoService = alarmInfoService;
	}
}
