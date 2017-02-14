package com.psas.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

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

@Controller
public class UploadController {

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
		return null;

	}
}
