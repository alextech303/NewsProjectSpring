package com.alextech.main.dao;

import java.util.List;

import com.alextech.main.bean.News;

public interface NewsDao {
	public List<News> getNews() throws NewsDaoException;

	public List<News> getLatestNews(int count) throws NewsDaoException;

	public News getNews(int id) throws NewsDaoException;
}
