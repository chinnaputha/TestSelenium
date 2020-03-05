package com.training.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Window handle automation
 *
 */
public class WindowHandleExample extends TestBaseUtil {

	public static void main(String[] args) throws Exception {

		lanuchBrowser("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.linkText("SwitchTo")).click();
		driver.findElement(By.linkText("Windows")).click();

		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		// get the parent window id
		String parent_window_id = driver.getWindowHandle();
		System.out.println("Parent window id-->" + parent_window_id); // abc123

		driver.findElement(By.linkText("Open New Seperate Windows")).click();

		driver.findElement(By.cssSelector("button[onclick='newwindow()']")).click();

		Set<String> tot_windows = driver.getWindowHandles();
		System.out.println("Total windows opened -->" + tot_windows.size());// 2

		for (String tab : tot_windows) {
			System.out.println("windows id-->" + tab);// abc123
															// abc1244
			if(!tab.equals(parent_window_id)){
				driver.switchTo().window(tab);//switch to child window
				driver.findElement(By.linkText("Contact")).click();
				Thread.sleep(4000);
				driver.close();//current window close - child window will be closed
			}
			
		}
		
		driver.switchTo().window(parent_window_id);//switch back to parent window 
		driver.close();//closing the parent window
		
		driver.switchTo().frame(1);

	}

}
