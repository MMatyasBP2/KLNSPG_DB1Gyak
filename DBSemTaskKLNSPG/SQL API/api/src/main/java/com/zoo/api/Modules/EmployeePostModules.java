package com.zoo.api.Modules;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zoo.api.Models.Employee_post;
import com.zoo.api.Repo.Employee_postRepo;

@Service
public class EmployeePostModules {
    
    @Autowired
    private Employee_postRepo empPostRepo;

    public Employee_post storeEmployeePost(Employee_post empPost)
    {
        return empPostRepo.save(empPost);
    }

    public List<Employee_post> getAllEmployeePosts()
    {
        return empPostRepo.findAll();
    }

    public Employee_post getEmployeePostById(int id)
    {
        return empPostRepo.findById(id).orElseThrow(() -> new RuntimeException("Employee post found for the id "+id));	
    }

    public Employee_post updateEmployeePost(Employee_post empPost, int id) {
        Employee_post updatedEmpPost = empPostRepo.findById(id).get();
        updatedEmpPost.setPost(empPost.getPost());
        updatedEmpPost.setEmp_id(empPost.getEmp_id());
        return empPostRepo.save(updatedEmpPost);
	}
	
	public void deleteEmployeePost(int id) {
		Employee_post deleteEmpPost = empPostRepo.findById(id).get();
        empPostRepo.delete(deleteEmpPost);
	}
}
