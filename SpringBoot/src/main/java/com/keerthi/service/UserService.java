package com.keerthi.service;

import java.util.List;

import com.keerthi.model.User;

public interface UserService {
	User saveUser(User user);
	 
   
    List<User> fetchUserList();
 
    User updateUser(User user, Long Id);
 
  
    void deleteById(Long Id);

}
