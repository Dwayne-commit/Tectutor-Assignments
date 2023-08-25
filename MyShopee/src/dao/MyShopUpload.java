package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import DataConnect.DataConnect;
import dto.Customer;
import dto.Item;
import dto.Purchase;

public class MyShopUpload {
	
	private Connection con;
	private PreparedStatement preStat;
	private Scanner sc;
	
	public MyShopUpload(){
		con = DataConnect.getConnect();
		sc = new Scanner(System.in);
	}
	
	public void storeItemDetails() {
		Item s=new Item();
		System.out.println("Enter Item Code ");
		s.setItem_Code(sc.next());
		System.out.println("Enter Item name ");
		s.setItem_Name(sc.next());
		System.out.println("Enter Item Price ");
		s.setItem_Price(sc.nextInt());
		System.out.println("Enter Qoh ");
		s.setQoh(sc.nextInt());
		try {
			preStat = con.prepareStatement("insert into item values(?,?,?,?)");
			preStat.setString(1,s.getItem_Code());
			preStat.setString(2, s.getItem_Name());
			preStat.setInt(3,s.getItem_Price());
			preStat.setInt(4,s.getQoh());
			int result=preStat.executeUpdate();
			if(result>0)
			{
				System.out.println("Data inserted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void storeCustomerDetails() {
		Customer s=new Customer();
		System.out.println("Enter Customer Code ");
		s.setCustomer_Code(sc.next());
		System.out.println("Enter Customer name ");
		s.setCustomer_Name(sc.next());
		System.out.println("Enter Phone Number ");
		s.setPhone_Number(sc.next());
		System.out.println("Enter Address ");
		s.setAddress(sc.next());
		try {
			preStat = con.prepareStatement("insert into customer values(?,?,?,?)");
			preStat.setString(1,s.getCustomer_Code());
			preStat.setString(2, s.getCustomer_Name());
			preStat.setString(3,s.getPhone_Number());
			preStat.setString(4,s.getAddress());
			int result=preStat.executeUpdate();
			if(result>0)
			{
				System.out.println("Data inserted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void customerDetails(String customer_id) {
		try {
			preStat = con.prepareStatement("select * from customer where customer_code = ?");
			preStat.setString(1, customer_id);
			ResultSet result=preStat.executeQuery();
			while(result.next())
			{
				System.out.println("Customer Code is "+result.getString(1));
				System.out.println("Customer name is "+result.getString(2));
				System.out.println("Phone Number is " + result.getString(3));
				System.out.println("Address is " + result.getString(4));
				System.out.println();
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void purchaseDetails() {
		Purchase s=new Purchase();
		LocalDate da = LocalDate.now();
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
		//String formattedString = da.format(formatter);
		System.out.println("Enter Transaction ID ");
		s.setTransaction_Id(sc.next());
		System.out.println("Enter Customer Code ");
		s.setCustomer_Code(sc.next());
		System.out.println("Enter Item Code ");
		s.setItem_Code(sc.next());
		//s.setDate(da);
		System.out.println("Enter Quantity ");
		s.setQuantity(sc.nextInt());
		try {
			preStat = con.prepareStatement("insert into purchase values(?,?,?,?,?)");
			preStat.setString(1,s.getTransaction_Id());
			preStat.setString(2, s.getCustomer_Code());
			preStat.setString(3,s.getItem_Code());
			preStat.setDate(4, Date.valueOf(da));
			preStat.setInt(5,s.getQuantity());
			int result=preStat.executeUpdate();
			if(result>0)
			{
				System.out.println("Data inserted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void puchaseDetailss(String customer_id) {
		try {
			preStat = con.prepareStatement("select * from purchase where customer_code = ?");
			preStat.setString(1, customer_id);
			ResultSet result=preStat.executeQuery();
			while(result.next())
			{
				System.out.println("Customer Code is "+result.getString(2));
				System.out.println("Item Code is "+result.getString(3));
				System.out.println("Quantity is " + result.getInt(4));
				System.out.println();
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void displayItems() {
		try {
			preStat = con.prepareStatement("select * from item");
			ResultSet result=preStat.executeQuery();
			while(result.next())
			{
				System.out.println("Item_Code is "+result.getString(1));
				System.out.println("Item_Name is "+result.getString(2));
				System.out.println("Item_Price is " + result.getInt(3));
				System.out.println("QOH is " + result.getInt(4));
				System.out.println();
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
