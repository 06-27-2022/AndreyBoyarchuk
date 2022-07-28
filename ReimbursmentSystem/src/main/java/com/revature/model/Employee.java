package com.revature.model;

import java.util.Objects;

public class Employee {

	private int id;
	private String full_name;
	private String Email;
	private int Department;
	private String Location;
	private String username;
	private String password;
	// constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String full_name, String email, int department, String location, String username,
			String password) {
		super();
		this.id = id;
		this.full_name = full_name;
		this.Email = email;
		this.Department = department;
		this.Location = location;
		this.username = username;
		this.password = password;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Department, Email, Location, full_name, id, password, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Department == other.Department && Objects.equals(Email, other.Email)
				&& Objects.equals(Location, other.Location) && Objects.equals(full_name, other.full_name)
				&& id == other.id && Objects.equals(password, other.password)
				&& Objects.equals(username, other.username);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getDepartment() {
		return Department;
	}
	public void setDepartment(int department) {
		Department = department;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", full_name=" + full_name + ", Email=" + Email + ", Department=" + Department
				+ ", Location=" + Location + ", username=" + username + ", password=" + password + "]";
	}
	
	


}
