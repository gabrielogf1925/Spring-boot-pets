package com.controller;

import com.entity.Cliente;
import com.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping("/addProduct")
    public Cliente addCliente(@RequestBody Cliente cliente) {
        return service.saveCliente(cliente);
    }

    @PostMapping("/addCliente")
    public List<Cliente> addCliente(@RequestBody List<Cliente> cliente) {
        return service.saveCliente(cliente);
    }

    @GetMapping("/cliente")
    public List<Cliente> findAllCliente() {
        return service.getCliente();
    }

    @GetMapping("/clienteById/{id}")
    public Cliente findClienteById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping("/cliente/{name}")
    public Cliente findClienteByName(@PathVariable String name) {
        return service.getClienteByName(name);
    }

    @PutMapping("/update")
    public Cliente updateCliente(@RequestBody Cliente cliente) {
        return service.updateCliente(cliente);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCliente(@PathVariable int id) {
        return service.deleteCliente(id);
    }
}
