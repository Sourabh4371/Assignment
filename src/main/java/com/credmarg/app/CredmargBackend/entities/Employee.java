package com.credmarg.app.CredmargBackend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String email, String designation, int ctc) {
		super();
		this.name = name;
		this.email = email;
		this.designation = designation;
		this.ctc = ctc;
	}

	private String name;
	@Id
	private String email;
	
	private String designation;
	
	private int ctc;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getCtc() {
		return ctc;
	}

	public void setCtc(int ctc) {
		this.ctc = ctc;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", designation=" + designation + ", ctc=" + ctc + "]";
	}

}
