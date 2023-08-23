package com.app.dto;

public class UserResponseDto {
	
	private String firstName;
	 private String lastName;
	 private String mobileNo;
	 private String address;
	 private String email;
	 
	 
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserResponseDto [firstName=" + firstName + ", lastName=" + lastName + ", mobileNo=" + mobileNo
				+ ", address=" + address + ", email=" + email + "]";
	}
	 
	 

}
