package com.amdocs.restapidemo1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.amdocs.restapidemo1.model.Customer;
import com.amdocs.restapidemo1.repo.CustomerRepo;

@Service
public class CustomerService {
	
	
	private CustomerRepo custrepo;

	@Autowired
	public CustomerService(CustomerRepo custrepo) {
		
		this.custrepo = custrepo;
	}
	
	
	public List<Customer> getAllCustomers()
	{
		
		return custrepo.findAll();
	}
	
	public Customer getCustomerById(Long id)
	{
		return custrepo.findById(id).orElse(null);
		
	}
	
	
	
	
	

}
