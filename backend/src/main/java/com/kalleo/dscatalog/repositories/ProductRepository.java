package com.kalleo.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kalleo.dscatalog.entities.Product;

/**
 * @author Kalleo
 *
 */

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
