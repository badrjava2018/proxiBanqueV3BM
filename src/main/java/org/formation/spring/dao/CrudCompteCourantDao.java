package org.formation.spring.dao;

import org.formation.spring.model.CompteCourant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudCompteCourantDao extends JpaRepository<CompteCourant, Integer>{

}
