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

import com.example.demo.entity.Dept;
import com.example.demo.serviceimp.DeptServiceImp;

@RestController
@RequestMapping("/Home")
public class DeptController {
	DeptServiceImp deptImp;

	public DeptController(DeptServiceImp deptImp) {
		super();
		this.deptImp = deptImp;
	}

	@GetMapping("/displayDept")
	public ResponseEntity<List<Dept>> getDeptEntity() {
		List<Dept> l1 = deptImp.getDepts();
		return new ResponseEntity<>(l1, HttpStatus.OK);
	}

	@PostMapping("/saveDept")
	public ResponseEntity<Dept> addDeptEntity(@RequestBody Dept dept) {
		// TODO: process POST request
		Dept d1 = deptImp.addDept(dept);
		return new ResponseEntity<>(d1, HttpStatus.OK);
	}

	@PutMapping("/Dept{id}")
	public ResponseEntity<Dept> updateDeptEntity(@PathVariable("id") int id, @RequestBody Dept dept) {
		dept.setId(id);
		Dept d1 = deptImp.updateDept(dept);
		return new ResponseEntity<>(d1, HttpStatus.OK);
	}

	@DeleteMapping("/Dept{id}")
	public ResponseEntity<String> deleteDeptEntity(@PathVariable("id") int id) {
		deptImp.deleteDept(id);
		return new ResponseEntity<>("Data Deleted Sucessfully", HttpStatus.OK);
	}
}