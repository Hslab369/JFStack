package com.example.demo.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public EmployeeServiceImp(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return employeeRepository.save(emp);
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		List<Employee> e1=employeeRepository.findAll();
		return e1;
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		Employee e1=employeeRepository.findById(emp.geteId()).get();
		e1.setFirstName(emp.getFirstName());
		e1.setLastName(emp.getLastName());
		e1.setEmail(emp.getEmail());
		e1.setAadharNo(emp.getAadharNo());
		e1.setCity(emp.getCity());
		e1.setMob(emp.getMob());
		e1.setDept(emp.getDept());
		e1.setOrg(emp.getOrg());
		e1.setPanCard(emp.getPanCard());
		e1.setSalary(emp.getSalary());
		return e1;
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
	}

}
