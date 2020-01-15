package com.filopl.shelter.service;

import com.filopl.shelter.model.AnimalEnun;
import com.filopl.shelter.repository.SheltherRepository;

public class SheltherService {
    private final SheltherRepository sheltherRepository;

    public SheltherService(SheltherRepository sheltherRepository) {
        this.sheltherRepository = sheltherRepository;
    }

    public boolean adoptAnimal(int id, String name, AnimalEnun breed) {
        return sheltherRepository.remove(id, name,breed);
    }
}
