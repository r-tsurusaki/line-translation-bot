package com.gwa.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GwaWebController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
