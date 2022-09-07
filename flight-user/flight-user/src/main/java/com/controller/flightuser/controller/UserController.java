package com.controller.flightuser.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.controller.flightuser.model.User;
import com.controller.flightuser.services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/user/{userid}")
	public Optional<User> getUser(@PathVariable("userid") String userid)
	{
		return userService.getUser(userid);
	}
	@RequestMapping(method=RequestMethod.GET, value="/user")
	public List<User> getAllUsers()
	{
	return userService.getAllUsers();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/user")
	public void adduser(@RequestBody User user)
	{
	userService.add(user);
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/user/update/{userid}")
	public User updateUser(@RequestBody User user, @PathVariable("userid") String userid)
	{   user.setUserid(userid);
		 userService.Update(user);
		 return user;
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="user/{userid}")
    public String deleteuserid(@PathVariable String userid) {
        userService.delete(userid);
        return userid;
    }
	
}
