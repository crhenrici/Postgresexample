package com.postgresexample.postgresexample.controller;

import com.postgresexample.postgresexample.model.*;
import com.postgresexample.postgresexample.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class MyController {

    @Autowired
    private ICityService cityService;

    @GetMapping("/showCities")
    public String findCities(Model model) {
        List<City> cities = (List<City>) cityService.findAll();
        model.addAttribute("cities", cities);
        return "showCities";
    }
}