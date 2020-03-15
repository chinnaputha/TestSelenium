package com.training.testng;

import java.io.FileInputStream;
import java.util.Properties;
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

/**
 * Class to perform cross browser Testing 
 * Supplying input data from Config.prop file
 * @author Chinna.Putha
 *
 */
public class CrossBrowserTestExampleWithProperty {

	WebDriver driver;
	Properties config=null;

	@Test
	public void openApplication() throws Exception{
		config = new Properties();
		FileInputStream fis = new FileInputStream("prop\\Config.prop");
		config.load(fis);
		
		System.out.println("browser Type value-->"+config.get("browserType"));
		
	
		if(config.get("browserType").equals("Firefox")|| config.get("browserType").equals("FF")){
			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
			// FirefoxDriver implements WebDriver
			driver = new FirefoxDriver();
		} else if(config.get("browserType").equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			// ChromeDriver implements WebDriver
			driver = new ChromeDriver();
			
		} else {
			System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
			// internetexplorer implements WebDriver
			driver = new InternetExplorerDriver();
		}
		
		// get method - open the browser
		driver.get(config.getProperty("appURL"));
		// maximize the window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		if(config.get("browserType").equals("IE")) {
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
