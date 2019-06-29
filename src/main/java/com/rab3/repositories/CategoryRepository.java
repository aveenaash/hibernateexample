package com.rab3.repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

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
	
	public CategoryEntity getCategoryById(Long id) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		CategoryEntity category = session.get(CategoryEntity.class, id);
		
		session.getTransaction().commit();
		session.close();
		
		return category;
	
	}
	
	
	public CategoryEntity getCategoryByName(String  name) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		Query query = session.createQuery("From CategoryEntity c where c.name = :name");
		query.setParameter("name", name);
		
		List<CategoryEntity> categories = (List<CategoryEntity>) query.getResultList();
		
		session.getTransaction().commit();
		session.close();
		
		if(categories.size() >0) {
			return categories.get(0);
		}
		
		return null;
	}
	
	public List<CategoryEntity> getAllCategory() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		Query query = session.createQuery("From CategoryEntity c");
		
		List<CategoryEntity> categories = (List<CategoryEntity>) query.getResultList();
	
		session.getTransaction().commit();
		session.close();
		
		return categories;
	}
	
	public void update(CategoryEntity categoryEntity) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.update(categoryEntity);
	
		session.getTransaction().commit();
		session.close();
		
	}
	
}
