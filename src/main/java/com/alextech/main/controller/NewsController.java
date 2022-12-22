package com.alextech.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import com.alextech.main.bean.News;
import com.alextech.main.service.NewsService;
import com.alextech.main.service.ServiceException;

@Controller
@RequestMapping("/news")
public class NewsController {

	@Autowired
	private NewsService newsService;
	private static final int newsNumber = 3;

	@GetMapping("/welcomPage")
	public String listLatesNews(Model theModel) {

		theModel.addAttribute("user", "notActive");

		return "baseLayout";
	}

}
