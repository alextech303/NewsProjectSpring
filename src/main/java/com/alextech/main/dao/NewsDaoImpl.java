package com.alextech.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.alextech.main.bean.News;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

@Repository
public class NewsDaoImpl implements NewsDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<News> getNews() throws NewsDaoException {
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			Query<News> theQuery = currentSession.createQuery("from News order by date asc");
			List<News> theNews = theQuery.getResultList();

			return theNews;

		} catch (Exception e) {
			throw new NewsDaoException(e);
		}
	}

	@Override
	public List<News> getLatestNews(int count) throws NewsDaoException {
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			Query<News> theQuery = currentSession.createQuery("from News order by date asc");
			theQuery.setMaxResults(count);

			List<News> theNews = theQuery.getResultList();

			return theNews;
			
		} catch (Exception e) {
			throw new NewsDaoException(e);
		}
	}
	

	@Override
	public News getNews(int id) throws NewsDaoException {
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			News theNews = currentSession.get(News.class, id);

			return theNews;

		} catch (Exception e) {
			throw new NewsDaoException(e);
		}

}
}
