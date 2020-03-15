package com.training.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTestExample {

	WebDriver driver;

	@Test
	@Parameters("browserName")
	public void openApplication(String  browserName) {
		
		if(browserName.equalsIgnoreCase("Firefox")|| browserName.equalsIgnoreCase("FF")){
			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
			// FirefoxDriver implements WebDriver
			driver = new FirefoxDriver();
		} else if(browserName.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			// ChromeDriver implements WebDriver
			driver = new ChromeDriver();
			
		} else {
			System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
			// internetexplorer implements WebDriver
			driver = new InternetExplorerDriver();
		}
		
		// get method - open the browser
		driver.get("https://www.gmail.com/");
		// maximize the window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		if(browserName.equalsIgnoreCase("IE")) {
			WebElement ele = driver.findElement(By.cssSelector("a[ga-event-action='sign in']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", ele);
		}

		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("javaselenium");
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();

		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-label='Enter your password']")));

		driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("afss");
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		
		driver.close();

	}

}
