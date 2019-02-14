package com.firebase.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.firebase.service.UserService;
import com.github.fabiomaffioletti.firebase.EnableFirebaseRepositories;

@SpringBootApplication
@EnableFirebaseRepositories 
public class InsertDataIntoFirebaseApplication {

	public static void main(String[] args) {
		//UserService userService = new UserService();
		final ConfigurableApplicationContext context = SpringApplication.run(InsertDataIntoFirebaseApplication.class, args);
		UserService userService = (UserService) context.getBean("userService");
		userService.save();
	}
}

