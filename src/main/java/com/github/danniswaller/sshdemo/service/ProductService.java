package com.github.danniswaller.sshdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.danniswaller.sshdemo.dao.ProductDao;
import com.github.danniswaller.sshdemo.domain.Product;

@Component
public class ProductService {
	@Autowired
	private ProductDao dao;

	public ProductService() {

	}

	public void save(Product p) {
		dao.save(p);
	}

	public Product findById(Long id) {
		Product p = dao.findOne(id);
		return p;
	}

	public List<Product> findAll() {
		List<Product> products = dao.findAll();
		return products;
	}

	public Product findByName(String name) {
		return dao.findByName(name);
	}
}
