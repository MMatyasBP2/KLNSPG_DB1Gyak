package com.zoo.api.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.zoo.api.Models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    
}
