package com.gwa.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GwaWebController {

	@RequestMapping("/")
	public String index(Model model) {

		model.addAttribute("textStr", "Hello Spring MVC!!");

		return "index";
	}
}
