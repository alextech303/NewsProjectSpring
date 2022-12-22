package com.alextech.main.service;

import java.util.List;

import com.alextech.main.bean.News;

public interface NewsService {

	public List<News> getNews() throws ServiceException;

	public List<News> getLatestNews(int count) throws ServiceException;

	public News getNews(int id) throws ServiceException;
}
