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
import com.zoo.api.Models.Employee;
import com.zoo.api.Modules.EmployeeModules;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
   
    @Autowired
    private EmployeeModules empModule;

    @PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Employee create(@RequestBody Employee emp) {
		return empModule.storeEmployee(emp);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Employee> read() {
		return empModule.getAllEmployees();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Employee read(@PathVariable int id) {
		return empModule.getEmployeeById(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable int id) {
		empModule.deleteEmployee(id);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@PutMapping("/{id}")
	public Employee update(@PathVariable int id, @RequestBody Employee emp) {
		return empModule.updateEmployee(emp, id);
	}
}
