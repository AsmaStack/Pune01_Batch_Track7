package com.amdocs.restapidemo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.restapidemo1.model.Customer;
import com.amdocs.restapidemo1.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	
	private CustomerService custservice;

	@Autowired
	public CustomerController(CustomerService custservice) {
		this.custservice = custservice;
	}

	@GetMapping("/allcust")
	public List<Customer> getAllCustomer()
	{
		return custservice.getAllCustomers();
	}
	
	@GetMapping("/{id}")
	public Customer getCustbyId(@PathVariable Long id)
	{
		return custservice.getCustomerById(id);
	}
	
	
}
