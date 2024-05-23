package com.credmarg.app.CredmargBackend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vendor")
public class Vendor {
	
	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vendor(String name, String email, String upi) {
		super();
		this.name = name;
		this.email = email;
		this.upi = upi;
	}

	private String name;
	@Id
	private String email;
	
	private String upi;

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

	public String getUpi() {
		return upi;
	}

	public void setUpi(String upi) {
		this.upi = upi;
	}

	@Override
	public String toString() {
		return "Vendor [name=" + name + ", email=" + email + ", upi=" + upi + "]";
	}
	

}
