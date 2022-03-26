package com.example.springbootbackend.services;

import com.example.springbootbackend.entities.Supplier;

import java.util.List;

public interface ISupplierService {

    List<Supplier> getAll();

    Supplier getById(Long id);

    void save(Supplier supplier);

    void remove(Long id);
}
