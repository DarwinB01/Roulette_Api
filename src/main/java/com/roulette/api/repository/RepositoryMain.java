package com.roulette.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.roulette.api.model.Roulette;

/**
 * Class for crud basic operations 
 * 
 * @author Darwin Bonilla
 * @version 1.0
 *
 */
@Repository
public interface RepositoryMain extends CrudRepository<Roulette, Long>{

}
