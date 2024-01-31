package com.example.customer.customer.services;

import com.example.customer.customer.entity.Customer;

import com.example.customer.customer.feignclient.OrderClient;
import com.example.customer.customer.repository.CustomerRepo;
import com.example.customer.customer.response.CustomerResponse;

import com.example.customer.customer.response.OrderResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ModelMapper mapper;


    @Autowired
    private OrderClient orderClient;

    public CustomerResponse getCustomerById(int id){
        Optional<Customer> customer=customerRepo.findById(id);
        CustomerResponse customerResponse= mapper.map(customer ,CustomerResponse.class);

        ResponseEntity<OrderResponse> orderResponse = orderClient.getOrderCustomerById(id);
        customerResponse.setOrderResponse(orderResponse.getBody());


       return customerResponse;
    }


}
