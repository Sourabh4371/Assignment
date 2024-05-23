package com.credmarg.app.CredmargBackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.credmarg.app.CredmargBackend.entities.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,String>{

}
