package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Class for automate Gmail login using only xpath
 * @author Chinna.Putha
 *
 */
public class KeyboardEventsWithEnter {

	public static void main(String[] args) throws InterruptedException {
		// set the chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		// FirefoxDriver implements WebDriver
		WebDriver driver = new ChromeDriver();

		// get method - open the browser
		driver.get("https://www.gmail.com/");

		// maximize the window
		driver.manage().window().maximize();
		
		
		//Enter gmail userna,e
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("seleniumautomation021");
		
		/*Actions action = new Actions(driver); 
		action.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();*/
		
		//Click on ENTER from keyboard
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);//4 secs sleep
		//driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		
		driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("asdfasdfsdf");
		//Click on ENTER key in password field
		driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		Thread.sleep(4000);//4 secs sleep
		
		String errMsg = driver.findElement(By.xpath("(//div[@aria-live='assertive'])[1]/div[2]/span")).getText();
		System.out.println("Error message -->"+errMsg);
		
		
		
		if(errMsg.equals("Try again or click Forgot password to reset it.")){
			System.out.println("Error message displayed correctly");
		} else {
			System.out.println("Error message displayed wrongly");
		}
		
		
		

	}

}
