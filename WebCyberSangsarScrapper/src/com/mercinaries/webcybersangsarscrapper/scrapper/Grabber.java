package com.mercinaries.webcybersangsarscrapper.scrapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class Grabber {

	
	public static String grab() throws IOException{
		URL url = new URL ("http://cybersansar.com/model_main.php");
		URLConnection conn = url.openConnection();
		BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String line = "";
		StringBuilder content = new StringBuilder();
		while((line = reader.readLine())!= null){
			content.append(line+"\r\n");
		}
//		System.out.println(content);
		return content.toString();
	}
	
	public static String post(String link,String id) throws IOException{
		URL url = new URL (link);
		HttpURLConnection conn =(HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.getOutputStream().write(id.getBytes());
		BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String line = "";
		StringBuilder content = new StringBuilder();
		while((line = reader.readLine())!= null){
			content.append(line+"\r\n");
		}
//		System.out.println(content);
		return content.toString();
	}
	
	
	
	
}
