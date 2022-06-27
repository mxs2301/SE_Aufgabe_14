package com.app;

import java.util.ArrayList;
import java.util.HashMap;


public class Library_database {
	private ArrayList<Book> list_of_books;
	

	public Library_database(){
		list_of_books = new ArrayList<>();
	}

	public void Add(Book e) {
		list_of_books.add(e);
	}

	public void Delete(Book e) {
		list_of_books.remove(e);
	}

	public void Update() {
		// TODO - implement Library_database.Update
		throw new UnsupportedOperationException();
	}

	public void Display(int BookID) {
		System.out.println(list_of_books.get(BookID));
	}

	public void list_borrowed_books(){
		for(int i = 0; i<list_of_books.size(); i++){
			if(list_of_books.get(i).getBorrowed() == true){
				System.out.println(list_of_books.get(i).getName() + " wurde ausgeliehen");
			}
		}
	}

	public boolean Search(String Name) {
		
		for(int i = 0; i<list_of_books.size(); i++){
			if(list_of_books.get(i).getName() == Name){
				System.out.println("Treffer");
				return true;
			}
		}

			return false;

	}

}