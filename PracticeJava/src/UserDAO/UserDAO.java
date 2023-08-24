package UserDAO;
import dto.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Connection.DataConnect;
import dto.Department;
import dto.Department;
public class UserDAO {
	private Connection con;
	private PreparedStatement preStat;
	private Scanner sc;
	
	public UserDAO(){
		con = DataConnect.getConnect();
		sc = new Scanner(System.in);
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
	
	public void insertDept(Department d) {
		try
		{
		preStat=con.prepareStatement("insert into department values(?,?,?,?)");
		preStat.setInt(1,d.getDeptId());
		preStat.setString(2, d.getDeptName());
		preStat.setString(3,d.getDeptHead());
		preStat.setString(4,d.getDeptDesc());
		int result=preStat.executeUpdate();
		if(result>0)
		{
			System.out.println("Data inserted");
		}
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void insertEmp(Employee e) {
		try
		{
		preStat=con.prepareStatement("insert into employee values(?,?,?,?,?,?)");
		preStat.setInt(1,e.getEmpId());
		preStat.setString(2, e.getEmpName());
		preStat.setString(3,e.getEmpAddress());
		preStat.setDouble(4,e.getSalary());
		preStat.setLong(5,e.getContact());
		preStat.setInt(6,e.getDeptId());
		int result=preStat.executeUpdate();
		if(result>0)
		{
			System.out.println("Data inserted");
		}
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void disDept() {
		try
		{
		preStat=con.prepareStatement("select * from department");
		ResultSet result=preStat.executeQuery();
		while(result.next())
		{
			System.out.println("Department id is " + result.getInt(1));
			System.out.println("Department name is " + result.getString(2));
			System.out.println("Department head is " + result.getString(3));
			System.out.println("Department description is " + result.getString(4));
			System.out.println();
			
		}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void disEmp() {
		try
		{
		preStat=con.prepareStatement("select * from employee");
		ResultSet result=preStat.executeQuery();
		while(result.next())
		{
			System.out.println("Employee id is " + result.getInt(1));
			System.out.println("Employee name is " + result.getString(2));
			System.out.println("Employee Address is " + result.getString(3));
			System.out.println("Salary is " + result.getDouble(4));
			System.out.println("Contact is " + result.getLong(5));
			System.out.println("Department Id is " + result.getInt(6));
			System.out.println();
			
		}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
