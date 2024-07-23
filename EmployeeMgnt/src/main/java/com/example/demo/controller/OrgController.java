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

import com.example.demo.entity.Org;
import com.example.demo.serviceimp.OrgServiceImp;

@RestController
@RequestMapping("/Home")
public class OrgController {
	OrgServiceImp oImp;


	public OrgController(OrgServiceImp oImp) {
		super();
		this.oImp = oImp;
	}

	@GetMapping("/displayOrg")
	public ResponseEntity<List<Org>> displayOrgEntity() {
		List<Org> l1 = oImp.getOrgs();
		return new ResponseEntity<>(l1, HttpStatus.OK);
	}

	@PostMapping("/saveOrg")
	public ResponseEntity<Org> addOrgEntity(@RequestBody Org org) {
		// TODO: process POST request
		Org o1 = oImp.addOrg(org);
		return new ResponseEntity<>(o1, HttpStatus.OK);
	}

	@PutMapping("/Org{id}")
	public ResponseEntity<Org> updateOrgEntity(@PathVariable("id") int id, @RequestBody Org org) {
		org.setRegno(id);
		Org o1 = oImp.updateOrg(org);
		return new ResponseEntity<>(o1, HttpStatus.OK);
	}

	@DeleteMapping("/Org{id}")
	public ResponseEntity<String> deleteOrgEntity(@PathVariable("id") int id) {
		oImp.deleteOrg(id);
		return new ResponseEntity<>("Data Deleted Sucessfully", HttpStatus.OK);
	}
}