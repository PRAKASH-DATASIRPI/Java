package com.example.testing.junittest.repo;

import com.example.testing.junittest.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
