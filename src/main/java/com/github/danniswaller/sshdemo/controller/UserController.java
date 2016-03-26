package com.github.danniswaller.sshdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.danniswaller.sshdemo.domain.User;
import com.github.danniswaller.sshdemo.service.UserService;

/**
 * TODO: DOCUMENT ME!
 *
 * @author <a href="mailto:betarvel@outlook.com">cafebabetarvel</a>
 * @version 03/24/2016 18:49
 */
@Controller
public class UserController {
	// ~ Instance fields
	// --------------------------------------------------------------------------------------------------

	@Autowired
	private UserService userService;

	// ~ Methods
	// ----------------------------------------------------------------------------------------------------------

	@RequestMapping("/users/list")
	@ResponseBody
	public Page<User> list(){
		 Page<User> userPage = userService.findPage("tom", new PageRequest(0, 10));
		 return userPage;
	}
	/**
	 * list.
	 *
	 * @return Map
	 */
	@RequestMapping("/users/save")
	@ResponseBody
	public Boolean save() {
		User user = new User();
		user.setUsername("test");
		userService.save(user);
		
		return true;
	}
	
	@RequestMapping("/users/update")
	@ResponseBody
	public Boolean update() {
		User user = userService.findById(1L);
		userService.update(user);
		return true;
	}
	
	
	@RequestMapping("/users/delete")
	@ResponseBody
	public Boolean delete() {
		Boolean success = true;
		Long userId = 1L;
		try{
			userService.delete(userId);
		}catch(Exception e){
			success = false;
		}
		return success;
	}
	
	
	
	
}
