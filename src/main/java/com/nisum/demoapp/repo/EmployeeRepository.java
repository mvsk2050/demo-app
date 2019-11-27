package com.nisum.demoapp.repo;

import org.springframework.data.repository.CrudRepository;

import com.nisum.demoapp.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
