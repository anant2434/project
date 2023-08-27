package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.Vehicle;
import com.app.exception.ResourceNotFound;
import com.app.entities.Vehicle;
import com.app.repository.VehicleEntityRepository;

@Service
@Transactional
public class VehicleServiceImpl  implements IVehicleService{

	@Autowired
	private VehicleEntityRepository vehiclerepo;
	
	@Override
	public Vehicle addNewVehicle(Vehicle newVehicle) {
	return vehiclerepo.save(newVehicle);
	}
	
	@Override
	public List<Vehicle> getAllVehicles() {
		return vehiclerepo.findAll();
	}

	@Override
	public Vehicle getVehicleById(Long Id) {
		Vehicle newVehicle = vehiclerepo.findById(Id).orElseThrow(() -> new ResourceNotFound("Invalid Id, Vehicle not found!!!"));
		return newVehicle;
	}

	


	@Override
	public Vehicle updateVehicle(Vehicle updatedcourse) {
		Vehicle updcourse = vehiclerepo.findById(updatedcourse.getId()).orElseThrow(
				() -> new ResourceNotFound("Invalid Id, Could not update!!!"));
		updcourse.setCompany(updatedcourse.getCompany());
		updcourse.setType(updatedcourse.getType());
		updcourse.setRegdate(updatedcourse.getRegdate());

		return updcourse;
	}
	
	@Override
	public String deleteVehicleDetails(Long userID) {
		String mesg = "Emp id invalid , can't delete emp details ";
		if (vehiclerepo.existsById(userID)) {
			vehiclerepo.deleteById(userID);
			mesg = "User with ID=" + userID + "  deleted !";
		}
		return mesg;
	}

	


}
