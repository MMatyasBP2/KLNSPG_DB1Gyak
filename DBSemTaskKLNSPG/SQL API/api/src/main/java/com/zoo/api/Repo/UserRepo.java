package com.zoo.api.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.zoo.api.Models.User;

public interface UserRepo extends JpaRepository<User, Integer> {
    
}
