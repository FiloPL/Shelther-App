package com.filopl.shelter.repository;

import com.filopl.shelter.model.AnimalEnun;
import com.filopl.shelter.model.Shelther;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static com.filopl.shelter.model.AnimalEnun.*;

@Repository
public class SheltherRepository {
    private Set<Shelther> sheltherSet = initialize();

    private Set<Shelther> initialize() {
        return new HashSet<>(Arrays.asList(
                new Shelther(1, "Azor", MALE, DOG, 2),
                new Shelther(2, "Diego", FEMAL, DOG, 5)
        ));
    }

    public void addAnimal(Shelther animalToAdd) {
        animalToAdd.setId(generateNexId());
        sheltherSet.add(animalToAdd);

    }

    private int generateNexId() {
        return sheltherSet.stream().mapToInt(Shelther::getId).max().getAsInt()+1;
    }

    public boolean remove(int id, String name, AnimalEnun breed) {
        return sheltherSet.remove(id);
    }
}
