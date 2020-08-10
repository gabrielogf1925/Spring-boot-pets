package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Pets;

public interface PetsRepository extends JpaRepository<Pets,Integer> {
	Pets findByName(String name);
}

