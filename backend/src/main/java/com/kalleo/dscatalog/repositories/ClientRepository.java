/**
 * 
 */
package com.kalleo.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kalleo.dscatalog.entities.Client;

/**
 * @author Kalleo
 *
 */
public interface ClientRepository extends JpaRepository<Client, Long>{

}
