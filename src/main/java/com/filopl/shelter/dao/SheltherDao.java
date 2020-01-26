package com.filopl.shelter.dao;

import com.filopl.shelter.entity.Shelther;

import java.util.List;

public interface SheltherDao {

    List<Shelther> findAll();

    void insertAnimal(Shelther animal);
    void updateAnimal(Shelther animal);
    public void deleteEmployee(Shelther animal);


}
