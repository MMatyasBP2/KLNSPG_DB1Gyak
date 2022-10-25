package com.zoo.api.Modules;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zoo.api.Models.Food;
import com.zoo.api.Repo.FoodRepo;

@Service
public class FoodModules {
    
    @Autowired
    private FoodRepo foodRepo;

    public Food storeFood(Food food)
    {
        return foodRepo.save(food);
    }

    public List<Food> getAllFoods()
    {
        return foodRepo.findAll();
    }

    public Food getFoodById(int id)
    {
        return foodRepo.findById(id).orElseThrow(() -> new RuntimeException("Food found for the id "+id));	
    }

    public Food updateFood(Food food, int id) {
        Food updatedFood = foodRepo.findById(id).get();
        updatedFood.setName(food.getName());
        updatedFood.setIs_delicious(food.getIs_delicious());
        return foodRepo.save(updatedFood);
	}
	
	public void deleteFood(int id) {
		Food deleteFood = foodRepo.findById(id).get();
        foodRepo.delete(deleteFood);
	}
}
