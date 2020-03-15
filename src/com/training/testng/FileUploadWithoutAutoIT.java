package com.training.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.training.selenium.TestBaseUtil;

/**
 * Class to perform file upload operations using without AutoIT
 * Note: if input type = file, we can upload file without AutoIT and using sendkeys method
 * @author Chinna.Putha
 *
 */
public class FileUploadWithoutAutoIT extends TestBaseUtil {

	@Test
	public void fileUpload() throws Exception {
		lanuchBrowser("http://www.tinyupload.com/");

		WebElement ele = driver.findElement(By.xpath("//input[@name='uploaded_file']"));

		/*Actions act = new Actions(driver);
		act.click(ele).build().perform();*/

		
		ele.sendKeys("C:/Users/Chinna.Putha/Downloads/scanner_20191013_201234.jpg");
		
		Thread.sleep(4000);

	}

}
