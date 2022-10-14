/**
 * 
 */
package com.kalleo.dscatalog.services;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import com.kalleo.dscatalog.dto.ProductDTO;
import com.kalleo.dscatalog.entities.Product;
import com.kalleo.dscatalog.repositories.ProductRepository;
import com.kalleo.dscatalog.services.exceptions.ResourceNotFoundException;
import com.kalleo.dscatalog.tests.Factory;

/**
 * @author Kalleo
 *
 */

@SpringBootTest
@Transactional //Garante que cada teste execute e efetue um rollback no banco para que cada teste seja independente
public class ProductServiceIT {
	
	@Autowired
	private ProductService service;
	
	@Autowired
	private ProductRepository repository;
	
	private Long existingId;
	private Long nonExistingId;
	private Long countTotalProducts;	
	
	@BeforeEach
	void setUp() throws Exception{
		existingId = 1L;
		nonExistingId = 1000L;
		countTotalProducts = 25L;		
	}
	
	@Test
	public void deleteShouldDeleteResourceWhenIdExists() {
		service.delete(existingId);
		Assertions.assertEquals(countTotalProducts - 1, repository.count());
	}
	
	@Test
	public void deleteShouldThrowResourceNotFoundExceptionWhenIdNotExists() {
		
		Assertions.assertThrows(ResourceNotFoundException.class,()->{
			service.delete(nonExistingId);
		});

	}
	
	@Test
	public void findAllPagedShouldReturnPageWhenPage01Size10() {
		PageRequest pageRequest = PageRequest.of(0, 10);		
		Page<ProductDTO> result = service.findAllPaged(pageRequest);
		
		Assertions.assertFalse(result.isEmpty());
		Assertions.assertEquals(0, result.getNumber());
		Assertions.assertEquals(10, result.getSize());		
		Assertions.assertEquals(countTotalProducts, result.getTotalElements());
	}
	
	@Test
	public void findAllPagedShouldReturnEmptyPageWhenPageDoesNotExists() {
	
		PageRequest pageRequest = PageRequest.of(50, 10);		
		Page<ProductDTO> result = service.findAllPaged(pageRequest);		
		Assertions.assertTrue(result.isEmpty());		
	}
	
	@Test
	public void findAllPagedShouldReturnSortedPageWhenSortByName() {
	
		PageRequest pageRequest = PageRequest.of(0,10,Sort.by("name"));
		
		Page<ProductDTO> result = service.findAllPaged(pageRequest);
		
		Assertions.assertFalse(result.isEmpty());
		
		Assertions.assertEquals("Macbook Pro", result.getContent().get(0).getName());
		Assertions.assertEquals("PC Gamer", result.getContent().get(1).getName());
		Assertions.assertEquals("PC Gamer Alfa", result.getContent().get(2).getName());
	}	
	
	
	
		
}
