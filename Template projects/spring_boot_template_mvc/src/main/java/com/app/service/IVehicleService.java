package com.app.service;

import java.util.List;

import com.app.entities.Vehicle;

public interface IVehicleService {
	
	Vehicle addNewVehicle(Vehicle newVehicle);
	List<Vehicle> getAllVehicles();
	Vehicle getVehicleById(Long Id);
	String deleteVehicleDetails(Long userID);
	Vehicle updateVehicle(Vehicle updatedVehicle);


}
