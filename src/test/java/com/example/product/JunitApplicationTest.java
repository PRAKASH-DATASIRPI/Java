package com.example.product;

import com.example.product.entity.Product;
import com.example.product.repo.ProductRepo;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JunitApplicationTest {

	@Autowired
	ProductRepo productRepo;

	@Test
	void contextLoads() {
		Product product = new Product();
		product.setName("samsung");
		product.setPrice(10000.00);
		product.setDescription("fair");

		Product savedProduct = productRepo.save(product);

		assertNotNull(savedProduct.getId());
	}

	@Test
	@Order(2)
	public void getProductByIdTest() {

		Long productId = 1L;

		Product retrievedProduct = productRepo.findById(productId).orElse(null);

		// Ensure that the product with the specified ID is retrieved
		assertNotNull(retrievedProduct);
		assertTrue(productId.equals(retrievedProduct.getId()));
	}

	@Test
	public void testAll() {
		List<Product> products = productRepo.findAll();
		assertThat(products)
				.isNotNull()
				.isNotEmpty();
	}

	@Test
	public void updateProductTest() {
		Long productId = 1L;
		Product retrievedProduct = productRepo.findById(productId).orElse(null);
		assertNotNull(retrievedProduct);
		retrievedProduct.setPrice(12000.00);
		retrievedProduct.setDescription("Excellent");
		Product updatedProduct = productRepo.save(retrievedProduct);
		Product reRetrievedProduct = productRepo.findById(productId).orElse(null);
		assertNotNull(reRetrievedProduct);
		assertEquals(12000.00, reRetrievedProduct.getPrice());
		assertEquals("Excellent", reRetrievedProduct.getDescription());
	}


	@Test
	public void deleteProductTest() {
		Long productId = 1L;
		Product retrievedProduct = productRepo.findById(productId).orElse(null);
		assertNotNull(retrievedProduct);
		productRepo.delete(retrievedProduct);
		Product deletedProduct = productRepo.findById(productId).orElse(null);

		assertNull(deletedProduct);
	}



}
