package com.revature.repository;
import java.util.List;

import com.revature.model.Employee;

public interface EmploeeRepository {
	
	/*
	 * What types of methods
	 */
	List <Employee>  findAllEmployee();
	//Save new record
	
	void save (Employee employee );
	// updates 
	void update(Employee employee);
	/**
	 *  
	 * @param id
	 * @return
	 */
	Employee findById(int id);


}
