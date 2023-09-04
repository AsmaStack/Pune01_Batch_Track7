package com.amdocs.restapidemo1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	private long custid;
	private String custname;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public long getCustid() {
		return custid;
	}
	public void setCustid(long custid) {
		this.custid = custid;
	}
	
	public String getCustname() {
		return custname;
	}
	
	public void setCustname(String custname) {
		this.custname = custname;
	}
	
	
	
}
