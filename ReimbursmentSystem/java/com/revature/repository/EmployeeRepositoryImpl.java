package com.revature.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.model.Employee;
import com.revature.util.ConnectionUtil;

public class EmployeeRepositoryImpl implements EmploeeRepository {

	public void selectAllEmployee() {

		Connection conn = null;
		Statement stmt = null;
		ResultSet set = null;

		final String SQL = "select * from employee";
		try {
			conn = ConnectionUtil.getNewConnection();
			;
			stmt = conn.createStatement();
			set = stmt.executeQuery(SQL);

			while (set.next()) {
				Employee employee = new Employee(set.getInt(1), set.getString(2), set.getString(3), set.getInt(4),
						set.getString(5));

				System.out.println(employee);
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

	}

	public List<Employee> findAllEmployee() {

		Connection conn = null;
		Statement stmt = null;
		ResultSet set = null;
		List<Employee> employees = new ArrayList<>();

		final String SQL = "select * from employee";
		try {
			conn = ConnectionUtil.getNewConnection();
			;
			stmt = conn.createStatement();
			set = stmt.executeQuery(SQL);

			while (set.next()) {
				Employee employee = new Employee(set.getInt(1), set.getString(2), set.getString(3), set.getInt(4),
						set.getString(5));

				employees.add(employee);
				//System.out.println(employee);
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

		return employees;
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub

		Connection conn = null;
		//Statement stmt = null;
		//Using prepapred statment protects against sql injection
		
		PreparedStatement stmt = null;
		/*
		 * Example of query with that os 
		 */
		/*final String SQL = "insert into employee values(default,'"+ employee.getFull_name() + "', '"
				+ employee.getEmail() + "', " + employee.getDepartment() + ", '" + employee.getLocation() + "')";
		*/
		final String SQL = "insert into employee values(default,?,?,?,?,?,?)";
		
		try {
			conn = ConnectionUtil.getNewConnection();
			stmt = conn.prepareStatement(SQL);
			stmt.setString(1, employee.getFull_name());
			stmt.setString(2, employee.getEmail());
			stmt.setInt(3, employee.getDepartment());
			stmt.setString(4, employee.getLocation());
			stmt.setString(5, employee.getUsername());
			stmt.setString(6, employee.getPassword());
			stmt.execute();
			//stmt.execute(SQL);

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
	/**
	 * @param
	 * 
	 */
	
	
	@Override
	public void update(Employee employee) {
		// TODO first step Open Connection
		
		Connection conn = null;
		//Statement stmt = null;
		//Will not use statement to avoid SQL injection
		PreparedStatement stmt = null;
		
		final String SQL = "update employee set Depatment=? where id=?";
		try {
			conn = ConnectionUtil.getNewConnection();
			stmt = conn.prepareStatement(SQL);
			stmt.setInt(1,employee.getDepartment());
			stmt.setInt(2,employee.getId());
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

	@Override
	public Employee findById(int id) {
		Employee employee=null;
		Connection conn=null;
		PreparedStatement stmt = null;
		ResultSet set=null;
		final String SQL="select* from employee where id =?";
		
		try {
		
			conn = ConnectionUtil.getNewConnection();
			stmt = conn.prepareStatement(SQL);
			stmt.setInt(1,id);
			set=stmt.executeQuery();
			if(set.next()) {
				employee= new Employee(
						set.getInt(1),
						set.getString(2),
						set.getString(3),
						set.getInt(4),
						set.getString(5)
						
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
		return employee;
	}

}
