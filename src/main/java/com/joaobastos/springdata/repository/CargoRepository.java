package com.joaobastos.springdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.joaobastos.springdata.entities.Cargo;

@Repository
public interface CargoRepository extends CrudRepository<Cargo, Integer> {

}
