package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Org {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int regno;
	private String name;
	private String location;

	@OneToMany
	private List<Employee> empList;
	
	@OneToMany
	private List<Dept> deptList;

	public Org() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Org(int regno, String name, String location, List<Employee> empList, List<Dept> deptList) {
		super();
		this.regno = regno;
		this.name = name;
		this.location = location;
		this.empList = empList;
		this.deptList = deptList;
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	public List<Dept> getDeptList() {
		return deptList;
	}

	public void setDeptList(List<Dept> deptList) {
		this.deptList = deptList;
	}

	@Override
	public String toString() {
		return "Org [regno=" + regno + ", name=" + name + ", location=" + location + ", empList=" + empList
				+ ", deptList=" + deptList + "]";
	}

}
