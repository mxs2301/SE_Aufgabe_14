package com.app;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Sql {

	public static void create(String input){
		try{
		File myObj = new File("/home/max/Documents/Git/SE_Aufgabe_14/TXT/" + input);
		if(myObj.createNewFile()){
			System.out.println("Datenbank: " + myObj.getName()+ "wurde erstellt");
		}else{
			System.out.println("Datenbank "+myObj.getName()+ " wurde bereits erstellt");
		}
	} catch(IOException e){
		System.out.println("Fehler, irgendetwas ging schief");
		e.printStackTrace();
	}
}

	public static void write(String input, String Name) {
		try {
			FileWriter myWriter = new FileWriter("/home/max/Documents/Git/SE_Aufgabe_14/TXT/" + Name);
			myWriter.write(input);
			myWriter.close();
		} catch (IOException e) {
			System.out.println("Fehler, irgendetwas ging schief");
			e.printStackTrace();
		}
	}

}