package com.example.springbootbackend.controllers;

import com.example.springbootbackend.entities.Customer;
import com.example.springbootbackend.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Aquí van a ir los endpoints de nuestra api rest (el punto de acceso)

@RestController
public class CustomerController {

    @Autowired
    private ICustomerService service;

    @GetMapping("/api/customers")
    public List<Customer> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/customers/{id}")
    public Customer getById(@PathVariable String id) {
        return service.getById(Long.parseLong(id));
    }

    @PostMapping("/api/customers")
    public void save (@RequestBody Customer customer) {
        service.save(customer);
    }

    @DeleteMapping("api/customers/{id}")
    public void remove (@PathVariable String id) {
        service.remove(Long.parseLong(id));
    }
}
