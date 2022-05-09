package com.zensar.firstspringbootapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.firstspringbootapp.entity.Product;
import com.zensar.firstspringbootapp.service.ProductService;

@RestController
@RequestMapping("/products/api/v1")
public class ProductController {
	// http://localhost:5000/pmanagement/products/api/v1

	@Autowired
	private ProductService service;
	

	public ProductController() {
		
	}

	// @RequestMapping(value = "/products")
	@GetMapping()
	public Iterable<Product> getAllProducts() {
		return service.getAllProducts();
	}

	@GetMapping("/{productId}")
	public Product getProduct(@PathVariable("productId")int  productId) {
		return service.getProduct(productId);
	}

	@PostMapping
	public void insertProduct(@RequestBody Product product) {
		service.insertProduct(product);

	}

	@DeleteMapping("/{productId}")
	public void deleteProduct(@PathVariable("productId") int productId) {
		service.deleteProduct(productId);
	}

	@PutMapping
	public void updateProduct(int productId, Product product) {
		service.updateProduct(productId, product);

	}

}
