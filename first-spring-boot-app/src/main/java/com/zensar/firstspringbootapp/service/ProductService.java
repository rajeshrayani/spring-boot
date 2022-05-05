package com.zensar.firstspringbootapp.service;

import com.zensar.firstspringbootapp.entity.Product;

public interface ProductService {
	
	public Iterable<Product> getAllProducts();

	
	public Product getProduct(int productId);

	
	public Product insertProduct(Product product);

	
	public void deleteProduct(int productId);

	
	public void updateProduct(int productId, Product product);

}
