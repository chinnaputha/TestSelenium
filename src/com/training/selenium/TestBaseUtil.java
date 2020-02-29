package com.training.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseUtil {
	static WebDriver driver;

	public static  void lanuchBrowser(String url) {
		// set the chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		// FirefoxDriver implements WebDriver
		 driver = new ChromeDriver();

		// get method - open the browser
		driver.get(url);

		// maximize the window
		driver.manage().window().maximize();
	}

}
