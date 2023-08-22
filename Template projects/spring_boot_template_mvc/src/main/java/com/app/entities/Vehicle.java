package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="user_id")
	private User user;

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", type=" + type + ", company=" + company + ", regdate=" + regdate + ", user="
				+ user + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public LocalDate getRegdate() {
		return regdate;
	}

	public void setRegdate(LocalDate regdate) {
		this.regdate = regdate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Vehicle(int id, String type, String company, LocalDate regdate, User user) {
		super();
		this.id = id;
		this.type = type;
		this.company = company;
		this.regdate = regdate;
		this.user = user;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
