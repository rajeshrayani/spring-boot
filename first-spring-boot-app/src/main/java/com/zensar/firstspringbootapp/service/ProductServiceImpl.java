package com.zensar.firstspringbootapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.firstspringbootapp.entity.Product;
import com.zensar.firstspringbootapp.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepository repository;
	

	public Iterable<Product> getAllProducts() {
		return repository.findAll();
	}

	
	public Product getProduct (int productId) {
		return repository.findById(productId).get();
		
	}

	
	public Product insertProduct (Product product) {
		return repository.save(product);

	}

	
	public void deleteProduct(int productId) {
		repository.deleteById(productId);
	}

	
	public void updateProduct(int productId, Product product) {
		repository.save(product);
	}

}
