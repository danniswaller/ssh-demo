package com.github.danniswaller.sshdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.danniswaller.sshdemo.domain.Product;

public interface ProductDao extends JpaRepository<Product, Long> {
	

	Product findByName(String name);


}
