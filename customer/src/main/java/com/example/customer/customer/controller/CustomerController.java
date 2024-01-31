package com.example.customer.customer.controller;

import com.example.customer.customer.response.CustomerResponse;
import com.example.customer.customer.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired CustomerService customerService;


    @GetMapping("/customer/{id}")
    private ResponseEntity<CustomerResponse> getCustomerDetails(@PathVariable("id") int id) {
        CustomerResponse customer = customerService.getCustomerById(id);
        return ResponseEntity.status(HttpStatus.OK).body(customer);
    }

}
