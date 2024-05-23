package com.credmarg.app.CredmargBackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.credmarg.app.CredmargBackend.entities.Vendor;

@Repository
public interface VendorRepo extends JpaRepository<Vendor,String>{

}
