package com.revature.repository;
import java.util.List;

import com.revature.model.Employee;
import com.revature.model.Login;

public interface EmploeeRepository {
	
	
	List <Employee>  findAllEmployee();
	
	
	void save (Employee employee );
	
	void update(Employee employee);
	
	Employee findById(int id);
	

	 Employee findByUserName(String username) ;
	}

	



