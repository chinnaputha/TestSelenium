package com.training.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Class to get list of tags in webpage
 * 
 * @author Chinna.Putha
 *
 */
public class ElementsExample extends TestBaseUtil {

	public static void main(String[] args) throws Exception {
		lanuchBrowser("http://demo.automationtesting.in/Register.html");

		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type ='checkbox']")); // 3
		List<WebElement> radiobuttons = driver.findElements(By.xpath("//input[@type ='radio']"));// 2

		List<WebElement> textarea = driver.findElements(By.tagName("textarea"));// 1

		List<WebElement> allInputTags = driver.findElements(By.tagName("input"));// 12

		List<WebElement> textBoxes = driver.findElements(By.xpath("//input[@type ='text']"));// 2

		List<WebElement> passwords = driver.findElements(By.xpath("//input[@type ='password']"));// 2
		List<WebElement> buttons = driver.findElements(By.tagName("button"));// 2

		System.out.println("Total checkboxes-->" + checkboxes.size());
		System.out.println("Total radiobuttons-->" + radiobuttons.size());
		System.out.println("Total textBoxes-->" + textBoxes.size());
		System.out.println("Total passwords-->" + passwords.size());
		System.out.println("Total buttons-->" + buttons.size());
		
		System.out.println("Total textarea-->" + textarea.size());
		System.out.println("Total input tags -->" + allInputTags.size());
		
		Thread.sleep(4000);

		closeBrowser();

	}

}
