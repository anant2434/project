package com.app.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="policy")
public class Policy extends BaseEntity {
	
	
	
	@Column(length = 20)
	private Double amount;
	
	@Column(name="purchase_date",length = 20)
	private LocalDate purchaseDate;
	
	@Column(length = 20)
	private LocalDate validity;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "vehicle_id")
	private Vehicle vehicle;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="user_id")
	private User user;

	public Policy(Double amount, LocalDate purchaseDate, LocalDate validity, Vehicle vehicle, User user) {
		super();
		this.amount = amount;
		this.purchaseDate = purchaseDate;
		this.validity = validity;
		this.vehicle = vehicle;
		this.user = user;
	}

	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Policy [amount=" + amount + ", purchaseDate=" + purchaseDate + ", validity=" + validity + ", vehicle="
				+ vehicle + ", user=" + user + "]";
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public LocalDate getValidity() {
		return validity;
	}

	public void setValidity(LocalDate validity) {
		this.validity = validity;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	
	
	
	
	
	

}
