package com.nisum.demoapp.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nisum.demoapp.entity.Employee;
import com.nisum.demoapp.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getEmployees() {
			
		return (List<Employee>) employeeRepository.findAll();
	}
	
	public void addEmployees(Employee e) {
		
		employeeRepository.save(e);
	}
	
	public Optional<Employee> getEmployee(Integer id) {
		
		return employeeRepository.findById(id);
	}
	
	public void deleteEmployees() {
		
		employeeRepository.deleteAll();
		
	}
}
