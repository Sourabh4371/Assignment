package com.credmarg.app.CredmargBackend.services;


import java.util.List;

import com.credmarg.app.CredmargBackend.entities.Employee;


public interface EmployeeService {
	
	public void addEmployee(Employee employee);
	
	public List<Employee> getEmployees();

}
