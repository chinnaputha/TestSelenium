package com.training.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Class for perform WebElement operations
 * 
 * @author Chinna.Putha
 *
 */
public class WebElementExample {

	public static void main(String[] args) throws InterruptedException {
		// set the chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		// FirefoxDriver implements WebDriver
		WebDriver driver = new ChromeDriver();

		// get method - open the browser
		driver.get("https://www.gmail.com/");

		// maximize the window
		driver.manage().window().maximize();
		
		/*driver.findElement(By.id("identifierId")).sendKeys("comprice.user@gmail.com");
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("comprice.user@gmail.com");
		driver.findElement(By.id("identifierNext")).click();*/
		
		// name='identifier'
		driver.findElement(By.name("identifier")).sendKeys("comprice.user@gmail.com");
		
		// id='identifier'
		driver.findElement(By.name("identifier")).clear();
		
		
		driver.findElement(By.id("identifierId")).sendKeys("comprice.user@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		
		
		List<WebElement> al =driver.findElements(By.tagName("a"));
	
		System.out.println(al.size());
		
		Thread.sleep(4000);
		
		driver.close();

	}

}
