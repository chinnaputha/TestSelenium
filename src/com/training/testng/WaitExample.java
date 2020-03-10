package com.training.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitExample {
	WebDriver driver;
	
	@Test
	public void loginToGmail(){
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		// FirefoxDriver implements WebDriver
		 driver = new ChromeDriver();
		// get method - open the browser
		driver.get("https://www.gmail.com/");
		// maximize the window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("javaselenium");
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-label='Enter your password']")));
		
		driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("afss");
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		
	}

}
