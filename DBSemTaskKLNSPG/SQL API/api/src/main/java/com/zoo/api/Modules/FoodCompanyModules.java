package com.zoo.api.Modules;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zoo.api.Models.FoodCompany;
import com.zoo.api.Repo.FoodCompanyRepo;

@Service
public class FoodCompanyModules {
    
    @Autowired
    private FoodCompanyRepo foodCompanyRepo;

    public FoodCompany storeFoodCompany(FoodCompany foodCompany)
    {
        return foodCompanyRepo.save(foodCompany);
    }

    public List<FoodCompany> getAllFoodCompanies()
    {
        return foodCompanyRepo.findAll();
    }

    public FoodCompany getFoodCompanyById(int id)
    {
        return foodCompanyRepo.findById(id).orElseThrow(() -> new RuntimeException("Food company found for the id "+id));	
    }

    public FoodCompany updateFoodCompany(FoodCompany foodCompany, int id) {
        FoodCompany updatedFoodCompany = foodCompanyRepo.findById(id).get();
        updatedFoodCompany.setCompany(foodCompany.getCompany());
        updatedFoodCompany.setFood_id(foodCompany.getFood_id());
        return foodCompanyRepo.save(updatedFoodCompany);
	}
	
	public void deleteFoodCompany(int id) {
		FoodCompany deleteFoodCompany = foodCompanyRepo.findById(id).get();
        foodCompanyRepo.delete(deleteFoodCompany);
	}
}
