package com.nis.demoapp.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nis.demoapp.entity.Employee;
import com.nis.demoapp.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/get")
	public List<Employee> getEmployees() {
		
		return employeeService.getEmployees();
	}
	
	@GetMapping("/getEmployee/{id}")
	public Optional<Employee> addEmployee(@PathVariable("id") Integer id) {
		
		return employeeService.getEmployee(id);
	}
	
	@PostMapping({"/add", "application/json"})
	public ResponseEntity<Employee> addEmployees(@RequestBody Employee e) {
		employeeService.addEmployees(e);
		return new ResponseEntity<Employee>(e, HttpStatus.OK);
	}
	
	@GetMapping("/deleteAll")
	public String deleteEmployees() {
		
		employeeService.deleteEmployees();
		return "successfully deleted reords";
	}
}
