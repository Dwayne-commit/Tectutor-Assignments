package UserService;
import dto.Department;
import dto.Employee;

import java.util.Scanner;

import UserDAO.UserDAO;

public class UserService {
	
	private Scanner sc;
	private Scanner scan;
	private UserDAO userDAO;
	
	public UserService() {
		sc = new Scanner(System.in);
		scan = new Scanner(System.in);
		userDAO = new UserDAO();
	}
	
	public void login() {
		System.out.println("ENTER USERNAME");
		String uname = sc.nextLine();
		System.out.println("ENTER PASSWORD");
		String pass = sc.nextLine();
		userDAO.verify(uname, pass);
	}
	
	public void insertDept() {
		Department s = new Department();
		System.out.println("Enter Deptrment id ");
		s.setDeptId(sc.nextInt());
		System.out.println("Enter Department Name ");
		s.setDeptName(sc.next());
		System.out.println("Enter Department Head ");
		s.setDeptHead(sc.next());
		System.out.println("Enter Department Description ");
		s.setDeptDesc(sc.next());
		userDAO.insertDept(s);
	}
	
	public void insertEmp() {
		Employee s = new Employee();
		System.out.println("Enter Employee id ");
		s.setEmpId(sc.nextInt());
		System.out.println("Enter Employee Name ");
		s.setEmpName(sc.next());
		System.out.println("Enter Employee Address ");
		s.setEmpAddress(sc.next());
		System.out.println("Enter Salary ");
		s.setSalary(scan.nextDouble());
		System.out.println("Enter Contact");
		s.setContact(scan.nextLong());
		System.out.println("Department ID");
		s.setDeptId(s.getDeptId());
		userDAO.insertEmp(s);
	}
	
	public void displayDept() {
		userDAO.disDept();
	}
	
	public void displayEmp() {
		userDAO.disEmp();
	}
}
