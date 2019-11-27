package com.nisum.demoapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.nisum.demoapp.entity.Employee;
import com.nisum.demoapp.repo.EmployeeRepository;
import com.nisum.demoapp.service.EmployeeService;

public class TestEmployeeService {

	@InjectMocks
	EmployeeService employeeService;

	@Mock
	EmployeeRepository employeeRepository;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);

	}

	@Test
	public void testGetEmployees() {

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "a"));
		empList.add(new Employee(2, "b"));
		empList.add(new Employee(3, "c"));
		when(employeeService.getEmployees()).thenReturn(empList);
		assertEquals(3, empList.size());

	}

	@Test
	public void testGetEmployee() {

		Employee e = new Employee(1, "a");
		when(employeeService.getEmployee(1)).thenReturn(Optional.of(e));
		assertEquals(1, e.getId());
	}
}
