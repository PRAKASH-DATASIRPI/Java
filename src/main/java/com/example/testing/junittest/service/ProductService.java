package com.example.testing.junittest.service;

import com.example.testing.junittest.dto.ProductDto;
import com.example.testing.junittest.entity.Product;
import com.example.testing.junittest.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public String addProducts(Product productData) {

        Product savedProduct =productRepo.save(productData);
        return savedProduct.toString();
    }


    public List<Product> getAllEntities() {
        return productRepo.findAll();
    }

    public Product getSingleEmp(Long id) {
        return productRepo.findById(id).orElse(null);
    }

    public String updateEmp(long id, Product productDto) {

        if(productRepo.existsById(id)){
            Product existingProduct=productRepo.getReferenceById(id);
            existingProduct.setName(productDto.getName()!= null ? productDto.getName():existingProduct.getName());
            existingProduct.setPrice(productDto.getPrice() != 0 ? productDto.getPrice() : existingProduct.getPrice());
            existingProduct.setDescription(productDto.getDescription() != null ? productDto.getDescription() : existingProduct.getDescription());
            productRepo.save(existingProduct);


        }
        else {
            System.out.println("product does not exist");
        }



        return null;
    }

    public String deleteEmp(Long id) {

        try {
            productRepo.deleteById(id);
            return "Employee deleted successfully.";
        } catch (EmptyResultDataAccessException e) {
            // Handle the case where the employee with the given ID is not found
            return "Employee not found with ID: " + id;
        } catch (Exception e) {
            // Handle other exceptions (e.g., database connection issues)

            return "Error deleting employee with ID: " + e;
        }

    }
}
