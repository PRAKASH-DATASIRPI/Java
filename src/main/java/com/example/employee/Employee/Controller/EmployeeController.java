package com.example.employee.Employee.Controller;


import com.example.employee.Employee.DTO.EmployeeDTO;
import com.example.employee.Employee.Entity.Employee;
import com.example.employee.Employee.Repo.EmployeeRepo;
import com.example.employee.Employee.Services.EmpServices;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/")
@Tag(name = "My employee data")
public class EmployeeController {

  @Autowired
  private EmpServices empServices;
@Autowired
private EmployeeRepo employeeRepo;

    public EmployeeController(EmpServices empServices, EmployeeRepo employeeRepo) {
        this.empServices = empServices;
        this.employeeRepo = employeeRepo;
    }

    @PostMapping("/add")
  @Operation(summary = "add operation",description="This list our current post")

  public String addEmployee(@RequestBody EmployeeDTO empdto){

      String id = empServices.addEmployee(empdto);

        return id;
    }


   @GetMapping("/getall")
   @Operation(summary = "get operation",description = "it collect all")
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
