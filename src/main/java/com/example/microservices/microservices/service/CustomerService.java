package com.example.microservices.microservices.service;


import com.example.microservices.microservices.entity.Customer;
import com.example.microservices.microservices.repository.CustomerRepo;
import com.example.microservices.microservices.response.CustomerResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ModelMapper mapper;

//
//    public CustomerResponse findCustomerByOrderId(int orderId) {
//        Optional<Customer>customerByOrderId=customerRepo.findCustomerByOrderId(orderId);
//        CustomerResponse customerResponse= mapper.map(customerByOrderId,CustomerResponse.class);
//
//        return customerResponse;
//    }
}
