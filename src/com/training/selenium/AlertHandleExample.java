package com.training.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Frame handle automation
 *
 */
public class AlertHandleExample extends TestBaseUtil {

	public static void main(String[] args) {

		try {
			lanuchBrowser("http://demo.automationtesting.in/Register.html");
			driver.findElement(By.linkText("SwitchTo")).click();
			driver.findElement(By.linkText("Frames")).click();
			Thread.sleep(4000);
			//driver.switchTo().frame(0);//using index position
			//driver.switchTo().frame("singleframe"); //using name or id of iframe tag
			WebElement frameElement =driver.findElement(By.xpath("//iframe[@id='singleframe']"));
			driver.switchTo().frame(frameElement);//using frame WebElement
				driver.switchTo().frame("");
					driver.switchTo().frame("");
					
			driver.switchTo().defaultContent();//jump to first iframe
			driver.findElement(By.cssSelector("div.container input[type='text']")).sendKeys("dfasdf");
			Thread.sleep(4000);
		} catch (Exception e) {
			//System.out.println("failed ");
			e.printStackTrace();
		}finally {
			Alert al =driver.switchTo().alert();
			al.accept();
			al.dismiss();
			al.getText();
			al.sendKeys("");
			driver.close();
		}
		

	}

}
