package com.zensar.firstspringbootapp.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.firstspringbootapp.entity.Product;

@RestController
@RequestMapping("/products/api/v1")
public class ProductController {

	List<Product> products = new ArrayList<>();

	public ProductController() {
		products.add(new Product(1, "Car", 500));
		products.add(new Product(2, "Cycle", 600));
		products.add(new Product(3, "Bike", 700));
	}

	// @RequestMapping(value = "/products")
	@GetMapping()
	public List<Product> getAllProducts() {
		return products;
	}

	@GetMapping("/{productId}")
	public Product getProduct(@PathVariable("productId") int productId) {
		for (Product product : products) {
			if (product.getProductId() == productId) {
				return product;
			}

		}
		return null;
	}

	@PostMapping
	public void insertProduct(@RequestBody Product product) {
		products.add(product);

	}

	@DeleteMapping("/{productId}")
	public void deleteProduct(@PathVariable("productId") int productId) {
		for (int i = 0; i < products.size(); i++) {
			Product product = products.get(i);
			if (product.getProductId() == productId) {
				products.remove(product);

			}

		}
	}

	@PutMapping
	public void updateProduct(int productId, Product product) {
		System.out.println("public void updateProduct(int productId, Product product)");

	}

}
