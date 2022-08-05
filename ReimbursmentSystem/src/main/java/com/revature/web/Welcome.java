package com.revature.web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.Employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import static java.nio.file.Files.readAllBytes;

public class Welcome extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    protected void  doGet(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException{

 response.setContentType("text/html");
 response.addHeader("Cusomt Header", "My Header");
	PrintWriter writer=response.getWriter();
	writer.write("Welcome");
	writer.write("<h1> Welcome  to My app!</h1>");
	
	

	}

protected  void  doPost(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException{

response.setStatus(500);
	String requestBodytext = new String(request.getInputStream().readAllBytes());
	ObjectMapper objectMapper=new ObjectMapper();
	Employee employeeFromRequestBody =objectMapper.readValue(requestBodytext, Employee.class);

	
	System.out.println(employeeFromRequestBody);
}



}
