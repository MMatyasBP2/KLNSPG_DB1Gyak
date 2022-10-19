package com.zoo.api.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.zoo.api.Models.Habitat;

public interface HabitatRepo extends JpaRepository<Habitat, Integer> {
    
}
