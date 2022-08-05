package com.revature.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.Ticket_rep;
import com.revature.model.Employee;
import com.revature.model.Ticket;
import com.revature.repository.EmploeeRepository;
import com.revature.repository.EmployeeRepositoryImpl;
import com.revature.repository.TicketRepository;
import com.revature.repository.TicketRepositoryImpl;

/**
 * Servlet implementation class ticket_post
 */
public class ticket_post extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ticket_post() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestBodytext = new String(request.getInputStream().readAllBytes());
		ObjectMapper objectMapper=new ObjectMapper();
		Ticket ticketClient=objectMapper.readValue(requestBodytext, Ticket.class);
		
		TicketRepository ticketSub= new TicketRepositoryImpl();
		ticketSub.save(ticketClient);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
