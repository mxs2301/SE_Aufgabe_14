package com.app;

public class Book {

	private String title;
	private String author;
	private int isbn;
	private String publication;
	private boolean borrowed = false;


	public Book(String title, String author, int isbn, String publication){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.publication = publication;
	}

	public void Show_duedate() {
		// TODO - implement Book.Show_duedate
		throw new UnsupportedOperationException();
	}

	public void Reservation_status() {
		// TODO - implement Book.Reservation_status
		throw new UnsupportedOperationException();
	}

	public void Feedback() {
		// TODO - implement Book.Feedback
		throw new UnsupportedOperationException();
	}

	public void Book_request() {
		// TODO - implement Book.Book_request
		throw new UnsupportedOperationException();
	}

	public void Renew_info() {
		// TODO - implement Book.Renew_info
		throw new UnsupportedOperationException();
	}

	public String getName(){
		return title;
	}

	public void switchBorrowed(){
		if(borrowed == false){
			borrowed = true;
		}else{
			borrowed = false;
		}
	}

	public boolean getBorrowed(){
		return borrowed;
	}

	public int getISBN(){
		return isbn;
	}

}