package com.example.foodstore.Service;

import com.example.foodstore.DTO.FoodstoreDTO;
import com.example.foodstore.Entity.Foodstore;
import com.example.foodstore.Repo.FoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Foodservice {
    @Autowired
    private FoodRepo foodRepo;


    public  Page<Foodstore> getallFoods(int page, int size) {

        PageRequest pageRequest=PageRequest.of(page, size);
        return foodRepo.findAll(pageRequest);
    }


    public List<Foodstore> getAllEntities(){
        return foodRepo.findAll();
    }


    public String addFood(FoodstoreDTO foodstoreDTO){
        Foodstore food = new Foodstore(foodstoreDTO);
        Foodstore foodsave = foodRepo.save(food);
        return foodsave.toString();


    }
}
