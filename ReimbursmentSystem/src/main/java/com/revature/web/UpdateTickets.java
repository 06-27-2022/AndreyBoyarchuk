package com.revature.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.Ticket_rep;
import com.revature.model.Employee;
import com.revature.model.Ticket;
import com.revature.repository.EmploeeRepository;
import com.revature.repository.EmployeeRepositoryImpl;
import com.revature.repository.TicketRepository;
import com.revature.repository.TicketRepositoryImpl;

/**
 * Servlet implementation class UpdateTickets
 */
public class UpdateTickets extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateTickets() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		  //Ticket tick_upate = new Ticket(1, "", "","","", 1,55.00,",");
		
				
/*
		EmploeeRepository employeeRepository = new EmployeeRepositoryImpl();

		employeeRepository.update(employeeToUpdate);
		 */
		
		
		
		
	
		String st_Ticket_id = request.getParameter("id");
		int ticket_id = Integer.parseInt(st_Ticket_id);
		//String par_status=request.getParameter("status");
		
		//int par_id =1;
		
		String par_status ="approved";
		
		TicketRepository tick_rep= new TicketRepositoryImpl();
		Ticket tick_upate = new Ticket(ticket_id,"some",par_status,"some","some", 1, 5.0,"some");
		
		tick_rep.update(tick_upate);
		
		/*
		Ticket view_sts=tick_rep.findById(ticket_id);
		
		
		
		response.setContentType("text/html");
		response.addHeader("Custom Header", "My Header");
			PrintWriter writer=response.getWriter();
			writer.write(ticket_id);
			writer.write(view_sts.getStatus());
   */
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
