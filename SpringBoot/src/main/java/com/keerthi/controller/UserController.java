package com.keerthi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.keerthi.model.User;
import com.keerthi.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	 private UserService userService;
	 
	    // Save operation
	    @PostMapping("/employee")
	    public User saveUser(  @Validated @RequestBody User user)
	    {
	        return userService.saveUser(user);
	    }
	 
	    // Read operation
	    @GetMapping("/employee")
	    public List<User> fetchUserList()
	    {
	        return userService.fetchUserList();
	    }
	 
	    // Update operation
	    @PutMapping("/employee/{id}")
	    public User
	    updateUser(@RequestBody User user,
	                     @PathVariable("id") Long Id)
	    {
	        return userService.updateUser(user, Id);
	    }
	 
	    // Delete operation
	    @DeleteMapping("/employee/{id}")
	    public String deleteById(@PathVariable("id")   Long Id)
	    {
	        userService.deleteById(Id);
	        return "Deleted Successfully";
	    }
	}

