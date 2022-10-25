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
import com.zoo.api.Models.Animal;
import com.zoo.api.Modules.AnimalModules;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/animals")
public class AnimalController {
   
    @Autowired
    private AnimalModules animalModule;

    @PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Animal create(@RequestBody Animal animal) {
		return animalModule.storeAnimal(animal);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Animal> read() {
		return animalModule.getAllAnimals();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Animal read(@PathVariable int id) {
		return animalModule.getAnimalById(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable int id) {
		animalModule.deleteAnimal(id);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@PutMapping("/{id}")
	public Animal update(@PathVariable int id, @RequestBody Animal animal) {
		return animalModule.updateAnimal(animal, id);
	}
}
