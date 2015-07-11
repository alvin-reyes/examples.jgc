package com.macq.ci.tools.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseDao {
	
	@Autowired
	private SessionFactory hibernateSessionFactory;

	public SessionFactory getSessionFactory() {
		return hibernateSessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateSessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		if(this.getSessionFactory().openSession().isOpen()) {
			return this.getSessionFactory().getCurrentSession();
		}else {
			return this.getSessionFactory().openSession();
		}
	}
	
	
}
