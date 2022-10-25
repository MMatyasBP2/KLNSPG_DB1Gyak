package com.zoo.api.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.zoo.api.Models.Food;

public interface FoodRepo extends JpaRepository<Food, Integer> {
    
}
