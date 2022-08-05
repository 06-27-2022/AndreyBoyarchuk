package com.revature;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.model.Employee;
import com.revature.model.Ticket;
import com.revature.repository.TicketRepository;
import com.revature.repository.TicketRepositoryImpl;
import com.revature.util.ConnectionUtil;

public class Ticket_rep {

	
	
	public static void main(String[] args) {

	
    
	int par_id =1;
	
	String par_status ="Approved";
	
	TicketRepository tick_rep= new TicketRepositoryImpl();
	Ticket tick_upate = new Ticket(par_id,"",par_status, null, null, 1, 5.0, null);
	
	tick_rep.update(tick_upate);
	
	Ticket view_sts=tick_rep.findById(par_id);

	System.out.println(view_sts);
	
	

	
	}
}
	

