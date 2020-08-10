package com.service;

import com.entity.Pets;
import com.repository.ClienteRepository;
import com.repository.PetsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetsService {
    @Autowired
    private PetsRepository repository;

    public Pets savePets(Pets pets) {
        return repository.save(pets);
    }

    public List<Pets> savePets(List<Pets> pets) {
        return repository.saveAll(pets);
    }

    public List<Pets> getPets() {
        return repository.findAll();
    }

    public Pets getPetsById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Pets getPetsByName(String name) {
        return repository.findByName(name);
    }

    public String deletePets(int id) {
        repository.deleteById(id);
        return "cliente removed !! " + id;
    }

    public Pets updatePets(Pets pets) {
        Pets existingPest = repository.findById(pets.getId()).orElse(null);
        existingPest.setPet(pets.getPet());
        existingPest.setNamePets(pets.getNamePets());
        return repository.save(existingPest);
    }


}