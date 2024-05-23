package com.credmarg.app.CredmargBackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.credmarg.app.CredmargBackend.entities.Employee;
import com.credmarg.app.CredmargBackend.entities.Vendor;
import com.credmarg.app.CredmargBackend.services.EmployeeService;
import com.credmarg.app.CredmargBackend.services.VendorService;

@RestController
@RequestMapping("/credmarg")
public class MyController {
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	VendorService vendorService;
	
	@PostMapping("/Employee")
	public void addEmployee(@RequestBody Employee employee) {
		 employeeService.addEmployee(employee);
	}
	
	@GetMapping("/Employees")
	public List<Employee> getEmployees(){
		return this.employeeService.getEmployees();
	}
	
	@PostMapping("/Vendor")
	public void addVendor(@RequestBody Vendor vendor) {
		 this.vendorService.addVendor(vendor);
	}
	
	@GetMapping("/Vendors")
	public List<Vendor> getVendors(){
		return this.vendorService.getVendors();
	}
	
	
	

}
