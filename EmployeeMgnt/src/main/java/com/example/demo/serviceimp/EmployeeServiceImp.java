package com.example.demo.serviceimp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImp implements EmployeeService {

	EmployeeRepository empR;

	public EmployeeServiceImp(EmployeeRepository empR) {
		super();
		this.empR = empR;
	}

	@Override
	public Employee addData(Employee emp) {
		// TODO Auto-generated method stub
		return empR.save(emp);
	}

	@Override
	public List<Employee> GetData() {
		// TODO Auto-generated method stub		List<Employee> l1 = 
		return empR.findAll();
	}

	@Override
	public Employee updateData(Employee emp) {
		// TODO Auto-generated method stub
		Employee e1 = empR.findById(emp.getId()).get();
		e1.setName(emp.getName());
		e1.setSalary(emp.getSalary());
		e1.setDept(emp.getDept());
		return empR.save(e1);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		empR.deleteById(id);
	}

}
