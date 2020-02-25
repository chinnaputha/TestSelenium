package com.training.core;

/**
 * Class for perform Add operation
 * 
 * @author Chinna.Putha
 *
 */
public class Test {

	/**
	 * Method for add
	 */
	public void add() {
		int a = 10;
		int b = 20;
		int c = a / b;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Test t = new Test();
		t.add();
		t.clone();

	}

}
