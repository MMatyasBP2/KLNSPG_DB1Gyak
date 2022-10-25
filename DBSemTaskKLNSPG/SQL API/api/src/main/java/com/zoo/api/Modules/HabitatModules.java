package com.zoo.api.Modules;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zoo.api.Models.Habitat;
import com.zoo.api.Repo.HabitatRepo;

@Service
public class HabitatModules {
    
    @Autowired
    private HabitatRepo habRepository;

    public Habitat storeHabitat(Habitat hab)
    {
        return habRepository.save(hab);
    }

    public List<Habitat> getAllHabitat()
    {
        return habRepository.findAll();
    }

    public Habitat getHabitatById(int id)
    {
        return habRepository.findById(id).orElseThrow(() -> new RuntimeException("Habitat found for the id "+id));	
    }

    public Habitat updateHabitat(Habitat hab, int id) {
		Habitat updatedHabiat = habRepository.findById(id).get();
        updatedHabiat.setName(hab.getName());
        updatedHabiat.setLocation(hab.getLocation());
        updatedHabiat.setDescription(hab.getDescription());
        updatedHabiat.setCapacity(hab.getCapacity());
        updatedHabiat.setSite_id(hab.getSite_id());
        return habRepository.save(updatedHabiat);
	}
	
	public void deleteHabitat(int id) {
		Habitat deleteHab = habRepository.findById(id).get();
        habRepository.delete(deleteHab);
	}
}
