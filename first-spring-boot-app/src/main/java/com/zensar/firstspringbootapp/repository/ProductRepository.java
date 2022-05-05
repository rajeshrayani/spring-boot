package com.zensar.firstspringbootapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.zensar.firstspringbootapp.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
	
	


}
