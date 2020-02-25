package com.training.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class WebDriverTest {

	public static void main(String[] args) {
		// set the chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		// FirefoxDriver implements WebDriver
		WebDriver driver = new ChromeDriver();

		// get method - open the browser
		driver.get("https://www.facebook.com/");

		// maximize the window
		driver.manage().window().maximize();

		// get the current url
		String currentURLname = driver.getCurrentUrl();
		System.out.println("current url -->" + currentURLname);

		// get the title of the window
		String title = driver.getTitle();
		System.out.println("Title of the window -->" + title);

		// get the page source
		String source = driver.getPageSource();
		System.out.println("page source -->" + source);

		// close the browser
		driver.close();

	}

}
