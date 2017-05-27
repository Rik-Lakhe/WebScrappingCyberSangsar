package com.mercinaries.webcybersangsarscrapper;
//import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.io.InputStreamReader;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.mercinaries.webcybersangsarscrapper.dao.ModelDAO;
import com.mercinaries.webcybersangsarscrapper.daoimpl.ModelDAOImpl;
import com.mercinaries.webcybersangsarscrapper.entity.Model;
import com.mercinaries.webcybersangsarscrapper.scrapper.Grabber;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder modelcont = new StringBuilder();
		List<Model> modelList= new ArrayList<>();
		int i =1;
		try {
			String box = Grabber.grab();
//			String regEx = "https://(.*?).jpg";
			String regEx = "<option value=(\\w{3}.*?)>\\r\\n\\s*(.*?)</option>";
			Pattern pattern = Pattern.compile(regEx);
			Matcher match = pattern.matcher(box);
			while(match.find()){
				
				Model m = new Model();
				String id = match.group(1);
				String name = match.group(2);
//				System.out.println(i +".   "+"ID :"+id + "Name :"+name);
				m.setId(id);
				m.setNumb(i);
//				System.out.println();
				m.setname(name);
				i++;
				modelList.add(m);
			}

			System.out.println("Saving all models data.......");
            for (Model cus : modelList) {
                modelcont.append(cus);
            }
            fileWrite.write(modelcont.toString());
            System.out.println("DONE!");
            
//            System.out.println("Welcome to Cybersangsar : \n"
//            		+ "1. Show all models \n"
//            		+ "2. Select a model \n");
            
            
            System.out.println(modelcont.toString());
            String content = Grabber.post("http://cybersansar.com/result_search.php","mname="+);
            System.out.println(content);
//            int cho = input.nextInt();
//            for (Model cu : modelList) {
//    			if (cho == cu.getNumb()) {
//    				System.out.println(cu);
//    				String content = Grabber.post("http://cybersansar.com/result_search.php","mname=315");
//    				System.out.println(content);
//    			}
//
//    		}
            
            
            
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		

	}

}
