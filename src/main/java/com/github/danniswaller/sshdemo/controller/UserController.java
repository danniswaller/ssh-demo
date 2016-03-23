package com.github.danniswaller.sshdemo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.danniswaller.sshdemo.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	
	@RequestMapping("/users/list")
	@ResponseBody
	public Map<String,Object> list(){

		return new HashMap<String,Object>(){{
			put("users", userService.findAll());
		}};
	}
}
