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
			driver.findElement(By.linkText("Alerts")).click();
			Thread.sleep(4000);
			driver.findElement(By.linkText("Alert with Textbox")).click();
			Thread.sleep(4000);
			driver.findElement(By.cssSelector("button[onclick='promptbox()']")).click();
			
			Alert al =driver.switchTo().alert();
			Thread.sleep(4000);
			//al.dismiss();
			//al.getText();
			System.out.println("alert text-->"+al.getText());
			al.sendKeys("Alert example123");//enter the value in Alert textox
			al.dismiss();//cancel the alert
			
		} catch (Exception e) {
			//System.out.println("failed ");
			e.printStackTrace();
		}finally {
			
			driver.close();
		}
		

	}

}
