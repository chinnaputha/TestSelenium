package com.training.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.selenium.TestBaseUtil;

public class SaucelabsExampleTest extends TestBaseUtil{
	
	/**
	 * Open Application in Saucelabs
	 */
	@org.testng.annotations.Test
	public void openAppinSaucelabs()throws Exception{
		runOnSauceLabsFromLocal("Mac", "Safari");
		driver.get("https://www.gmail.com/");
		// maximize the window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("Comprice.user");
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();

		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-label='Enter your password']")));
		captureScreenshot();
		driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("Comprice@123");
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		
		driver.close();
		
	}
	
	

}
