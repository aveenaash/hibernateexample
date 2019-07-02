package com.rab3.main;

import com.rab3.entities.CategoryEntity;
import com.rab3.entities.ProductEntity;
import com.rab3.repositories.CategoryRepository;
import com.rab3.repositories.ProductRepository;

public class OneToOneMainExample {

	public static void main(String[] args) {
		
		CategoryRepository categoryRepository = new CategoryRepository();
		
		ProductRepository productRepository = new ProductRepository();
		
//		ProductEntity p = new ProductEntity();
//		p.setName("Tomato");
//		p.setDescription("very very fresh organic tomatoes");
//		p.setPrice(12.00d);
//		
		
		CategoryEntity electronicsCategory = categoryRepository.getCategoryByName("Electronics");
//		p.setCategory(electronicsCategory);
		
//		CategoryEntity groceriesCategory = categoryRepository.getCategoryByName("Groceries");
//		p.setCategory(groceriesCategory);
//		
//		productRepository.save(p);
		
		System.out.println("selecting tomato");
		
		ProductEntity tomato = productRepository.getProductByName("Tomato");
		System.out.println(tomato.toString());
		
		System.out.println("updating product to electronics");
		electronicsCategory.setDescription("This is test description");
		
		tomato.setCategory(electronicsCategory);
		productRepository.update(tomato);
		
		
		
	}
}
