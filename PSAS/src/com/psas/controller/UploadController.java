package com.psas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadController {

	@RequestMapping("toUpload.do")
	public ModelAndView toUpload() {
		return new ModelAndView("upload");

	}

}
