package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.Policy;
import com.app.exception.ResourceNotFound;
import com.app.repository.PolicyEntityRepository;

@Service
@Transactional
public class PolicyServiceImpl  implements IPolicyService{
	
	@Autowired
	private PolicyEntityRepository policyrepo;
	
	@Override
	public Policy addNewPolicy(Policy newPolicy) {
	return policyrepo.save(newPolicy);
	}
	
	@Override
	public List<Policy> getAllPolicys() {
		return policyrepo.findAll();
	}

	@Override
	public Policy getPolicyById(Long Id) {
		Policy newPolicy = policyrepo.findById(Id).orElseThrow(() -> new ResourceNotFound("Invalid Id, Policy not found!!!"));
		return newPolicy;
	}

	


	@Override
	public Policy updatePolicy(Policy updatedcourse) {
		Policy updcourse = policyrepo.findById(updatedcourse.getId()).orElseThrow(
				() -> new ResourceNotFound("Invalid Id, Could not update!!!"));
		updcourse.setValidity(updatedcourse.getValidity());
		updcourse.setPurchaseDate(updatedcourse.getPurchaseDate());
		updcourse.setVehicle(updatedcourse.getVehicle());

		return updcourse;
	}
	
	@Override
	public String deletePolicyDetails(Long userID) {
		String mesg = "Emp id invalid , can't delete emp details ";
		if (policyrepo.existsById(userID)) {
			policyrepo.deleteById(userID);
			mesg = "User with ID=" + userID + "  deleted !";
		}
		return mesg;
	}

	


}
