package com.training.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.training.selenium.TestBaseUtil;

/**
 * Class to perform file upload operations using AutoIT
 * @author Chinna.Putha
 *
 */
public class AutoITExample extends TestBaseUtil {

	@Test
	public void fileUpload() throws Exception {
		lanuchBrowser("http://www.tinyupload.com/");

		WebElement ele = driver.findElement(By.xpath("//input[@name='uploaded_file']"));

		Actions act = new Actions(driver);
		act.click(ele).build().perform();

		Thread.sleep(4000);
		Runtime.getRuntime().exec("autoit\\fileupload.exe");

	}

}
