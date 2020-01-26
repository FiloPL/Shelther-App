package com.filopl.shelter.service;

import com.filopl.shelter.dao.SheltherDao;
import com.filopl.shelter.entity.Shelther;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class SheltherServicesImpl implements SheltherService {

    @Resource
    SheltherDao sheltherDao;

    @Override
    public List<Shelther> findAll() {
        return sheltherDao.findAll();
    }

    @Override
    public void insertAnimal(Shelther animal) {
        sheltherDao.insertAnimal(animal);
    }

    @Override
    public void updateAnimal(Shelther animal) {
        sheltherDao.updateAnimal(animal);
    }

    @Override
    public void deleteEmployee(Shelther animal) {
        sheltherDao.deleteEmployee(animal);
    }
}
