package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsExampleMouseover extends TestBaseUtil{
	
	public static void main(String[] args) throws InterruptedException {
		lanuchBrowser("http://demo.automationtesting.in/Register.html");
		
		WebElement ele = driver.findElement(By.linkText("SwitchTo"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		
		Thread.sleep(4000);
		
		
	
	}

}
