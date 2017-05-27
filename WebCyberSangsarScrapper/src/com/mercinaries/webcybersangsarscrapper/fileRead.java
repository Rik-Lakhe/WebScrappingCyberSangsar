package com.mercinaries.webcybersangsarscrapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileRead {
	public static void read() throws IOException{
		BufferedReader file1 = new BufferedReader(new FileReader("d:/javatest/cybersang/models.txt"));
		
		String line="";
		try {
			while((line=file1.readLine())!= null){
				System.out.println(line);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

