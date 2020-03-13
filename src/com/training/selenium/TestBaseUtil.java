package com.training.selenium;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * @author Chinna.Putha
 *
 */
/**
 * @author Chinna.Putha
 *
 */
/**
 * @author Chinna.Putha
 *
 */
public class TestBaseUtil {
	public static WebDriver driver = null;

	/**
	 * method for launch broswer
	 * 
	 * @param url
	 */
	public static void lanuchBrowser(String url) {
		// set the chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		// FirefoxDriver implements WebDriver
		driver = new ChromeDriver();

		// get method - open the browser
		driver.get(url);

		// maximize the window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	// @AfterSuite
	public static void closeBrowser() {
		driver.quit();
	}

	public static void captureScreenshot() throws Exception {
		String random = RandomStringUtils.randomNumeric(4);
		File source_file = (File) ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source_file, new File("images\\screenshot" + random + ".png"));
	}

	/**
	 * Method to connect saucelabs
	 * @param os
	 * @param browser
	 * @throws Exception
	 */
	public void runOnSauceLabsFromLocal(String os, String browser) throws Exception {

		String username = "compriceuser";
		String access_key = "304c87bf-a969-4b94-875f-68717dd22284";
		String url = "https://" + username + ":" + access_key + "@ondemand.saucelabs.com:443/wd/hub";

		DesiredCapabilities caps = null;

		if (os.equalsIgnoreCase("Windows")) {

			if (browser.equalsIgnoreCase("Chrome")) {
				caps = DesiredCapabilities.chrome();
				caps.setCapability("platform", "Windows 10");
				caps.setCapability("version", "80.0");
				caps.setCapability("name", "MySauceTest");
			}

			if (browser.equalsIgnoreCase("FF")) {
				caps = DesiredCapabilities.firefox();
				caps.setCapability("platform", "Windows 7");
				caps.setCapability("version", "74.0");
				caps.setCapability("name", this.getClass().getSimpleName());
			}

			if (browser.equalsIgnoreCase("IE")) {
				caps = DesiredCapabilities.internetExplorer();
				caps.setCapability("platform", "Windows 8.1");
				caps.setCapability("version", "11.0");
				caps.setCapability("name", this.getClass().getSimpleName());
			}

		}

		if (os.equalsIgnoreCase("Mac")) {

			if (browser.equalsIgnoreCase("Chrome")) {

				caps = DesiredCapabilities.chrome();
				caps.setCapability("platform", "OS X 10.11");
				caps.setCapability("version", "48.0");
				caps.setCapability("name", this.getClass().getSimpleName());
			}

			if (browser.equalsIgnoreCase("FF")) {

				caps = DesiredCapabilities.firefox();
				caps.setCapability("platform", "OS X 10.11");
				caps.setCapability("version", "44.0");
				caps.setCapability("name", this.getClass().getSimpleName());
			}

			if (browser.equalsIgnoreCase("Safari")) {

				caps = DesiredCapabilities.safari();
				caps.setCapability("platform", "OS X 10.11");
				caps.setCapability("version", "9.0");
				caps.setCapability("name", this.getClass().getSimpleName());
			}
		}

		if (os.equalsIgnoreCase("iOS")) {

			caps = DesiredCapabilities.iphone();
			caps.setCapability("platform", "OS X 10.10");
			caps.setCapability("version", "9.2");
			caps.setCapability("deviceName", "iPhone 6");
			caps.setCapability("deviceOrientation", "portrait");
			caps.setCapability("name", this.getClass().getSimpleName());
		}

		if (os.equalsIgnoreCase("Android")) {

			caps = DesiredCapabilities.android();
			caps.setCapability("platform", "Linux");
			caps.setCapability("version", "5.1");
			caps.setCapability("deviceName", "Android Emulator");
			caps.setCapability("deviceType", "phone");
			caps.setCapability("deviceOrientation", "portrait");
			caps.setCapability("name", this.getClass().getSimpleName());
		}

		driver = new RemoteWebDriver(new URL(url), caps);

	}

}
