package com.training.testng;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

/**
 * Testng methods will be executed based on priority from lowest to highest
 * @author Chinna.Putha
 *
 */
public class TestngExample4 {
	
	@Test(priority=2)
	public void bmethod2() {
		System.out.println("TestngExample2.metho2()");
	}
	
	@Test(priority=3)
	public void cmethod3() {
		System.out.println("TestngExample2.method3()");
	}
	
	@Test(priority=0)
	public void dmethod4() {
		System.out.println("TestngExample2.method4()");
	}
	
	@Test(priority=1)
	public void amethod1() {
		System.out.println("TestngExample2.method1()");
	}
	
	

}
