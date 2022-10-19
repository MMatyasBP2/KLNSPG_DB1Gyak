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
import com.zoo.api.Models.Habitat;
import com.zoo.api.Modules.HabitatModules;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/habitates")
public class HabitatController {
   
    @Autowired
    private HabitatModules habModule;

    @PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Habitat create(@RequestBody Habitat habitat) {
		return habModule.storeHabitat(habitat);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Habitat> read() {
		return habModule.getAllHabitat();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Habitat read(@PathVariable int id) {
		return habModule.getHabitatById(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable int id) {
		habModule.deleteHabitat(id);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@PutMapping("/{id}")
	public Habitat update(@PathVariable int id, @RequestBody Habitat habitat) {
		return habModule.updateHabitat(habitat, id);
	}
}
