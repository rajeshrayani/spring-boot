package com.zensar.firstspringbootapp.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
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
import com.zensar.firstspringbootapp.service.ProductService;

@RestController
@RequestMapping("/products/api/v1")
public class ProductController {

	@Autowired
	private ProductService service;
	

	public ProductController() {
		
	}

	// @RequestMapping(value = "/products")
	@GetMapping()
	public List<Product> getAllProducts() {
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
