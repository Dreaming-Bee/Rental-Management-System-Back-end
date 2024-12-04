package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.entity.CustomerEntity;
import org.example.model.Customer;
import org.example.repository.CustomerRepository;
import org.example.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    final CustomerRepository customerRepository;
    final ModelMapper modelMapper;
    @Override
    public void addCustomer(Customer customer) {
        customerRepository.save(modelMapper.map( customer , CustomerEntity.class));
    }

    @Override
    public Customer searchById(Long id) {
        return modelMapper.map(customerRepository.findById(id), Customer.class);
    }

    @Override
    public void deleteById(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public void update(Customer customer) {
        customerRepository.save(modelMapper.map(customer, CustomerEntity.class));
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> customertList = new ArrayList<>();
        customerRepository.findAll().forEach(CustomerEntity -> {
            customertList.add(modelMapper.map(CustomerEntity, Customer.class));
        });
        return customertList;
    }
}
