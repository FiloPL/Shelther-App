package com.filopl.shelter.service;

import com.filopl.shelter.entity.Shelther;

import java.util.List;

public interface SheltherService {
    List<Shelther> findAll();

    void insertAnimal(Shelther animal);
    void updateAnimal(Shelther animal);
    public void deleteEmployee(Shelther animal);
}
