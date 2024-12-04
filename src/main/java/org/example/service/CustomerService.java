package org.example.service;

import org.example.model.Customer;

import java.util.List;

public interface CustomerService {

    void addCustomer(Customer customer);

    Customer searchById(Long id);

    void deleteById(Long id);

    void update(Customer student);

    List<Customer> getAll();
}
