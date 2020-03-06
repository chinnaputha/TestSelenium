package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsExampleDragandDrop extends TestBaseUtil{
	
	public static void main(String[] args) throws InterruptedException {
		lanuchBrowser("http://demo.automationtesting.in/Register.html");
		
		WebElement ele = driver.findElement(By.linkText("Interactions"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();//mouser over on Intercations
		
		WebElement ele2 = driver.findElement(By.linkText("Drag and Drop"));
		act.moveToElement(ele2).build().perform();////mouser over on Drag and Drop
		
		driver.findElement(By.linkText("Dynamic")).click();
		Thread.sleep(4000);
		
		WebElement srcElement = driver.findElement(By.cssSelector("img#angular"));
		WebElement targetElement = driver.findElement(By.cssSelector("div#droparea"));
		
		
		act.dragAndDrop(srcElement, targetElement).build().perform();
		
		Thread.sleep(4000);
		
		
	
	}

}
