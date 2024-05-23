package com.credmarg.app.CredmargBackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credmarg.app.CredmargBackend.entities.Employee;
import com.credmarg.app.CredmargBackend.repositories.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepo.save(employee);
		
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

}
