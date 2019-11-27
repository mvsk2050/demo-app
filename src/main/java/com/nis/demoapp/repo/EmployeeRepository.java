package com.nis.demoapp.repo;

import org.springframework.data.repository.CrudRepository;

import com.nis.demoapp.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
