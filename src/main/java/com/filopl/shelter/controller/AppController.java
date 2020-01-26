package com.filopl.shelter.controller;

import com.filopl.shelter.entity.Shelther;
import com.filopl.shelter.service.SheltherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/app")
public class AppController {

    @Resource
    SheltherService sheltherService;

    @GetMapping(value = "/sheltherList")
    public List<Shelther> getAnimalList() {
        return sheltherService.findAll();
    }
}
