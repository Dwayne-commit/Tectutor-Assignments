package Service;

import java.util.Scanner;

import dao.ConcessionMyShop;
import dao.MyShopUpload;

public class ShopService {
	
	private Scanner sc;
	private MyShopUpload myShop;
	public ShopService()
	{
		sc=new Scanner(System.in);
		myShop=new MyShopUpload();
	}
	
	public void insertItem() {
		myShop.storeItemDetails();
	}
	
	public void displayItem() {
		myShop.displayItems();
	}
	
	public void insertCustomer() {
		myShop.storeCustomerDetails();
	}
	
	public void displayCustomer() {
		System.out.println("Enter Customer Code: ");
		String cus = sc.nextLine();
		myShop.customerDetails(cus);
	}
	
	public void insertTransactions() {
		myShop.purchaseDetails();
	}
	
	public void displayPurchases() {
		System.out.println("Enter Customer Code: ");
		String cus = sc.nextLine();
		myShop.puchaseDetailss(cus);
	}
	
	public void updateItem() {
		System.out.println("Enter Item Code: ");
		String itc = sc.nextLine();
		ConcessionMyShop myc = new ConcessionMyShop();
		myc.calculateConcession(itc);
	}

}
