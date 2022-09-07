package com.controller.flightuser.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controller.flightuser.model.User;
import com.controller.flightuser.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;




	public List<User> getAllUsers()
	{
	List<User> users=new ArrayList<>();
	userRepository.findAll()
	.forEach(users::add);
	return users;
	}



	public void add(User user) {
	userRepository.save(user);




	}




	public void Update(User user) {
	userRepository.save(user);



	}
	public void delete(String userid) {
	userRepository.deleteById(userid);



	}



	public Optional<User> getUser(String userid) {
		// TODO Auto-generated method stub
		return null;
	}






	}