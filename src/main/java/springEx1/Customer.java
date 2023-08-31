package springEx1;

public class Customer {
	private int cust_id;
	private String cust_name;
	private Address address; // dependent object
	
	public Customer(int cust_id, String cust_name, Address address) {
		
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.address = address;
	}
	public Customer(int cust_id) {
		this.cust_id = cust_id;
	}
	public Customer(String cust_Name) {
		this.cust_name= cust_Name;
	}
	public Customer(int cust_id, String cust_name) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
	}
	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", cust_name=" + cust_name + ", address=" + address + "]";
	}
	
	
	
	
}
