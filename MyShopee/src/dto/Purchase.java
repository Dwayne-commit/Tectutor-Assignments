package dto;

import java.time.LocalDate;

public class Purchase {
	
	private String transaction_id;
	private String customer_code;
	private String item_code;
	private LocalDate date;
	private int quantity;
	
	public Purchase() {}
	
	public Purchase(String transaction_id, String customer_code, String item_code, LocalDate date, int qunatity) {
		this.transaction_id = transaction_id;
		this.customer_code = customer_code;
		this.item_code = item_code;
		this.date = date;
		this.quantity = quantity;
	}
	
	public void setTransaction_Id(String transaction_id) {
		this.transaction_id  = transaction_id;
	}
	
	public String getTransaction_Id() {
		return this.transaction_id;
	}
	
	public void setCustomer_Code(String customer_code) {
		this.customer_code = customer_code;
	}
	
	public String getCustomer_Code() {
		return this.customer_code;
	}
	
	public void setItem_Code(String item_code) {
		this.item_code = item_code;
	}
	
	public String getItem_Code() {
		return this.item_code;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public LocalDate getDate() {
		return this.date;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return this.quantity;
	}

}
