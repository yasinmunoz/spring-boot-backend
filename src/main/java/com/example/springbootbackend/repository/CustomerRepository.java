package com.example.springbootbackend.repository;

import com.example.springbootbackend.entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Conexión y lógica con la base de datos

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {


}
