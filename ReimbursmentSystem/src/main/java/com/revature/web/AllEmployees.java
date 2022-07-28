package com.revature.web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.Employee;
import com.revature.repository.EmploeeRepository;
import com.revature.repository.EmployeeRepositoryImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import java.util.List;

import static java.nio.file.Files.readAllBytes;

public class AllEmployees extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    protected void  doGet(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException{

    	//response.getWriter().write("it works");
    	
    	EmploeeRepository employeeRepository =new EmployeeRepositoryImpl();
		List<Employee> employees=employeeRepository.findAllEmployee();
		
		ObjectMapper imThemap =new ObjectMapper();
		String json= imThemap.writeValueAsString(employees);
		
		response.setContentType("application/json");
		PrintWriter writer =response.getWriter();
		writer.write(json);
		

	}




}
