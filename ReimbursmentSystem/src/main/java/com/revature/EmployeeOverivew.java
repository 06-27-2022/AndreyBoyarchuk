	package com.revature;

import java.sql.Statement;
import java.util.List;

import com.revature.model.Employee;
import com.revature.repository.EmploeeRepository;
import com.revature.repository.EmployeeRepositoryImpl;
import com.revature.util.ConnectionUtil;
import com.revature.web.Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeOverivew {

	public static void main(String[] args) {

		
		EmployeeRepositoryImpl employee_rep = new EmployeeRepositoryImpl();
		employee_rep.selectAllEmployee(); 
		Employee newEmployee= new Employee();
		employee_rep.save(newEmployee);
		
		//List<Employee> employees = employee_rep.findAllEmployee();

		Employee employeeToUpdate = new Employee(3, "doesent matter ", "do", 2, "dntm","dfdf","ddfd");

		EmploeeRepository employeeRepository = new EmployeeRepositoryImpl();

		//employeeRepository.update(employeeToUpdate);
		//for (Employee individual : employees) { 
		//	System.out.println(individual);
		//}
		
		Employee retriveEmployee=employee_rep.findById(5);
		System.out.println("here is the record:  "+retriveEmployee);

		
		  
		 
		 // Employee(12,"Joe Chmo","chmo@gmail.com",2,"Everett","chmojoe","12345");
		 
		  //EmployeeRepositoryImpl login_rep = new EmployeeRepositoryImpl();
		  
		  //Login login =new Login("dfdf","dfdfd",2);
		  
		  //EmploeeRepository loginInst = new EmployeeRepositoryImpl();
		  
		  


		//Employee newEmployee= new Employee(0,"Joe chom',4);drop table testTable;
		//comment","chmo@ll_n.com",2,"Tampa");
		
		 
		 
		
	}

}
