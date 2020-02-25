package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Class for automate Gmail login using only cssSelector
 * @author Chinna.Putha
 *
 */
public class GmailLoginUsingCSS {

	public static void main(String[] args) throws InterruptedException {
		// set the chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		// FirefoxDriver implements WebDriver
		WebDriver driver = new ChromeDriver();

		// get method - open the browser
		driver.get("https://www.gmail.com/");

		// maximize the window
		driver.manage().window().maximize();
		
		
		driver.findElement(By.cssSelector("input[name='identifier']")).sendKeys("seleniumautomation021");
		driver.findElement(By.cssSelector("div[id='identifierNext']	")).click();
		Thread.sleep(4000);//4 secs sleep
		driver.findElement(By.cssSelector("input[aria-label='Enter your password']")).sendKeys("sharukkajol");
		driver.findElement(By.cssSelector("div#passwordNext")).click();
		
		
		

	}

}
