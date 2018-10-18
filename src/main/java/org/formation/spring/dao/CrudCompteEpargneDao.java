package org.formation.spring.dao;

import org.formation.spring.model.CompteEpargne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudCompteEpargneDao extends JpaRepository<CompteEpargne, Integer> {

}
