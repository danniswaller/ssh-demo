package com.github.danniswaller.sshdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.danniswaller.sshdemo.dao.ProductDirDao;
import com.github.danniswaller.sshdemo.domain.ProductDir;

@Component
public class ProductDirService {
	@Autowired
	private ProductDirDao productDirDao;

	public void save(ProductDir productDir) {
		productDirDao.save(productDir);
	}

	public ProductDir getOne(Long id) {
		return productDirDao.findOne(id);
	}

	public List<ProductDir> findAll() {
		return productDirDao.findAll();
	}

	public void delete(Long id) {
		productDirDao.delete(id);
	}

	public ProductDir findByName(String name) {
		return productDirDao.findByName(name);

	}
}
