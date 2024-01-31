package com.example.microservices.microservices.controller;


import com.example.microservices.microservices.entity.Customer;
import com.example.microservices.microservices.repository.CustomerRepo;
import com.example.microservices.microservices.response.CustomerResponse;
import com.example.microservices.microservices.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired CustomerService customerService;

    @Autowired
    CustomerRepo customerRepo;

    @PostMapping("/customer")
    public ResponseEntity<Customer> getCustomerByOrderId(@RequestBody Customer customer) {
        Customer customerResponse = customerRepo.save(customer);
        return ResponseEntity.status(HttpStatus.OK).body(customerResponse);
    }


}
