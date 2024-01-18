package com.example.foodstore.Entity;



import com.example.foodstore.DTO.FoodstoreDTO;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "Fooddetails")
public class Foodstore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private int price;
    @Column(name = "category")
    private String category;


    public Foodstore(FoodstoreDTO foodstoreDTO) {

        this.name = foodstoreDTO.getName();
        this.price = foodstoreDTO.getPrice();
        this.category = foodstoreDTO.getCategory();

    }
//2 all args construct
    public Foodstore(int id, String name, int price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }
//1 genetrate default constructor
    public Foodstore(){

    }



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
