package com.rab3.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.rab3.entities.CategoryEntity;
import com.rab3.utils.HibernateUtil;

public class CategoryRepository {

	public void save(CategoryEntity categoryEntity) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(categoryEntity);
		session.getTransaction().commit();
		
		session.close();
	}
}
