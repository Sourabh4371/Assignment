package com.credmarg.app.CredmargBackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credmarg.app.CredmargBackend.entities.Vendor;
import com.credmarg.app.CredmargBackend.repositories.VendorRepo;

@Service
public class VendorServiceImpl implements VendorService {
	
	@Autowired
	private VendorRepo vendorRepo;

	

	@Override
	public List<Vendor> getVendors() {
		// TODO Auto-generated method stub
		return vendorRepo.findAll();
	}



	@Override
	public void addVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		vendorRepo.save(vendor);
		
	}

}
