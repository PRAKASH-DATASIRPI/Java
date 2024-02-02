package com.example.product.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "products")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     private String name;
     private Double price;
     private String description;



//    public Product(Long id, String name, Double price, String description) {
//        this.id = id;
//        this.name = name;
//        this.price = price;
//        this.description = description;
//    }
}
