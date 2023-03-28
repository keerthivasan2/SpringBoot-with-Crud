package com.keerthi.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerthi.model.User;
import com.keerthi.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
    private UserRepository userRepository;
	
    //Save operation
	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	//Read operation
	@Override
	public List<User> fetchUserList() {
		return (List<User>)userRepository.findAll();
	}

    // Update operation
    @Override
    public User
    updateUser(User user,Long Id)
    {
        User uesDB = userRepository.findById(Id).get();
 
        if (Objects.nonNull(user.getName()) && !"".equalsIgnoreCase(user.getName())) 
        {
            uesDB.setName(user.getName());
        }
 
 
        return userRepository.save(uesDB);
    }
 
    // Delete operation
    @Override
    public void deleteById(Long Id)
    {
        userRepository.deleteById(Id);
    }
}

	
