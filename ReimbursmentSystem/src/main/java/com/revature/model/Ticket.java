package com.revature.model;

import java.util.Objects;





public class Ticket {
 private int id;
 private String description;
 private String status;
 private String date_approved;
 private String date_created;
 private int employee_id;
 private double amount;
 private String type;

 
 
public Ticket() {
	super();
	// TODO Auto-generated constructor stub
}

public Ticket(int id, String description, String status, String date_approved, String date_created, int employee_id,
		double amount, String type) {
	super();
	this.id = id;
	this.description = description;
	this.status = status;
	this.date_approved = date_approved;
	this.date_created = date_created;
	this.employee_id = employee_id;
	this.amount = amount;
	this.type = type;
}




@Override
public int hashCode() {
	return Objects.hash(amount, date_approved, date_created, description, employee_id, id, status, type);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Ticket other = (Ticket) obj;
	return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
			&& Objects.equals(date_approved, other.date_approved) && Objects.equals(date_created, other.date_created)
			&& Objects.equals(description, other.description) && employee_id == other.employee_id && id == other.id
			&& Objects.equals(status, other.status) && Objects.equals(type, other.type);
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public String getStatus() {
	return status;
}


public void setStatus(String status) {
	this.status = status;
}


public String getDate_approved() {
	return date_approved;
}


public void setDate_approved(String date_approved) {
	this.date_approved = date_approved;
}


public String getDate_created() {
	return date_created;
}


public void setDate_created(String date_created) {
	this.date_created = date_created;
}


public int getEmployee_id() {
	return employee_id;
}


public void setEmployee_id(int employee_id) {
	this.employee_id = employee_id;
}


public double getAmount() {
	return amount;
}


public void setAmount(double amount) {
	this.amount = amount;
}


public String getType() {
	return type;
}


public void setType(String type) {
	this.type = type;
}


@Override
public String toString() {
	return "Ticket [id=" + id + ", description=" + description + ", status=" + status + ", date_approved="
			+ date_approved + ", date_created=" + date_created + ", employee_id=" + employee_id + ", amount=" + amount
			+ ", type=" + type + "]";
}



}


