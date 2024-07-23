package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Org;

public interface OrgService {
	Org addOrg(Org org);

	List<Org> getOrgs();

	Org updateOrg(Org org);

	void deleteOrg(int id);
}
