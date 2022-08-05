package com.revature.repository;

import java.util.List;

import com.revature.model.Ticket;

public interface TicketRepository {
	
	
	List<Ticket> selectNullStatusTicket();
	List<Ticket> findAllTickets();
	public void save(Ticket ticket);
	public void update(Ticket ticket);
	public Ticket findById(int id);

}
