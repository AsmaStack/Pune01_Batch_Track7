package com.amdocs.restapidemo1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.restapidemo1.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

	
}
