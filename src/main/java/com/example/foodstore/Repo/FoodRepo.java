package com.example.foodstore.Repo;

import com.example.foodstore.Entity.Foodstore;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface FoodRepo extends JpaRepository<Foodstore,Integer> {

    Page<Foodstore> findAll(Pageable pageable);


}
