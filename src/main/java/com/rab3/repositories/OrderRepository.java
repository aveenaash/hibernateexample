package com.rab3.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.rab3.entities.OrderEntity;
import com.rab3.utils.HibernateUtil;

public class OrderRepository {

	public void save(OrderEntity orderEntity) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(orderEntity);
		session.getTransaction().commit();
		
		session.close();
	}
	
	public void update(OrderEntity orderEntity) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.update(orderEntity);
		session.getTransaction().commit();
		
		session.close();
	}
	
	public OrderEntity getById(Long id) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		OrderEntity order = session.get(OrderEntity.class, id);
		session.getTransaction().commit();
		
		session.close();
		return order;
	}
	

	
}
