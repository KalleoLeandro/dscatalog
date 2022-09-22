package com.kalleo.dscatalog.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kalleo.dscatalog.dto.CategoryDTO;
import com.kalleo.dscatalog.entities.Category;
import com.kalleo.dscatalog.repositories.CategoryRepository;

/**
 * @author Kalleo
 *
 */

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	@Transactional(readOnly = true)	
	public List<CategoryDTO> findAll(){		
		List<Category> list = repository.findAll();		
		
		/*
		List<CategoryDTO> listDto = new ArrayList<>();
		for(Category cat : list) {
			listDto.add(new CategoryDTO(cat));
		}
		*/	
		return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
	}

}
