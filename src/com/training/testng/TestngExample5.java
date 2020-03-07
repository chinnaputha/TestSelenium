package com.training.testng;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

/**
 * Testng methods not executed if set enabled = false
 * @author Chinna.Putha
 *
 */
public class TestngExample5 {
	
	@Test(invocationCount = 2)
	public void loginToApplication() {
		System.out.println("login to application");
	}

}
