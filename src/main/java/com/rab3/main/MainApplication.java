package com.rab3.main;

import com.rab3.entities.CategoryEntity;
import com.rab3.repositories.CategoryRepository;

public class MainApplication {
	
	public static void main(String[] args) {
		CategoryEntity categoryEntity = new CategoryEntity();
		categoryEntity.setName("Electronics");
		categoryEntity.setDescription("This is category for electronics");
		
		CategoryRepository categoryRepository = new CategoryRepository();
		categoryRepository.save(categoryEntity);
	}

}
