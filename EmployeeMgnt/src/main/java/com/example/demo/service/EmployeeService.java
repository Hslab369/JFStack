package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	Employee addData(Employee emp);

	List<Employee> GetData();

	Employee updateData(Employee emp);

	void delete(int id);
}
