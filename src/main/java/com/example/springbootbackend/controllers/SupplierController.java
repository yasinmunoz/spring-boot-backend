package com.example.springbootbackend.controllers;

import com.example.springbootbackend.entities.Supplier;
import com.example.springbootbackend.services.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SupplierController {

    @Autowired
    private ISupplierService service;

    @GetMapping("/api/suppliers")
    public List<Supplier> getAll(){
        return service.getAll();
    }

    @GetMapping("/api/suppliers/{id}")
    public Supplier getById(@PathVariable String id){
        return service.getById(Long.parseLong(id));
    }

    @PostMapping("/api/suppliers")
    public void save (@RequestBody Supplier supplier){
        service.save(supplier);
    }

    @DeleteMapping("/api/suppliers/{id}")
    public void remove (@PathVariable String id){
        service.remove(Long.parseLong(id));
    }
}
