package com.example.GeneratePDF.Repository;

import com.example.GeneratePDF.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<UserEntity,Integer> {
}
