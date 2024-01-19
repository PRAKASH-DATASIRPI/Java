package com.example.foodstore.Controller;

import com.example.foodstore.DTO.FoodstoreDTO;
import com.example.foodstore.Entity.Foodstore;
import com.example.foodstore.GlobalExceptionHandler;
import com.example.foodstore.Repo.FoodRepo;
import com.example.foodstore.Service.Foodservice;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

//import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/")
public class FoodController {
    @Autowired
     private Foodservice foodservice;
    @Autowired
    private FoodRepo foodRepo;

    @GetMapping("/page/")
    public Page<Foodstore> getFoods( @RequestParam(defaultValue = "0")int page, @RequestParam(defaultValue = "3")int size)   {
        return foodservice.getallFoods(page,size);
    }

    @PostMapping("/add")
    public String addFoodstore(@Valid @RequestBody FoodstoreDTO foodstoreDTO) throws GlobalExceptionHandler {
        String id =foodservice.addFood(foodstoreDTO);
        return "Successfully added"+id;
    }
    @GetMapping("/getall")
    public List<Foodstore> getAllEntities(){
        return foodservice.getAllEntities();
    }





}
