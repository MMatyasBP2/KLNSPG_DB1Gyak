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
import com.zoo.api.Models.FoodCompany;
import com.zoo.api.Modules.FoodCompanyModules;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/companies")
public class FoodCompanyController {
   
    @Autowired
    private FoodCompanyModules foodCompanyModule;

    @PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public FoodCompany create(@RequestBody FoodCompany foodCompany) {
		return foodCompanyModule.storeFoodCompany(foodCompany);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<FoodCompany> read() {
		return foodCompanyModule.getAllFoodCompanies();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public FoodCompany read(@PathVariable int id) {
		return foodCompanyModule.getFoodCompanyById(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable int id) {
		foodCompanyModule.deleteFoodCompany(id);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@PutMapping("/{id}")
	public FoodCompany update(@PathVariable int id, @RequestBody FoodCompany foodCompany) {
		return foodCompanyModule.updateFoodCompany(foodCompany, id);
	}
}
