package com.example.foodstore.DTO;


import jakarta.persistence.Column;
import lombok.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

@Data
@Getter
@Setter


public class FoodstoreDTO {



    private int id;

    @NotEmpty(message = "name required")
    private String name;

    @NotNull(message = "price required")
    private int price;


    private String category;

    public FoodstoreDTO(int id, String name, int price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }
//generate default constructor
    public FoodstoreDTO() {
    }
// generate all args get setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
