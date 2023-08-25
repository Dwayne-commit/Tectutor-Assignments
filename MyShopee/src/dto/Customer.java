package dto;

public class Customer {
	
	private String customer_code;
	private String customer_name;
	private String phone_number;
	private String address;
	
	public Customer() {}
	
	public Customer(String customer_code, String customer_name, String phone_number, String address) {
		this.customer_code = customer_code;
		this.customer_name = customer_name;
		this.phone_number = phone_number;
		this.address = address;
	}
	
	public void setCustomer_Code(String customer_code) {
		this.customer_code = customer_code;
	}
	
	public String getCustomer_Code() {
		return this.customer_code;
	}
	
	public void setCustomer_Name(String customer_name) {
		this.customer_name = customer_name;
	}
	
	public String getCustomer_Name() {
		return this.customer_name;
	}
	
	public void setPhone_Number(String phone_number) {
		this.phone_number = phone_number;
	}
	
	public String getPhone_Number() {
		return this.phone_number;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return this.address;
	}
}
