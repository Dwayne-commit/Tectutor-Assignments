package dto;

public class Item {
	private String item_code;
	private String item_name;
	private int item_price;
	private int qoh;
	
	public Item() {}
	
	public Item(String item_code, String item_name, int item_price, int qoh) {
		this.item_code = item_code;
		this.item_name = item_name;
		this.item_price = item_price;
		this.qoh = qoh;
	}
	
	public void setItem_Code(String item_code) {
		this.item_code = item_code;
	}
	
	public String getItem_Code() {
		return this.item_code;
	}
	
	public void setItem_Name(String item_name) {
		this.item_name = item_name;
	}
	
	public String getItem_Name() {
		return this.item_name;
	}
	
	public void setItem_Price(int item_price) {
		this.item_price = item_price;
	}
	
	public int getItem_Price() {
		return this.item_price;
	}
	
	public void setQoh(int qoh) {
		this.qoh = qoh;
	}
	
	public int getQoh() {
		return this.qoh;
	}
}
