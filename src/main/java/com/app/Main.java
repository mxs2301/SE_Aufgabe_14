package com.app;

public class Main{
	public static void main(String[] args) {
		Library_Management_System HFU = new Library_Management_System();
		Book B_eins = new Book("Faust","Goethe", 23, "Fuck Records");
		Book B_zwei = new Book("Schwestern", "McDonalds", 13,"O'Rileys");
		Book B_drei = new Book("Rain", "Weather", 20, "Speicher");
		HFU.DataBase.Add(B_eins);
		HFU.DataBase.Add(B_zwei);
		HFU.DataBase.Add(B_drei);


		User U_eins = new User("Max", 2301);
		User U_zwei = new User("Tonia", 2306);
		HFU.Register("Max", "1234", "Student");
		HFU.Register("Tonia", "4321", "Student");
		U_eins.Ausleihen(B_eins);
		U_eins.Ausleihen(B_zwei);
		HFU.DataBase.list_borrowed_books();
		U_eins.Ausgeliehenes();

	}
}