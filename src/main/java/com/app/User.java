package com.app;

import java.util.ArrayList;

public class User {
	private Account ac;
	private String name;
	private int id;

	public User(String name, int id){
		this.name = name;
		this.id = id;
		ac = new Account();
	}

	public boolean Verify(int id) {
		if(this.id == id)
			return true;
		else
			return false;
	}

	public void Ausleihen(Book e){
		e.switchBorrowed();
		ac.add(e);
	}

	public void Ausgeliehenes(){

		System.out.println("Folgende Bücher wurden ausgeliehen: ");
		ac.borrowed_books();
	}

	public void CheckAccount() {
		// TODO - implement User.CheckAccount
		throw new UnsupportedOperationException();
	}

	public void get_book_info() {
		// TODO - implement User.get_book_info
		throw new UnsupportedOperationException();
	}

}