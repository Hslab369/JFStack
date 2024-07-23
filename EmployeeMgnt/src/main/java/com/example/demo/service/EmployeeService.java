package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	Employee addEmployee(Employee emp);

	List<Employee> getEmployees();

	Employee updateEmployee(Employee emp);

	void deleteEmployee(int id);
}
