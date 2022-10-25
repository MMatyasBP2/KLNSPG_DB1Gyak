package com.zoo.api.Modules;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zoo.api.Models.Eat;
import com.zoo.api.Repo.EatRepo;

@Service
public class EatModules {
    
    @Autowired
    private EatRepo eatRepo;

    public Eat storeEat(Eat eat)
    {
        return eatRepo.save(eat);
    }

    public List<Eat> getAllEats()
    {
        return eatRepo.findAll();
    }

    public Eat getEatById(int id)
    {
        return eatRepo.findById(id).orElseThrow(() -> new RuntimeException("Eat found for the id "+id));	
    }

    public Eat updateEat(Eat eat, int id) {
        Eat updatedEat = eatRepo.findById(id).get();
        updatedEat.setFood_id(eat.getFood_id());
        updatedEat.setFeeding_time(eat.getFeeding_time());
        return eatRepo.save(updatedEat);
	}
	
	public void deleteEat(int id) {
		Eat deleteEat = eatRepo.findById(id).get();
        eatRepo.delete(deleteEat);
	}
}
