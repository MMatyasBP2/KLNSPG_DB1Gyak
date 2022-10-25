package com.zoo.api.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.zoo.api.Models.Employee_post;

public interface Employee_postRepo extends JpaRepository<Employee_post, Integer> {
    
}
