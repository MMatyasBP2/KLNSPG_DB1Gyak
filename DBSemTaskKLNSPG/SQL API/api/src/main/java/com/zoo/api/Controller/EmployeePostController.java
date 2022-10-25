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
import com.zoo.api.Models.Employee_post;
import com.zoo.api.Modules.EmployeePostModules;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/posts")
public class EmployeePostController {
   
    @Autowired
    private EmployeePostModules empPostModule;

    @PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Employee_post create(@RequestBody Employee_post emp) {
		return empPostModule.storeEmployeePost(emp);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Employee_post> read() {
		return empPostModule.getAllEmployeePosts();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Employee_post read(@PathVariable int id) {
		return empPostModule.getEmployeePostById(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable int id) {
		empPostModule.deleteEmployeePost(id);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@PutMapping("/{id}")
	public Employee_post update(@PathVariable int id, @RequestBody Employee_post empPost) {
		return empPostModule.updateEmployeePost(empPost, id);
	}
}
