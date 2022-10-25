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
import com.zoo.api.Models.Food;
import com.zoo.api.Modules.FoodModules;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/foods")
public class FoodController {
   
    @Autowired
    private FoodModules foodModule;

    @PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Food create(@RequestBody Food food) {
		return foodModule.storeFood(food);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Food> read() {
		return foodModule.getAllFoods();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Food read(@PathVariable int id) {
		return foodModule.getFoodById(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable int id) {
		foodModule.deleteFood(id);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@PutMapping("/{id}")
	public Food update(@PathVariable int id, @RequestBody Food food) {
		return foodModule.updateFood(food, id);
	}
}
