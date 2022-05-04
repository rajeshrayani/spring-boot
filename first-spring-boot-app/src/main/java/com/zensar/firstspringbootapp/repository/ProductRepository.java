package com.zensar.firstspringbootapp.repository;

import java.util.List;

import com.zensar.firstspringbootapp.entity.Product;

public interface ProductRepository {
	
public List<Product> getAllProducts();

	
	public Product getProduct(int productId);

	
	public void insertProduct(Product product);

	
	public void deleteProduct(int productId);

	
	public void updateProduct(int productId, Product product);


}
