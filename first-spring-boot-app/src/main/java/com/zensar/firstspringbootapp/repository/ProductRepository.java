package com.zensar.firstspringbootapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.zensar.firstspringbootapp.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
	
	


}
