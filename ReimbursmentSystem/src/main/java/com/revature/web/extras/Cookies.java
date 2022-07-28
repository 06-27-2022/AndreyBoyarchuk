package com.revature.web.extras;

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
	
	
	if (username.equals("Andrey") && password.equals("password")) {
		
		Cookie myCookie =new Cookie("authenticated", "true");
		response.addCookie(myCookie);
	}
	else {
		response.setStatus(401);
	}
	}
}
