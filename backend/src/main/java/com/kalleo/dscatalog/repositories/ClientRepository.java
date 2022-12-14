package com.kalleo.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kalleo.dscatalog.entities.Client;

/**
 * @author Kalleo
 *
 */

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
