package com.example.testing.junittest.controller;


import com.example.testing.junittest.dto.ProductDto;
import com.example.testing.junittest.entity.Product;
import com.example.testing.junittest.repo.ProductRepo;
import com.example.testing.junittest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/products")
public class ProuductController {
    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private ProductService productService;


    @PostMapping
    public String addProducts(@RequestBody Product productData){
        String response = productService.addProducts(productData);

        return response;
    }

    @GetMapping
    public List<Product> getAllEntities() {
        return productService.getAllEntities();
    }

    @GetMapping("/{id}")
    public Product getSingleEmployee(@PathVariable Long id){
        return productService.getSingleEmp(id);
    }

    @PutMapping("/{id}")
    public String updateEmployee(@PathVariable int id,@RequestBody Product productDto){
        return productService.updateEmp(id,productDto);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id){
        String response = productService.deleteEmp(id);
        return response;
    }







}
