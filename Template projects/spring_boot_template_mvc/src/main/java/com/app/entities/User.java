package com.app.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="user")
public class User extends BaseEntity {
	
    @Column(name="first_name", length =30)
    private String firstName;
    
    @Column(name="last_name", length =30)
    private String lastName;
    
    @Column(name="mobile_no", length=30)
    private String mobileNo;
    
    @Column( length=30)
    private String address;
    
    private LocalDate dob;
    
    @Column( length=30)
    private String email;
    
    @Column( length=30)
    private String password;
    
    @Enumerated(EnumType.STRING)
    @Column( length=30)
    private UserRole role;
    
    @JsonIgnore
    @OneToMany(mappedBy="user", cascade = CascadeType.ALL)
    @JsonManagedReference
    
	private List<Vehicle> vehicle;
    
//    @JsonIgnore
//    @OneToMany(mappedBy="user", cascade = CascadeType.ALL)
//    @JsonManagedReference
//	private List<Policy> policy;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	public List<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

//	public List<Policy> getPolicy() {
//		return policy;
//	}

//	public void setPolicy(List<Policy> policy) {
//		this.policy = policy;
//	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", mobileNo=" + mobileNo + ", address="
				+ address + ", dob=" + dob + ", email=" + email + ", role=" + role + ", vehicle=" + vehicle
				+ ", policy=" + /*policy */ "]";
	}

	public User(String firstName, String lastName, String mobileNo, String address, LocalDate dob, String email,
			UserRole role, List<Vehicle> vehicle, List<Policy> policy) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.address = address;
		this.dob = dob;
		this.email = email;
		this.role = role;
		this.vehicle = vehicle;
		//this.policy = policy;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
