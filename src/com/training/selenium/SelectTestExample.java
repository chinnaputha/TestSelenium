package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectTestExample extends TestBaseUtil {

	public static void main(String[] args) throws InterruptedException {
		lanuchBrowser("http://demo.automationtesting.in/Register.html");
		WebElement  ele = driver.findElement(By.cssSelector("select[id='Skills']"));
		Select ses = new Select(ele);
		//using index postion
		ses.selectByIndex(3);//Analytics
		Thread.sleep(2000);
		
		//using option value
		ses.selectByValue("Art Design");
		Thread.sleep(2000);
		
		
		//select using visible text
		ses.selectByVisibleText("Adobe InDesign");
		Thread.sleep(2000);
	}

}
