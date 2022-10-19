package com.zoo.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.zoo.api.Models.User;
import com.zoo.api.Modules.UserModules;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/users")
public class UserController {
   
    @Autowired
    private UserModules userModule;

    @PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public User create(@RequestBody User user) {
		return userModule.storeUser(user);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<User> read() {
		return userModule.getAllUsers();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public User read(@PathVariable int id) {
		return userModule.getUserById(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable int id) {
		userModule.deleteUser(id);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@PutMapping("/{id}")
	public User update(@PathVariable int id, @RequestBody User user) {
		return userModule.updateUser(user, id);
	}
}
