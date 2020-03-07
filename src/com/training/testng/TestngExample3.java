package com.training.testng;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

/**
 * Testng methods not executed if set enabled = false
 * @author Chinna.Putha
 *
 */
public class TestngExample3 {
	
	@Test(alwaysRun = true)
	public void bmethod2() {
		System.out.println("TestngExample2.metho2()");
	}
	
	@Test
	public void cmethod3() {
		System.out.println("TestngExample2.method3()");
	}
	
	@Test(enabled = false)
	public void dmethod4() {
		System.out.println("TestngExample2.method4()");
	}
	
	@Test
	public void amethod1() {
		System.out.println("TestngExample2.method1()");
	}
	
	

}
