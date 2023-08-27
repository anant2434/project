package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Vehicle;
import com.app.service.IVehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	
	@Autowired
	private IVehicleService vehicleservice;
	
	@GetMapping
	public List<Vehicle> getAllVehicles(){
		return vehicleservice.getAllVehicles();
	}
	
	@GetMapping("/{vid}")
	public Vehicle getVehicleById(@PathVariable Long vid) {
		return vehicleservice.getVehicleById(vid);
	}
	
	@PostMapping
	public Vehicle addVehicle(@RequestBody Vehicle newVehicle) {
		return vehicleservice.addNewVehicle(newVehicle);
	}
	
	@DeleteMapping("/{vid}")
	public String deleteVehicle(@PathVariable Long vid) {
		return vehicleservice.deleteVehicleDetails(vid);
	}
	
	@PutMapping
	public Vehicle updateVehicle(@RequestBody @Valid Vehicle updVehicle) {
		return vehicleservice.updateVehicle(updVehicle);
	}
	
	
	
	
	

}
