package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.model.Customer;
import org.example.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    final CustomerService customerService;

    @PostMapping("/add-customer")
    public void addCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
    }
    @GetMapping("/searchById/{id}")
    public Customer searchById(@PathVariable Long id){
        return customerService.searchById(id);
    }

    @DeleteMapping("/delete-id/{id}")
    public void deleteById(@PathVariable Long id){
        customerService.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Customer student){
        customerService.update(student);
    }

    @GetMapping("/get-all")
    public List<Customer> getAll () {
        return customerService.getAll();
    }
}
