package com.example.employee.Employee.controller;


import com.example.employee.Employee.dto.EmployeeDTO;
import com.example.employee.Employee.entity.Employee;
import com.example.employee.Employee.repo.EmployeeRepo;
import com.example.employee.Employee.services.EmpServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/")
public class EmployeeController {

  @Autowired
  private EmpServices empServices;
@Autowired
private EmployeeRepo employeeRepo;

  @PostMapping("/add")
    public String addEmployee(@RequestBody EmployeeDTO empdto){

      String id = empServices.addEmployee(empdto);

        return id;
    }


   @GetMapping("/getall")
   public List<Employee> getAllEntities() {
     return empServices.getAllEntities();
   }

   @GetMapping("/getEmp/{id}")
   public Employee getSingleEmployee(@PathVariable int id){
    return empServices.getSingleEmp(id);
   }

    @GetMapping("/getEmpbyname/{name}")
    public List<Employee> getEmployeebyname(@PathVariable String name){
        return empServices.getEmployeebyname(name);
    }

    @PutMapping("/update/{id}")
    public String updateEmployee(@PathVariable int id,@RequestBody EmployeeDTO employeeDTO){
        return empServices.updateEmp(id,employeeDTO);
    }

    @DeleteMapping("/delete/{id}")
      public String deleteEmployee(@PathVariable int id){
           String ids = empServices.deleteEmp(id);
        return ids;
    }
}
