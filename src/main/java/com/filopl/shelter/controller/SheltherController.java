package com.filopl.shelter.controller;

import com.filopl.shelter.ShelterAnimak;
import com.filopl.shelter.service.SheltherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class SheltherController {
    private final SheltherService sheltherService;

    public SheltherController( SheltherService sheltherService) {
        this.sheltherService = sheltherService;
    }

    @GetMapping(value = "/shelther", produces = "application/json")
    public Set<ShelterAnimak> getAllAnimals(@RequestParam(required = false) String name) {

    }

}
