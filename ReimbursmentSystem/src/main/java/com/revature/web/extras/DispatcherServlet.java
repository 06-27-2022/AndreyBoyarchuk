package com.revature.web.extras;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void DoGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

	String httpVerb= request.getMethod();
	String resource =request.getRequestURI();
	System.out.println(request.getRequestURI());
	String isolatedResource =resource.replace("ServletDemo/api","");
	System.out.println(isolatedResource);
	
	switch (isolatedResource) {
	case"":
		
	break;
		case "associate":
		break;
		default:
			break;
	}

	}
	
	
	protected void DoPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
