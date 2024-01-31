package com.example.microservices.microservices.repository;

import com.example.microservices.microservices.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {

//    Optional<Customer>findCustomerByOrderId(int orderId);
}
