package com.example.employee.Employee.repo;

import com.example.employee.Employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {


    List<Employee> findByName(String name);
}
