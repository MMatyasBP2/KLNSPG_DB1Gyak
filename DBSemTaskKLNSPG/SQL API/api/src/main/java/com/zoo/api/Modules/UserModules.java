package com.zoo.api.Modules;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zoo.api.Models.User;
import com.zoo.api.Repo.UserRepo;

@Service
public class UserModules {
    
    @Autowired
    private UserRepo userRepo;

    public User storeUser(User user)
    {
        return userRepo.save(user);
    }

    public List<User> getAllUsers()
    {
        return userRepo.findAll();
    }

    public User getUserById(int id)
    {
        return userRepo.findById(id).orElseThrow(() -> new RuntimeException("User found for the id "+id));	
    }

    public User updateUser(User user, int id) {
        User updatedUser = userRepo.findById(id).get();
        updatedUser.setUsername(user.getUsername());
        updatedUser.setPassword(user.getPassword());
        updatedUser.setSex(user.getSex());
        updatedUser.setFirst_name(user.getFirst_name());
        updatedUser.setLast_name(user.getLast_name());
        updatedUser.setPost_code(user.getPost_code());
        updatedUser.setCity(user.getCity());
        updatedUser.setStreet(user.getStreet());
        updatedUser.setNumber(user.getNumber());
        return userRepo.save(updatedUser);
	}
	
	public void deleteUser(int id) {
		User deleteUser = userRepo.findById(id).get();
        userRepo.delete(deleteUser);
	}
}
