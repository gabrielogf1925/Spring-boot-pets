package com.service;

import com.entity.Cliente;
import com.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    public Cliente saveCliente(Cliente cliente) {
        return repository.save(cliente);
    }

    public List<Cliente> saveCliente(List<Cliente> cliente) {
        return repository.saveAll(cliente);
    }

    public List<Cliente> getCliente() {
        return repository.findAll();
    }

    public Cliente getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Cliente getClienteByName(String name) {
        return repository.findByName(name);
    }

    public String deleteCliente(int id) {
        repository.deleteById(id);
        return "cliente removed !! " + id;
    }

    public Cliente updateCliente(Cliente cliente) {
        Cliente existingCliente = repository.findById(cliente.getId()).orElse(null);
        existingCliente.setName(cliente.getName());
        existingCliente.setCpf(cliente.getCpf());
        existingCliente.setRg(cliente.getRg());
        return repository.save(existingCliente);
    }


}
