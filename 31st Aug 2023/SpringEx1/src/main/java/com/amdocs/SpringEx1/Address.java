package com.amdocs.SpringEx1;

public class Address {
	
	private String state;
	private String country;
	
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [state=" + state + ", country=" + country + "]";
	}
	
	

}
