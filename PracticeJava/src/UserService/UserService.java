package UserService;

import java.util.Scanner;

import UserDAO.UserDAO;

public class UserService {
	
	private Scanner sc;
	private UserDAO userDAO;
	
	public UserService() {
		sc = new Scanner(System.in);
		userDAO = new UserDAO();
	}
	
	public void login() {
		System.out.println("ENTER USERNAME");
		String uname = sc.nextLine();
		System.out.println("ENTER PASSWORD");
		String pass = sc.nextLine();
		userDAO.verify(uname, pass);
	}

}
