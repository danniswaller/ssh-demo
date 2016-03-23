package com.github.danniswaller.sshdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.danniswaller.sshdemo.domain.User;

public interface UserDao extends JpaRepository<User, Long>{
	
	User findByUsername(String name);

}
