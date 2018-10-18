package org.formation.spring.dao;

import org.formation.spring.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudClient extends JpaRepository<Client, Integer> {

	
//	List<Client> findAllClientByNom(String nom);
//
//	List<Client> findAllClientByLogin(String login);
	
}
