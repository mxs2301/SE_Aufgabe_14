package com.app;

import java.util.ArrayList;

public class Account {

	private Boolean no_borrowed_books = false;
	private Boolean no_reserved_books = false;
	private Boolean no_returned_books = false;
	private Boolean no_lost_books = false;
	private int fine_amount = 0;
	private ArrayList<Book> data;

	public Account(){
		data = new ArrayList<>();
	}

	public void add(Book e){
		data.add(e);
	}

	public void Calculate_fine() {
		// TODO - implement Account.Calculate_fine
		throw new UnsupportedOperationException();
	}

	public void borrowed_books(){
		for(Book eingabe : data){
			System.out.println(eingabe.getName());
		}
	}

	public void switchBorroed_books(){
		if(no_borrowed_books == false)
			no_borrowed_books = true;
		else
			no_borrowed_books = false;
	}


}