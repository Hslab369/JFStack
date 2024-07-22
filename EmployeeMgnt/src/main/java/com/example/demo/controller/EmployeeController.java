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

	@GetMapping("/data")
	public ResponseEntity<List<Employee>> data() {
		List<Employee> l1 = empI.GetData();
		return new ResponseEntity<>(l1, HttpStatus.OK);
	}

	@PostMapping("/save")
	public ResponseEntity<Employee> dataadd(@RequestBody Employee emp) {
		// TODO: process POST request
		Employee e1 = empI.addData(emp);
		return new ResponseEntity<>(e1, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Employee> updEntity(@PathVariable("id") int id, @RequestBody Employee emp) {
		emp.setId(id);
		Employee e1 = empI.updateData(emp);
		return new ResponseEntity<>(e1, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> detEntity(@PathVariable("id") int id) {
		empI.delete(id);
		return new ResponseEntity<>("Data Deleted Sucessfully", HttpStatus.OK);
	}
}