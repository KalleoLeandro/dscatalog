package com.kalleo.dscatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	public List<Category> findAll(){
		return repository.findAll();
	}

}
