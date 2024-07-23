package com.example.demo.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Org;
import com.example.demo.repository.OrgRepository;
import com.example.demo.service.OrgService;

@Service
public class OrgServiceImp implements OrgService {

	@Autowired
	OrgRepository orgRepository;
	
	public OrgServiceImp(OrgRepository orgRepository) {
		super();
		this.orgRepository = orgRepository;
	}

	@Override
	public Org addOrg(Org org) {
		// TODO Auto-generated method stub
		return orgRepository.save(org);
	}

	@Override
	public List<Org> getOrgs() {
		// TODO Auto-generated method stub
		List<Org> o1=orgRepository.findAll();
		return o1;
	}

	@Override
	public Org updateOrg(Org org) {
		// TODO Auto-generated method stub
		Org o1=orgRepository.findById(org.getRegno()).get();
		o1.setName(org.getName());
		o1.setRegno(org.getRegno());
		o1.setLocation(org.getLocation());
		o1.setEmpList(org.getEmpList());
		o1.setDeptList(org.getDeptList());
		return o1;
	}

	@Override
	public void deleteOrg(int id) {
		// TODO Auto-generated method stub
		orgRepository.deleteById(id);
	}


}
