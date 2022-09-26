/**
 * 
 */
package com.kalleo.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kalleo.dscatalog.entities.Product;

/**
 * @author Kalleo
 *
 */
public interface ProductRepository extends JpaRepository<Product, Long>{

}
