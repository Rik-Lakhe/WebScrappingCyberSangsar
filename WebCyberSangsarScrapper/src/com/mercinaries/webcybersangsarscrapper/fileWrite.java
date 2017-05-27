package com.mercinaries.webcybersangsarscrapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileWrite {
	public static void write(String modelcontent) throws IOException{
		File file1 = new File("d:/javatest/cybersang/");
		if(!file1.isDirectory()){
			file1.mkdirs();
		}
		
		FileWriter writer = new FileWriter("d:/javatest/cybersang/models.txt");
			writer.write(modelcontent);
			writer.close();
		
		
	}
}

