package com.kalleo.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kalleo.dscatalog.entities.Category;

/**
 * @author Kalleo
 *
 */

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
