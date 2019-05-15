package com.postgresexample.postgresexample.service;

import com.postgresexample.postgresexample.model.*;
import com.postgresexample.postgresexample.repository.*;
import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
public class CityService implements ICityService {

    @Autowired
    private CityRepository repository;

    @Override
    public List<City> findAll() {
        List<City> cities = (List<City>) repository.findAll();

        return cities;
    }
}