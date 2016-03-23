package com.github.danniswaller.sshdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.danniswaller.sshdemo.dao.UserDao;
import com.github.danniswaller.sshdemo.domain.User;




@Component
public class UserService {


	@Autowired
	private UserDao userDao;

	
	public List<User> findAll(){
		return userDao.findAll();
	}

	
	
	
	

}
