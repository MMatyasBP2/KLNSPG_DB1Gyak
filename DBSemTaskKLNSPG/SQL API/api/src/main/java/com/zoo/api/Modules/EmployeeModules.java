package com.zoo.api.Modules;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zoo.api.Models.Employee;
import com.zoo.api.Repo.EmployeeRepo;

@Service
public class EmployeeModules {
    
    @Autowired
    private EmployeeRepo empRepo;

    public Employee storeEmployee(Employee emp)
    {
        return empRepo.save(emp);
    }

    public List<Employee> getAllEmployees()
    {
        return empRepo.findAll();
    }

    public Employee getEmployeeById(int id)
    {
        return empRepo.findById(id).orElseThrow(() -> new RuntimeException("Employee found for the id "+id));	
    }

    public Employee updateEmployee(Employee emp, int id) {
        Employee updatedEmp = empRepo.findById(id).get();
		updatedEmp.setFirst_name(emp.getFirst_name());
        updatedEmp.setLast_name(emp.getLast_name());
        updatedEmp.setBirth_date(emp.getBirth_date());
        updatedEmp.setSex(emp.getSex());
        updatedEmp.setSite_id(emp.getSite_id());
        return empRepo.save(updatedEmp);
	}
	
	public void deleteEmployee(int id) {
		Employee deleteEmp = empRepo.findById(id).get();
        empRepo.delete(deleteEmp);
	}
}