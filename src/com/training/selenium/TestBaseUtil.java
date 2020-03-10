package com.training.selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseUtil {
	public  static WebDriver driver=null;

	/**
	 * method for launch broswer 
	 * @param url
	 */
	public static   void lanuchBrowser(String url) {
		// set the chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		// FirefoxDriver implements WebDriver
		 driver = new ChromeDriver();

		// get method - open the browser
		driver.get(url);

		// maximize the window
		driver.manage().window().maximize();
	}
	
	
	//@AfterSuite
	public static void closeBrowser(){
		driver.quit();
	}
	
	public  static void captureScreenshot() throws Exception {
		String random=RandomStringUtils.randomNumeric(4);
		File source_file = (File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source_file, new File("images\\screenshot"+random+".png"));
	}
	
	
	

}
