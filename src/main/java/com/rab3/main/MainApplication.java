package com.rab3.main;

import java.util.List;

import com.rab3.entities.CategoryEntity;
import com.rab3.repositories.CategoryRepository;

public class MainApplication {
	
	public static void main(String[] args) {
		
		CategoryRepository categoryRepository = new CategoryRepository();
		
//		CategoryEntity categoryEntity = new CategoryEntity();
//		categoryEntity.setName("Stationary");
//		categoryEntity.setDescription("This is category for stationary");
//		
//		
//		categoryRepository.save(categoryEntity);
		
		System.out.println("Reading category with id 1");
		CategoryEntity c1 = categoryRepository.getCategoryById(1l);
		if(c1 != null) {
			System.out.println(c1.toString());
		}
		
		System.out.println("***************************************************");
		
		
		System.out.println("Reading category with name Stationary");
		CategoryEntity c2 = categoryRepository.getCategoryByName("stationary");
		if(c2 != null) {
			System.out.println(c2.toString());
		}
		
		System.out.println("***************************************************");
		
		System.out.println("Reading all categories");
		List<CategoryEntity> categories = categoryRepository.getAllCategory();
		for(CategoryEntity c : categories) {
			System.out.println(c.toString());
		}
		
		
		System.out.println("Update by stationary");
		c2.setName("Groceries");
		c2.setDescription("This is groceries");
		categoryRepository.update(c2);
		
		
		
		
	}

}
