package com.training.testng;

import org.testng.annotations.Test;

/**
 * TestNG example using dependsOnMethods attribute
 * @author Chinna.Putha
 *
 */
public class TestNGExample1 {
	
	@Test
	public void loginToGmail(){
		int c=10/0;
		System.out.println("Login to Gmail");
	}
	
	
	@Test(dependsOnMethods="loginToGmail")
	public void composeEmail(){
		System.out.println("Email composed");
	}
	
	@Test(dependsOnMethods="composeEmail")
	public void logout(){
		System.out.println("logout");
	}

}
