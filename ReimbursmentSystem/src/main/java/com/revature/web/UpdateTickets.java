package com.revature.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.Ticket_rep;
import com.revature.model.Ticket;

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
		Ticket_rep view_tick = new Ticket_rep();
		// Initiate class
		String st_Ticket_id = request.getParameter("id");
		int ticket_id = Integer.parseInt(st_Ticket_id);
		String status = request.getParameter("status");
		Ticket retr_ticket = view_tick.findById(ticket_id);
		String description = retr_ticket.getDescription();
		String date_approved = retr_ticket.getDate_approved();
		String date_created = retr_ticket.getDate_created();
		int employee_id = retr_ticket.getEmployee_id();
		double amount = retr_ticket.getAmount();
		String type = retr_ticket.getType();
		
		Ticket ticket_to_update= new Ticket(ticket_id,description, status, date_approved ,date_created, employee_id,amount, type);
		view_tick.update(ticket_to_update);
		/*
		Ticket ticket_by_status=view_tick.findById(ticket_id);
		
		response.setContentType("text/html");
		response.addHeader("Cusomt Header", "My Header");
			PrintWriter writer=response.getWriter();
			writer.write(ticket_id);
			writer.write(ticket_by_status.getStatus());
   */
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
