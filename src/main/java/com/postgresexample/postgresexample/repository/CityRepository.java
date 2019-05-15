package com.postgresexample.postgresexample.repository;

import com.postgresexample.postgresexample.model.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}