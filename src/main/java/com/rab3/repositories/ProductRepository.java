package com.rab3.repositories;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.rab3.entities.ProductEntity;
import com.rab3.utils.HibernateUtil;

public class ProductRepository {

	public void save(ProductEntity productEntity) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(productEntity);
		session.getTransaction().commit();
		
		session.close();
	}
	
	public void update(ProductEntity productEntity) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.update(productEntity);
		session.getTransaction().commit();
		
		session.close();
	}
	
	public ProductEntity getProductByName(String  name) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		Query query = session.createQuery("From ProductEntity p where p.name = :name");
		query.setParameter("name", name);
		
		List<ProductEntity> products = (List<ProductEntity>) query.getResultList();
		
		session.getTransaction().commit();
		session.close();
		
		if(products.size() >0) {
			return products.get(0);
		}
		
		return null;
	}
	

	
}
