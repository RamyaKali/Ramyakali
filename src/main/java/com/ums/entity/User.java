package com.ums.entity;

public class User {
	private int id;
	private String name;
	private String email;
	private String password;
	private String mobileno;
	private String location;
	
	public User(int id, String name, String email, String password, String mobileno, String location) {
//		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password=password;
		this.mobileno = mobileno;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User(String password) {
		super();
		this.password = password;
	}
	
	public User(String name2, String email2, String password2, String mobileno2, String location2) {
		// TODO Auto-generated constructor stub
		this.name = name2;
		this.email = email2;
		this.password=password2;
		this.mobileno = mobileno2;
		this.location = location2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", mobileno="
				+ mobileno + ", location=" + location + "]";
	}
	

}