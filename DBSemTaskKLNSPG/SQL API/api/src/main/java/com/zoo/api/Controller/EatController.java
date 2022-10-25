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
import com.zoo.api.Models.Eat;
import com.zoo.api.Modules.EatModules;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/eats")
public class EatController {
   
    @Autowired
    private EatModules eatModule;

    @PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Eat create(@RequestBody Eat eat) {
		return eatModule.storeEat(eat);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Eat> read() {
		return eatModule.getAllEats();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Eat read(@PathVariable int id) {
		return eatModule.getEatById(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable int id) {
		eatModule.deleteEat(id);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@PutMapping("/{id}")
	public Eat update(@PathVariable int id, @RequestBody Eat eat) {
		return eatModule.updateEat(eat, id);
	}
}
