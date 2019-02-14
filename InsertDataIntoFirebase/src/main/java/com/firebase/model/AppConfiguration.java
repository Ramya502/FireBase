package com.firebase.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.firebase.repository.UserRepository;
import com.firebase.service.UserService;

@Configuration
public class AppConfiguration {
	@Bean
	public UserService userService() {
		return new UserService();
	}
	
	@Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }
	@Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
