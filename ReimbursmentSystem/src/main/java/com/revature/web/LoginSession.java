package com.revature.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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
		
		
		EmploeeRepository em_rp =new EmployeeRepositoryImpl();

		String username = request.getParameter("username");	
		String password= request.getParameter("password");	
		
		Employee emp_values=em_rp.findByUserName(username);
		
		 String par_user=emp_values.getUsername();
		 String par_password=emp_values.getPassword();
		
		if (username.equals(par_user) && password.equals(par_password)) {
			
			Cookie myCookie =new Cookie("authenticated", "true");
			response.addCookie(myCookie);
		}
		else {
			response.setStatus(401);
		}
		}
	}

