package com.training.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Testng 
 * @author Chinna.Putha
 *
 */
public class TestngExample7 {
	
	@Test
	public void loginToApplication() {
		System.out.println("login to application");
	}
	
	@Test
	public void loginToApplication2() {
		System.out.println("login to application2");
	}
	
	@BeforeMethod
	public void method1(){
		System.out.println("method1");
	}
	
	@AfterMethod
	public void method2(){
		System.out.println("method2");
	}
	
	@BeforeClass
	public void beforeClass1(){
		System.out.println("Before class");
	}
	
	@AfterClass
	public void AfterClass1(){
		System.out.println("After class");
	}
}
