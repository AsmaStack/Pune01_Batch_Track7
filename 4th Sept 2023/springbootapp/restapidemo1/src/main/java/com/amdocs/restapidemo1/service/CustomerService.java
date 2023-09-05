package com.amdocs.restapidemo1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.amdocs.restapidemo1.exception.RecordNotFoundException;
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
	
	public Customer getCustomerById(Long id) throws RecordNotFoundException
	{
		Customer cust= custrepo.findById(id).orElse(null);
		if(cust==null)
		{
			throw new RecordNotFoundException(" Record not exist for given id "+id);
		}
		return cust;
		
	}
	
	
	
	public Customer createCustomer(Customer customer)
	{
		return custrepo.save(customer);
	}
	
	
	public Customer updateCustomer(Long id, Customer customer)
	{
		
		Customer existingcust=custrepo.findById(id).orElse(null);
		if(existingcust!=null)
		{
			//customer.setCustid(existingcust.getCustid());
			existingcust.setCustname(customer.getCustname());
		}
		return custrepo.save(existingcust);
	}
	
	public void deleteCustomerById(Long id)
	{
		
		custrepo.deleteById(id);
		
	}
	
	
	
	
	

}
