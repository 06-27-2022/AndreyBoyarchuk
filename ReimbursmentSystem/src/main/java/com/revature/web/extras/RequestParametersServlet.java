package com.revature.web.extras;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.rmi.ServerException;

public class RequestParametersServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    protected void  doGet(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException{

 	System.out.println(request.getRequestURI());
	System.out.println(request.getQueryString());
	
	System.out.println(request.getParameter("username"));
	System.out.println(request.getParameter("password"));

	}



	
}
