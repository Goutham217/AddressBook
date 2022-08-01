package com.addressbook.cloudsync.pojo;

public class ContactsPojo {
	
	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private String image;
	private int phoneNumber;
	
	
	public ContactsPojo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ContactsPojo(int userId, String firstName, String lastName, String email, String image, int phoneNumber) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.image = image;
		this.phoneNumber = phoneNumber;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public int getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	@Override
	public String toString() {
		return "ContactsPojo [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", image=" + image + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
	
}
