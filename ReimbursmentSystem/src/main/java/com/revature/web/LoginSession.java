package com.revature.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.model.Employee;
import com.revature.repository.EmploeeRepository;
import com.revature.repository.EmployeeRepositoryImpl;

/**
 * Servlet implementation class LoginSession
 */
public class LoginSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginSession() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String param0=request.getParameter("empl_id");
		int param=Integer.parseInt(param0);
		
		
		
		EmploeeRepository employee = new EmployeeRepositoryImpl();

		Employee retriveEmployee = employee.findById(param);

		String usernameP = retriveEmployee.getUsername();

		String passwordP = retriveEmployee.getPassword();

		int departmentP = retriveEmployee.getDepartment();
		
		
		response.setContentType("text/html");
		response.addHeader("Cusomt Header", "My Header");
			PrintWriter writer=response.getWriter();
			writer.write(departmentP);
			writer.write(usernameP+" "+passwordP);
/*
		if (username.equals(usernameP) && password.equals(passwordP)) {

			HttpSession session = request.getSession();
			Pseudo cod 
				if department id = 1
			   		employee post
			   		all tickets
			   		all employees
			   	

		} else {
			response.setStatus(400);
		}
*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
