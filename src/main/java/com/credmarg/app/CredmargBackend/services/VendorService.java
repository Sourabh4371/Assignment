package com.credmarg.app.CredmargBackend.services;

import java.util.List;

import com.credmarg.app.CredmargBackend.entities.Vendor;

public interface VendorService {
	
   public void addVendor(Vendor vendor);
   
   public List<Vendor> getVendors();


}
