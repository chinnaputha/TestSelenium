package com.training.testng;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

/**
 * Testng methods will be executed based on alphabetical order
 * @author Chinna.Putha
 *
 */
public class TestngExample2 {
	
	@Test
	public void bmethod2() {
		System.out.println("TestngExample2.metho2()");
	}
	
	@Test
	public void cmethod3() {
		System.out.println("TestngExample2.method3()");
	}
	
	@Test
	public void dmethod4() {
		System.out.println("TestngExample2.method4()");
	}
	
	@Test
	public void amethod1() {
		System.out.println("TestngExample2.method1()");
	}
	
	

}
