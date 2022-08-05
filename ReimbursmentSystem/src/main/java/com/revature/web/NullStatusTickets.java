package com.revature.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.Ticket_rep;
import com.revature.model.Ticket;
import com.revature.repository.TicketRepository;
import com.revature.repository.TicketRepositoryImpl;

/**
 * Servlet implementation class NullStatusTickets
 */
public class NullStatusTickets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NullStatusTickets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		TicketRepository all_ticks= new TicketRepositoryImpl();
		List <Ticket> tickets=all_ticks.selectNullStatusTicket();
		
		ObjectMapper imThemap =new ObjectMapper();
		String json= imThemap.writeValueAsString(tickets);
		
		response.setContentType("application/json");
		PrintWriter writer =response.getWriter();
		writer.write(json);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
