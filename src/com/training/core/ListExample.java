package com.training.core;
import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("java");
		al.add("selenium");
		al.add("TestNG");
		al.add("Apache POI");
		al.add("java");
		
		
		System.out.println("list of values-->"+al.size());
		System.out.println("list of values-->"+al);
		System.out.println("get the value-->"+al.get(1));
		
		//ArrayList<String> al2 = new ArrayList<>();
		//WebDriver driver = new ChromeDriver();
		//ChromeDriver driver2 = new ChromeDriver();
		
		

	}

}
