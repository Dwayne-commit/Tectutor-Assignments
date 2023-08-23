package UserDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Connection.DataConnect;

public class UserDAO {
	private Connection con;
	private PreparedStatement preStat;
	
	public UserDAO(){
		con = DataConnect.getConnect();
		
	}
	
	public void verify(String uname, String pass) {
		try {
		preStat = con.prepareStatement("select * from users where username = ? and password = ?");
		preStat.setString(1, uname);
		preStat.setString(2, pass);
		ResultSet rs = preStat.executeQuery();
		if(rs.next()) {
			System.out.println("LOGIN SUCCESSFUL");
		}
		}catch(Exception e) {
			System.out.println("WRONG USERNAME OR PASSWORD");
			e.printStackTrace();
		}
	}
	
}
