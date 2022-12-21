package com.alextech.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/news")
public class NewsController {

	@GetMapping("/welcomPage")
	public String listLatesNews(Model theModel) {

		theModel.addAttribute("user", "notActive");
		theModel.addAttribute("show", "ok");

		return "baseLayout";
	}

}
