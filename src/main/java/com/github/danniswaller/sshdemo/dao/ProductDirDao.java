package com.github.danniswaller.sshdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.danniswaller.sshdemo.domain.ProductDir;

public interface ProductDirDao extends JpaRepository<ProductDir, Long> {
            
            ProductDir findByName(String name);
            
            
}
