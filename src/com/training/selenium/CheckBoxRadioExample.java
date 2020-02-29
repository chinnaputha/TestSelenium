package com.training.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxRadioExample extends TestBaseUtil {

	public static void main(String[] args) {
		lanuchBrowser("http://demo.automationtesting.in/Register.html");

		// get radio buttons
		List<WebElement> allRadioButtos = driver.findElements(By.cssSelector("input[name='radiooptions']"));
		System.out.println("Total Radio buttons-->" + allRadioButtos.size()); // 2

		// to print all radio buttons text/name
		/*
		 * for(int i=0;i<allRadioButtos.size();i++){ System.out.println(
		 * "Radio text-->"+allRadioButtos.get(i).getTagName()); }
		 */

		boolean isRadioButtonDisplayed = allRadioButtos.get(0).isDisplayed();
		System.out.println("isRadioButtonDisplayed-->" + isRadioButtonDisplayed); // true

		boolean isRadioButtonEnabled = allRadioButtos.get(0).isEnabled();
		System.out.println("isRadioButtonEnabled-->" + isRadioButtonEnabled); // true

		boolean isRadioButtonSelected = allRadioButtos.get(0).isSelected();
		System.out.println("isRadioButtonSelected before select-->" + isRadioButtonSelected); // false

		//if radio button not selected i need to click
		/*if (isRadioButtonSelected) {
			System.out.println("radio button not selected");
		} else {
			allRadioButtos.get(0).click();
		}*/
		
		if(!isRadioButtonSelected){
			allRadioButtos.get(0).click();
		}

		isRadioButtonSelected = allRadioButtos.get(0).isSelected();
		System.out.println("isRadioButtonSelected after select-->" + isRadioButtonSelected); // true

	}

}
