package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
    Cliente findByName(String name);
}

