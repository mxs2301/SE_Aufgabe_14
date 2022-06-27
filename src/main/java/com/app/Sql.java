package com.app;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


public class Sql{

	public static void create(String input){
		try{
		File myObj = new File("/home/max/Documents/Git/SE_Aufgabe_14/TXT/Date.txt");
		if(myObj.createNewFile()){
			System.out.println("File created: "+ myObj.getName());
		}else{
			System.out.println("Wurde schon gemacht");
		}
	} catch(IOException e){
		System.out.println("Fuck da ging was schief");
		e.printStackTrace();
	}

	try{
			FileWriter myWriter = new FileWriter("/home/max/Documents/Git/SE_Aufgabe_14/TXT/Date.txt");
			myWriter.write(input);
			myWriter.close();
	}catch(IOException e){
		System.out.println("Fuck that shit");
		e.printStackTrace();
	}
	}


}