package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.serviceimp.EmployeeServiceImp;

@RestController
@RequestMapping("/Home")
public class EmployeeController {
	EmployeeServiceImp empI;

	public EmployeeController(EmployeeServiceImp empI) {
		super();
		this.empI = empI;
	}

	@GetMapping("/displayEmp")
	public ResponseEntity<List<Employee>> displayEmpEntity() {
		List<Employee> l1 = empI.getEmployees();
		return new ResponseEntity<>(l1, HttpStatus.OK);
	}

	@PostMapping("/saveEmp")
	public ResponseEntity<Employee> addEmpEntity(@RequestBody Employee emp) {
		// TODO: process POST request
		Employee e1 = empI.addEmployee(emp);
		return new ResponseEntity<>(e1, HttpStatus.OK);
	}

	@PutMapping("/Emp{id}")
	public ResponseEntity<Employee> updateEmpEntity(@PathVariable("id") int id, @RequestBody Employee emp) {
		emp.seteId(id);
		Employee e1 = empI.updateEmployee(emp);
		return new ResponseEntity<>(e1, HttpStatus.OK);
	}

	@DeleteMapping("/Emp{id}")
	public ResponseEntity<String> deleteEmpEntity(@PathVariable("id") int id) {
		empI.deleteEmployee(id);
		return new ResponseEntity<>("Data Deleted Sucessfully", HttpStatus.OK);
	}
}






