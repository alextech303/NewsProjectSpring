package com.alextech.main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alextech.main.bean.News;
import com.alextech.main.dao.NewsDao;
import com.alextech.main.dao.NewsDaoException;

@Service
public class NewsServiceImpl implements NewsService {
	
	@Autowired
	private NewsDao newsDao;

	@Override
	@Transactional
	public List<News> getNews() throws ServiceException {
		try {
			return newsDao.getNews();
			
		} catch (NewsDaoException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	@Transactional
	public List<News> getLatestNews(int count) throws ServiceException {

		try {
			return newsDao.getLatestNews(count);
			
		} catch (NewsDaoException e) {
			throw new ServiceException(e);
		}
	}
	

	@Override
	@Transactional
	public News getNews(int id) throws ServiceException {

		try {
			return newsDao.getNews(id);
			
		} catch (NewsDaoException e) {
			throw new ServiceException(e);
		}
	}
	}


