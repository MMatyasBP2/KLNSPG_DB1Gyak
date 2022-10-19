package com.zoo.api.Modules;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zoo.api.Models.Animal;
import com.zoo.api.Repo.AnimalRepo;

@Service
public class AnimalModules {
    
    @Autowired
    private AnimalRepo animalRepo;

    public Animal storeAnimal(Animal animal)
    {
        return animalRepo.save(animal);
    }

    public List<Animal> getAllAnimals()
    {
        return animalRepo.findAll();
    }

    public Animal getAnimalById(int id)
    {
        return animalRepo.findById(id).orElseThrow(() -> new RuntimeException("Animal found for the id "+id));	
    }

    public Animal updateAnimal(Animal animal, int id) {
        Animal updatedAnimal = animalRepo.findById(id).get();
        updatedAnimal.setName(animal.getName());
        updatedAnimal.setRacial(animal.getRacial());
        updatedAnimal.setDescription(animal.getDescription());
        updatedAnimal.setHabitat_id(animal.getHabitat_id());
        updatedAnimal.setUser_id(animal.getUser_id());
        return animalRepo.save(updatedAnimal);
	}
	
	public void deleteAnimal(int id) {
		Animal deleteAnimal = animalRepo.findById(id).get();
        animalRepo.delete(deleteAnimal);
	}
}
