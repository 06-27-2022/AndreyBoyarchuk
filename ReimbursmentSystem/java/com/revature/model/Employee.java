package com.revature.model;

import java.util.Objects;

public class Employee {

	private int id;
	private String full_name;
	private String Email;
	private int Department;
	private String Location;
	// constructor

//getter and setter
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String full_name, String email, int department, String location) {
		super();
		this.id = id;
		this.full_name = full_name;
		this.Email = email;
		this.Department = department;
		this.Location = location;
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

// getters and Setter
	@Override
	public int hashCode() {
		return Objects.hash(Department, Email, Location, full_name, id);
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
		return Objects.equals(Department, other.Department) && Objects.equals(Email, other.Email)
				&& Objects.equals(Location, other.Location) && Objects.equals(full_name, other.full_name)
				&& id == other.id;
	}

// String method

	@Override
	public String toString() {
		return "Employee ID: " + id + ", full_name: " + full_name + ", Email: " + Email + ", Department: " + Department
				+ ", Location:" + Location;
	}

}
