package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eId;
	private String firstName;
	private String LastName;
	private String email;
	private int mob;
	private String panCard;
	private long AadharNo;
	private String city;
	float salary;

	@OneToOne
	private Dept dept;

	@OneToOne
	private Org org;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eId, String firstName, String lastName, String email, int mob, String panCard, int aadharNo,
			String city, float salary, Dept dept, Org org) {
		super();
		this.eId = eId;
		this.firstName = firstName;
		LastName = lastName;
		this.email = email;
		this.mob = mob;
		this.panCard = panCard;
		AadharNo = aadharNo;
		this.city = city;
		this.salary = salary;
		this.dept = dept;
		this.org = org;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMob() {
		return mob;
	}

	public void setMob(int mob) {
		this.mob = mob;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public long getAadharNo() {
		return AadharNo;
	}

	public void setAadharNo(long aadharNo) {
		AadharNo = aadharNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Org getOrg() {
		return org;
	}

	public void setOrg(Org org) {
		this.org = org;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", firstName=" + firstName + ", LastName=" + LastName + ", email=" + email
				+ ", mob=" + mob + ", panCard=" + panCard + ", AadharNo=" + AadharNo + ", city=" + city + ", salary="
				+ salary + ", dept=" + dept + ", org=" + org + "]";
	}

}
