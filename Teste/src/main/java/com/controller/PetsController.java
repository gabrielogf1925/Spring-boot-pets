package com.controller;

import com.entity.Pets;
import com.service.PetsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PetsController {

    @Autowired
    private PetsService service;

    @PostMapping("/addPets")
    public Pets addPets(@RequestBody Pets pest) {
        return service.savePets(pest);
    }

    @PostMapping("/addPets")
    public List<Pets> addCliente(@RequestBody List<Pets> pest) {
        return service.savePets(pest);
    }

    @GetMapping("/pets")
    public List<Pets> findAllCliente() {
        return service.getPets();
    }

    @GetMapping("/petsById/{id}")
    public Pets findClienteById(@PathVariable int id) {
        return service.getPetsById(id);
    }

    @GetMapping("/pets/{name}")
    public Pets findClienteByName(@PathVariable String namePets) {
        return service.getPetsByName(namePets);
    }

    @PutMapping("/update")
    public Pets updatePets(@RequestBody Pets pest) {
        return service.updatePets(pest);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePest(@PathVariable int id) {
        return service.deletePets(id);
    }
}