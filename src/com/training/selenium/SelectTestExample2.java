package com.training.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
/**
 * Select example to validate selected dropdown value
 * get list of options from dropdown and validate
 * @author Chinna.Putha
 *
 */
public class SelectTestExample2 extends TestBaseUtil {

	public static void main(String[] args) throws Exception {
		lanuchBrowser("http://demo.automationtesting.in/Register.html");
		WebElement  ele = driver.findElement(By.cssSelector("select[id='Skills']"));
		Select ses = new Select(ele);
		
		//select using visible text
		ses.selectByVisibleText("Android");
		Thread.sleep(2000);
		
		WebElement selectedValue = ses.getFirstSelectedOption();
		System.out.println("Selected dropdown value-->"+selectedValue.getText());//Android
		
		
		//using TestNG
		//Assert.assertTrue(selectedValue.getText().equals("APIs"), "Drodown value notselected accuratly");
		
		
		//validate the selected dropdown value/text
		if(!selectedValue.getText().equals("Android")){
			//throw new Exception("dropdown value validation failed");
			System.out.println("Drodown value selected accuratly");
		}
		
		
		//get list of options
		List<WebElement> allOptions=ses.getOptions();
		System.out.println("Total opitons size-->"+allOptions.size());//78
		
		List<String> al = new ArrayList<String>();
		
		//using for loop printing all dropdown values
		/*for(int i=0;i<allOptions.size();i++){
			//System.out.println("Dropdown option text/value-->"+allOptions.get(i).getText());
			al.add(allOptions.get(i).getText());
		}
		*/
		
		//for each loop
		int count = 0;
		for(WebElement opton:allOptions){
			count++;
			System.out.println("using for each loop"+count);
			al.add(opton.getText());
		}
		
		
		System.out.println("new list dropdown valuess-->"+al.size());//78
		//System.out.println("All values of dropdown-->"+al); //all 78 values text dispalying [Select Skill, Android...]
		
		
		boolean isValueAvailable = al.contains("Microsoft Office");
		System.out.println("is value available -->"+isValueAvailable);//true
		
		isValueAvailable = al.contains("asdgasdgasdfg");
		System.out.println("is value available -->"+isValueAvailable);//false
		
		
		Thread.sleep(4000);
		
		closeBrowser();
		
	}

}
