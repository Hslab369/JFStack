package com.example.demo.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Dept;
import com.example.demo.repository.DeptRepository;
import com.example.demo.service.DeptService;

@Service
public class DeptServiceImp implements DeptService {

	@Autowired
	DeptRepository deptRepository;
	
	
	public DeptServiceImp(DeptRepository deptRepository) {
		super();
		this.deptRepository = deptRepository;
	}


	@Override
	public Dept addDept(Dept dept) {
		// TODO Auto-generated method stub
		return deptRepository.save(dept);
	}


	@Override
	public List<Dept> getDepts() {
		// TODO Auto-generated method stub
		List<Dept> d1=deptRepository.findAll();
		return d1;
	}
	
	@Override
	public Dept updateDept(Dept dept) {
		// TODO Auto-generated method stub
		Dept d1=deptRepository.findById(dept.getId()).get();
		d1.setName(dept.getName());
		d1.setId(dept.getId());
		return d1;
	}

	@Override
	public void deleteDept(int id) {
		// TODO Auto-generated method stub
		deptRepository.deleteById(id);
	}


}
