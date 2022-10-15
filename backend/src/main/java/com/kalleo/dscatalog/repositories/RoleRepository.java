/**
 * 
 */
package com.kalleo.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kalleo.dscatalog.entities.Role;

/**
 * @author Kalleo
 *
 */

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
