package com.app.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="policy")
public class Policy extends BaseEntity {
	
	
	
	@Column(length = 20)
	private Double amount;
	
	@Column(name="purchase_date",length = 20)
	private LocalDate purchaseDate;
	
	@Column(length = 20)
	private LocalDate validity;
	
	@Enumerated(EnumType.STRING)
    @Column( length=30)
    private PolicyType policy;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	@JoinColumn(name = "vehicle_id")
	private Vehicle vehicle;
	
//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="user_id")
//	@JsonBackReference
//	private User user;

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

	public PolicyType getPolicy() {
		return policy;
	}

	public void setPolicy(PolicyType policy) {
		this.policy = policy;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	//public User getUser() {
	//	return user;
//	}

//	public void setUser(User user) {
//		this.user = user;
//	}

	@Override
	public String toString() {
		return "Policy [amount=" + amount + ", purchaseDate=" + purchaseDate + ", validity=" + validity + ", policy="
				+ policy + ", vehicle=" + vehicle + ", user=" + /*user*/  "]";
	}

	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Policy(Double amount, LocalDate purchaseDate, LocalDate validity, PolicyType policy, Vehicle vehicle,
			User user) {
		super();
		this.amount = amount;
		this.purchaseDate = purchaseDate;
		this.validity = validity;
		this.policy = policy;
		this.vehicle = vehicle;
		//this.user = user;
	}

	
	
	
	
	
	
	
	
	
	
	

}
