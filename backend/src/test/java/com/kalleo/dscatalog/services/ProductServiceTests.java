package com.kalleo.dscatalog.services;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.kalleo.dscatalog.repositories.ProductRepository;

/**
 * @author Kalleo
 *
 */

@ExtendWith(SpringExtension.class)
public class ProductServiceTests {

	@InjectMocks
	private ProductService service;
	
	@Mock	
	private ProductRepository repository;
	
	@MockBean
	private ProductRepository repository2;
}
