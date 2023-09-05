package com.amdocs.restapidemo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.restapidemo1.exception.RecordNotFoundException;
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
		try {
			return custservice.getCustomerById(id);
		} catch (RecordNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	//http://localhost:8090/api/customer/insertcust
	//pass value in json format in api tester
	@PostMapping("/insertcust")
	public Customer createCustomer(@RequestBody Customer customer)
	{
		return custservice.createCustomer(customer);
	}
	
	@PutMapping("/{id}")
	public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer customer)
	{
		return custservice.updateCustomer(id, customer);
	}
	@DeleteMapping("/{id}")
	public void deleteCustById(@PathVariable Long id)
	{
		custservice.deleteCustomerById(id);
	}
}
