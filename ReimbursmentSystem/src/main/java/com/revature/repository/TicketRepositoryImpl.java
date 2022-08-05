package com.revature.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.revature.model.Ticket;
import com.revature.util.ConnectionUtil;

public class TicketRepositoryImpl implements TicketRepository {
	
	public List<Ticket> selectNullStatusTicket() {

		Connection conn = null;
		Statement stmt = null;
		ResultSet set = null;
		List<Ticket> tickets = new ArrayList<>();

		final String SQL = "select * from reimbursement where status  != 'approved'";
		try {
			conn = ConnectionUtil.getNewConnection();

			stmt = conn.createStatement();
			set = stmt.executeQuery(SQL);

			while (set.next()) {
				Ticket ticket = new Ticket(set.getInt(1), set.getString(2), set.getString(3), set.getString(4),
						set.getString(5), set.getInt(6), set.getFloat(7), set.getString(8));

				tickets.add(ticket);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				stmt.close();
				set.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}
		// TODO Auto-generated method stub

		return tickets;

		
		
	}

	public List<Ticket> findAllTickets() {

		Connection conn = null;
		Statement stmt = null;
		ResultSet set = null;
		List<Ticket> tickets = new ArrayList<>();

		final String SQL = "select * from reimbursement";
		try {
			conn = ConnectionUtil.getNewConnection();

			stmt = conn.createStatement();
			set = stmt.executeQuery(SQL);

			while (set.next()) {
				Ticket ticket = new Ticket(set.getInt(1), set.getString(2), set.getString(3), set.getString(4),
						set.getString(5), set.getInt(6), set.getFloat(7), set.getString(8));

				tickets.add(ticket);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				stmt.close();
				set.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}
		// TODO Auto-generated method stub

		return tickets;

		
		
	}
	public void save(Ticket ticket) {
		// TODO Auto-generated method stub

		Connection conn = null;

		PreparedStatement stmt = null;

		final String SQL = "insert into reimbursement values(default,?,?,?,?,?,?,?)";

		try {
			conn = ConnectionUtil.getNewConnection();
			stmt = conn.prepareStatement(SQL);
			stmt.setString(1, ticket.getDescription());
			stmt.setString(2, ticket.getStatus());
			stmt.setString(3, ticket.getDate_approved());
			stmt.setString(4, ticket.getDate_created());
			stmt.setInt(5, ticket.getEmployee_id());
			stmt.setDouble(6, ticket.getAmount());
			stmt.setString(7, ticket.getType());
			stmt.execute();
			// stmt.execute(SQL);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	
	public void update(Ticket ticket) {
		// TODO first step Open Connection
		
		Connection conn = null;
	
		PreparedStatement stmt = null;
		
		final String SQL = "update reimbursement set status=? where id=?";
		try {
			conn = ConnectionUtil.getNewConnection();
			stmt = conn.prepareStatement(SQL);
			stmt.setString(1,ticket.getStatus());
			stmt.setInt(2,ticket.getId());
			stmt.execute();
			

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public Ticket findById(int id) {
		Ticket ticket=null;
		Connection conn=null;
		PreparedStatement stmt = null;
		ResultSet set=null;
		final String SQL="select* from reimbursement where id =?";
		
		try {
		
			conn = ConnectionUtil.getNewConnection();
			stmt = conn.prepareStatement(SQL);
			stmt.setInt(1,id);
			set=stmt.executeQuery();
			if(set.next()) {
				ticket= new Ticket(
						set.getInt(1),
						set.getString(2),
						set.getString(3),
						set.getString(4),
						set.getString(5),
						set.getInt(6),
						set.getDouble(7),
						set.getString(8)
						);
			}
				

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return ticket;
	}
	
	
	
	

}
