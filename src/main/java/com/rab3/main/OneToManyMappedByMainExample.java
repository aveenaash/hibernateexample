package com.rab3.main;

import java.util.ArrayList;
import java.util.List;

import com.rab3.entities.CategoryEntity;
import com.rab3.entities.ProductEntity;
import com.rab3.repositories.CategoryRepository;

public class OneToManyMappedByMainExample {

	public static void main(String[] args) {

		CategoryRepository categoryRepository = new CategoryRepository();
		
//		CategoryEntity c = categoryRepository.getCategoryByName("Electronics");
//		System.out.println("products for catgeory Electronics");
//		
//		for(ProductEntity p : c.getProducts()) {
//			System.out.println(p.toString());
//		}
//		
//		ProductEntity p = new ProductEntity();
//		p.setName("Ps4");
//		p.setDescription("ps4");
//		p.setPrice(400.00d);
//		p.setCategory(c);
//		
//		c.getProducts().add(p);
//		
//		categoryRepository.update(c);
		
		CategoryEntity categoryEntity = new CategoryEntity();
		categoryEntity.setName("Stationary");
		categoryEntity.setDescription("This is category for stationary");
		
		ProductEntity p1 = new ProductEntity();
		p1.setName("pencil");
		p1.setDescription("this is a pencil");
		p1.setPrice(1.00d);
		p1.setCategory(categoryEntity);
		
		ProductEntity p2 = new ProductEntity();
		p2.setName("books");
		p2.setDescription("this is a book");
		p2.setPrice(2.00d);
		p2.setCategory(categoryEntity);
		
		List<ProductEntity> products = new ArrayList<ProductEntity>();
		products.add(p1);
		products.add(p2);
		
		categoryEntity.setProducts(products);
		
		
		categoryRepository.save(categoryEntity);
		
	
	
	}
}
