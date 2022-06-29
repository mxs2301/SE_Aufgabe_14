package com.app;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Guten Tag User");
		System.out.print("Bitte erstellen Sie eine Tabelle indem sie eine Namen eingaben: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		Library_Management_System HFU = new Library_Management_System(input);
		Book B_eins = new Book("Faust", "Goethe", 23, "Fuck Records");
		Book B_zwei = new Book("Schwestern", "McDonalds", 13, "O'Rileys");
		Book B_drei = new Book("Rain", "Weather", 20, "Speicher");
		HFU.DataBase.Add(B_eins);
		HFU.DataBase.Add(B_zwei);
		HFU.DataBase.Add(B_drei);
		System.out.print("Bitte legen Sie einen User an: ");
		String doub = sc.nextLine();
		Integer num = 0;
		int stuff;
		stuff = num.valueOf(doub);
		User A = new User(doub, stuff);
		System.out.print("Möchten Sie ihren User registrieren Y/n?: ");
		input = sc.nextLine();
		if(input == "Y"){
			System.out.print("Geben Sie ein Passwort ein: ");
			String line = sc.nextLine();
			HFU.Register("User"+line, line, "Student");
			sc.close();
			Scanner scan = new Scanner(System.in);
			System.out.println("Nutzer wurde erfolgreich erstellt");
			System.out.println("Suchen Sie aus ob Sie Buch 1, 2 oder 3 ausleihen wollen.");
			num = scan.nextInt();
			switch(num){
			case 1:
				A.Ausleihen(B_eins);
				break;
			case 2:
				A.Ausleihen(B_zwei);
				break;
			case 3:
				A.Ausleihen(B_drei);
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}

			A.Ausgeliehenes();

			scan.close();

		}else{
			System.out.println("Auf wiedersehen!");
		}

		sc.close();

	}
}
/*
Library_Management_System HFU = new Library_Management_System("Bib_Daten");
		Book B_eins = new Book("Faust", "Goethe", 23, "Fuck Records");
		Book B_zwei = new Book("Schwestern", "McDonalds", 13, "O'Rileys");
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
		U_eins.Ausgeliehenes();*/