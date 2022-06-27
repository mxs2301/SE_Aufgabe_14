package com.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class Library_Management_System {

	//HashSet <String> username;
	HashMap<String, String> data;
	HashMap<String, String> order;
	Library_database DataBase;
	//private String userType;
	//private String username;
	//private String password;

	public Library_Management_System(String input){
		data = new HashMap<>();
		order = new HashMap<>();
		DataBase = new Library_database(input);
	}


	public void Login() {
		// TODO - implement Library_Management_System.Login
		throw new UnsupportedOperationException();
	}

	public void Register(String username, String password, String userType) {
		this.data.put(password, username);
		this.order.put(username, userType);
	}

	public void Logout() {
		// TODO - implement Library_Management_System.Logout
		throw new UnsupportedOperationException();
	}

}