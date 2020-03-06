package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsExampleDragandDrop2 extends TestBaseUtil {

	public static void main(String[] args) throws InterruptedException {
		lanuchBrowser("https://demoqa.com/droppable/");

		Actions act = new Actions(driver);

		WebElement srcElement = driver.findElement(By.cssSelector("div#draggable"));
		WebElement targetElement = driver.findElement(By.cssSelector("div#droppable"));

		act.dragAndDrop(srcElement, targetElement).build().perform();

		Thread.sleep(4000);

	}

}
