package com.zensar.firstspringbootapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.firstspringbootapp.entity.Product;
import com.zensar.firstspringbootapp.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepository repository;
	

	public List<Product> getAllProducts() {
		return repository.getAllProducts();
	}

	
	public Product getProduct (int productId) {
		return repository.getProduct(productId);
		
	}

	
	public void insertProduct (Product product) {
		repository.insertProduct(product);

	}

	
	public void deleteProduct(int productId) {
		repository.deleteProduct(productId);
	}

	
	public void updateProduct(int productId, Product product) {
		repository.updateProduct(productId, product);
	}

}
