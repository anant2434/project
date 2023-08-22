package com.app.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="vehicle")
public class Vehicle extends BaseEntity{

	
	
	@Column(name="vehicle_type")
	private String type;
	
	@Column(name="vehicle_company")
	private String company;
	
	@Column(name="registration_date")
	private LocalDate regdate;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToMany(mappedBy="vehicle", cascade = CascadeType.ALL)
	private List<Accident> accident;

	public Vehicle(String type, String company, LocalDate regdate, User user, List<Accident> accident) {
		super();
		this.type = type;
		this.company = company;
		this.regdate = regdate;
		this.user = user;
		this.accident = accident;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", company=" + company + ", regdate=" + regdate + ", user=" + user
				+ ", accident=" + accident + "]";
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

	public List<Accident> getAccident() {
		return accident;
	}

	public void setAccident(List<Accident> accident) {
		this.accident = accident;
	}

	
	
	
	
	
}
