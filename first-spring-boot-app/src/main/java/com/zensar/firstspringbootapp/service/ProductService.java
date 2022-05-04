package com.zensar.firstspringbootapp.service;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.firstspringbootapp.entity.Product;

public interface ProductService {
	
	public List<Product> getAllProducts();

	
	public Product getProduct(int productId);

	
	public void insertProduct(Product product);

	
	public void deleteProduct(int productId);

	
	public void updateProduct(int productId, Product product);

}
