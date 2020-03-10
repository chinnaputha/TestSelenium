package com.training.testng;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.training.selenium.TestBaseUtil;

/**
 * Class for automate Gmail login using only xpath
 * 
 * @author Chinna.Putha
 *
 */
public class GmailLoginDatadriven extends TestBaseUtil {

	@Test
	@Parameters({"username","password"})
	public void loginToGmail(String username,String password) throws InterruptedException {
		lanuchBrowser("https://www.gmail.com/");
		System.out.println("username from xml-->"+username);
		System.out.println("password from xml-->"+password);
		driver.findElement(By.xpath("//input[@name='identifier']")).clear();
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys(username);
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		Thread.sleep(4000);// 4 secs sleep
		driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys(password);
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		Thread.sleep(4000);// 4 secs sleep

	}
	
	@AfterTest
	public static void closeBrowsr(){
		driver.close();
	}

}
