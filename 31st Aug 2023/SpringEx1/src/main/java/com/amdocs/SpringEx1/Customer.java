package com.amdocs.SpringEx1;

public class Customer {

	private int custid;
	private String custname;

	public Customer(String custname) {
		// super();
		this.custname = custname;
	}

	public Customer(int custid) {
		// super();
		this.custid = custid;
	}

	public Customer(int custid, String custname) {
		super();
		this.custid = custid;
		this.custname = custname;
	}
	

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custname=" + custname + "]";
	}

//	
//	public int getCustid() {
//		return custid;
//	}
//	public void setCustid(int custid) {
//		this.custid = custid;
//	}
//	public String getCustname() {
//		return custname;
//	}
//	public void setCustname(String custname) {
//		this.custname = custname;
//	}
//	

}
