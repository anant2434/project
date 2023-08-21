package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicle")
public class Vehicle {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="vehicle_Id")
	private int id;
	
	@Column(name="vehicle_type")
	private String type;
	
	@Column(name="vehicle_company")
	private String company;
	
	@Column(name="registration_date")
	private LocalDate regdate;
	
	
	
}
