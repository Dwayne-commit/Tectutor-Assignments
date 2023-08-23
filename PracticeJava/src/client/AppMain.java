package client;

import UserService.UserService;

public class AppMain {
	public static void main(String[] args) {
		UserService userService = new UserService();
		userService.login();
	}

}
