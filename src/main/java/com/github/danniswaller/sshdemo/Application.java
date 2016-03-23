package com.github.danniswaller.sshdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.danniswaller.sshdemo.dao.UserDao;
import com.github.danniswaller.sshdemo.domain.User;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	};
	
	@Bean
	public CommandLineRunner demo(final UserDao userDao) {
		
		return new CommandLineRunner(){

			public void run(String... arg0) throws Exception {
				userDao.save(new User("èà¬î"));
				userDao.save(new User("ÕıàÚÌµ"));
				
			}
			
		};
		
	}

}
