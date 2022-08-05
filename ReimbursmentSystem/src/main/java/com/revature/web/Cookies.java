package com.revature.web;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookies extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException {

	String username = request.getParameter("username");	
	String password= request.getParameter("password");	
	
	
	
	if (username.equals("karina") && password.equals("114164")) {
		
		Cookie myCookie =new Cookie("authenticated", "true");
		response.addCookie(myCookie);
	}
	else {
		response.setStatus(401);
	}
	}
}
