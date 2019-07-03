package com.rab3.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.rab3.entities.OrderEntity;
import com.rab3.entities.ProductEntity;
import com.rab3.repositories.OrderRepository;
import com.rab3.repositories.ProductRepository;

public class OneToManyJoinTableMainExample {

	public static void main(String[] args) {

		ProductRepository productRepository = new ProductRepository();
		
		OrderRepository orderRepository = new OrderRepository();
		
		// this is for insert
		
//		OrderEntity order1 = new OrderEntity();
//		order1.setStatus("NEW");
//		order1.setCreatedAt(new Date());
//		
//		ProductEntity pencil = productRepository.getProductByName("pencil");
//		
//		ProductEntity ps4 = productRepository.getProductByName("Ps4");
//		
//		List<ProductEntity> products = new ArrayList<ProductEntity>();
//		products.add(pencil);
//		products.add(ps4);
//		
//		order1.setProducts(products);
//		
//		orderRepository.save(order1);
		
		// this is update
//		OrderEntity order1 = orderRepository.getById(2l);
//		order1.setStatus("Shipped");
//		orderRepository.update(order1);
		
		OrderEntity order1 = orderRepository.getById(2l);
		System.out.println(order1.toString());
		System.out.println("********** Products **************");
		
		for(ProductEntity p : order1.getProducts()) {
			System.out.println(p.toString());
		}
	
	
	}
}
