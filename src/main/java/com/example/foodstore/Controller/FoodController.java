package com.example.foodstore.Controller;

import com.example.foodstore.DTO.FoodstoreDTO;
import com.example.foodstore.Entity.Foodstore;
import com.example.foodstore.Repo.FoodRepo;
import com.example.foodstore.Service.Foodservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

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
    public Page<Foodstore> getFoods(@RequestParam(defaultValue = "0")int page, @RequestParam(defaultValue = "3")int size){
        return foodservice.getallFoods(page,size);
    }

    @PostMapping("/add")
    public String addFoodstore(@RequestBody FoodstoreDTO foodstoreDTO){
        String id =foodservice.addFood(foodstoreDTO);
        return "Successfully added";
    }
    @GetMapping("/getall")
    public List<Foodstore> getAllEntities(){
        return foodservice.getAllEntities();
    }




}
