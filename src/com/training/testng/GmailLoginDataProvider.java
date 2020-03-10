package com.training.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.selenium.TestBaseUtil;

/**
 * Class for automate Gmail login using only xpath
 * 
 * @author Chinna.Putha
 *
 */
public class GmailLoginDataProvider extends TestBaseUtil {

	@Test(dataProvider = "tset") 
	public void loginToGmail(String username, String password) throws InterruptedException {
		lanuchBrowser("https://www.gmail.com/");
		System.out.println("username from dataprovider-->" + username);
		System.out.println("password from dataprovider-->" + password);
		driver.findElement(By.xpath("//input[@name='identifier']")).clear();
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys(username);
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 10); 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-label='Enter your password']")));

		driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys(password);
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		Thread.sleep(4000);// 4 secs sleep
		
		driver.close();

	}

	
	@DataProvider	
	public Object[][] tset() {
		// Rows - Number of times your test has to be repeated.
		// Columns - Number of parameters in test data.
		Object[][] data = new Object[4][2];

		// 1st row
		data[0][0] = "comprice.user";
		data[0][1] = "Comprice@123";

		// 2nd row
		data[1][0] = "javaselenium";
		data[1][1] = "Java";

		// 3rd row
		data[2][0] = "chinnareddy.putha";
		data[2][1] = "Java";

		// 4th row
		data[3][0] = "javatesting";
		data[3][1] = "Java";

		return data;
	}

}
