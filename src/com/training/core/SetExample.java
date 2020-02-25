package com.training.core;
import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> al = new HashSet<String>();
		al.add("java");
		al.add("selenium");
		al.add("TestNG");
		al.add("Apache POI");
		al.add("java");
		
		
		System.out.println("set of values-->"+al.size());
		System.out.println("set of values-->"+al);
		
		
		
		

	}

}
