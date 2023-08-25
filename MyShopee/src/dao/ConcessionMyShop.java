package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.CallableStatement;

import DataConnect.DataConnect;

public class ConcessionMyShop {
	
	private Connection con;
	private CallableStatement cs;
	private PreparedStatement preStat;
	private Scanner sc;
	
	public ConcessionMyShop(){
		con = DataConnect.getConnect();
		sc = new Scanner(System.in);
	}
	
	public void calculateConcession(String item_id) {
		try {
			System.out.println("Enter Item Price");
			int itp = sc.nextInt();
			System.out.println("Enter Item Code");
			String its = sc.nextLine();
			cs = (CallableStatement) con.prepareCall("{call updatePrice(?,?)}");
			cs.setString(1, its);
			cs.setInt(2,itp);
			cs.executeUpdate();
			System.out.println("Concession Price: " + cs.getInt(1));
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		try {
			preStat = con.prepareStatement("select * from item where item_code = ?");
			preStat.setString(1, item_id);
			ResultSet result=preStat.executeQuery();
			while(result.next())
			{
				System.out.println("Item Code is "+result.getString(1));
				System.out.println("Item name is "+result.getString(2));
				System.out.println("Item Price is " + result.getInt(3));
				System.out.println("Qoh is " + result.getInt(4));
				System.out.println();
				
			}
		}catch(SQLException e) {
			e.printStackTrace();;
		}
	}

}
