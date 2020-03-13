package com.training.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.training.selenium.TestBaseUtil;

/**
 * Class for perform Javascript opeartions  such as click, scroll..etc
 * @author Chinna.Putha
 *
 */
public class JSOperationsTest extends TestBaseUtil{
	
	
	@Test
	public void openApp() throws InterruptedException{
		TestBaseUtil.lanuchBrowser("https://www.hdfc.com/");
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='HDFC Group']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String title= (String) js.executeScript("return document.title");
		
		System.out.println("Page title-->"+title);
		
		System.out.println("Page titlee -->"+driver.getTitle());
		
	
		//This will scroll the page Horizontally till the element is found
		js.executeScript("arguments[0].scrollIntoView();", ele);
		Thread.sleep(4000);
		//javascript click
		js.executeScript("arguments[0].click();", ele);
		
		Thread.sleep(2000);
		
		
		//driver.navigate().refresh();
		//refresh page using javascript
		js.executeScript("history.go[0];");
		
		Thread.sleep(2000);
		
		
		driver.close();
		
		
		
		//ele.click();
		
	}

}
