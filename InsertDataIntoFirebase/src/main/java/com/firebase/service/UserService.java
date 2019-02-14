package com.firebase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.firebase.model.UserInfo;
import com.firebase.repository.UserRepository;

public class UserService {

	@Autowired
	private UserRepository userRepository;

	//saving data into firebase database
	public void save() {
		UserInfo user1 = new UserInfo();
		user1.setId("1");
		user1.setName("Ramya");
		user1.setRole("Developer");
		user1 = userRepository.set(user1);

		UserInfo user2 = new UserInfo();
		user2.setId("2");
		user2.setName("Mustaq");
		user2.setRole("Server End");
		user2 = userRepository.set(user2);
		
		UserInfo user3 = new UserInfo();
		//user3.setId("3");
		user3.setName("SaiKrishna");
		user3.setRole("BackEnd");
		user3 = userRepository.set(user3);
		System.err.println("Saved!");

		//Fetch all the members in the list
		List<UserInfo> users = userRepository.findAll();
		System.out.println(users.size());
		for(UserInfo userInfo:users) {
			System.out.println("Finding All : " +userInfo.getId());
			System.out.println("Finding All : " +userInfo.getName());
			
		}

		//Fetch single user 
		/*List<UserInfo> userNames = userRepository.find(Filter.FilterBuilder.builder().orderBy("Name").build());
		System.out.println("userName : "+userNames.size());
		*/
		
		//Get single user based on the condition
		UserInfo user = userRepository.get(user2.getId());
		System.out.println("get user :" +user.getName());
		
	}


}
