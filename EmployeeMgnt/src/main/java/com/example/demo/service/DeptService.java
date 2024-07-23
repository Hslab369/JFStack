package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Dept;

public interface DeptService {
	Dept updateDept(Dept dept);

	void deleteDept(int id);

	List<Dept> getDepts();

	Dept addDept(Dept dept);
}
