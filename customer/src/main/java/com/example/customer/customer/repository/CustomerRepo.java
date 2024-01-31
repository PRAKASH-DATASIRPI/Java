package com.example.customer.customer.repository;

import com.example.customer.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer ,Integer> {
}
