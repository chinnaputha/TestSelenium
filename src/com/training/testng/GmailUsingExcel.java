package com.training.testng;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * Read the data from Excel sheet and supply to test script
 * @author Chinna.Putha
 *
 */ 
public class GmailUsingExcel {
	WebDriver driver;
	File file;
	FileInputStream fis = null;
	
	@Test
	public void loginToGmail() throws Exception{
		String username = null;
		String password=null;
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		// FirefoxDriver implements WebDriver
		 driver = new ChromeDriver();
		// get method - open the browser
		driver.get("https://www.gmail.com/");
		// maximize the window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
		try {
			//file location
			 file = new File("xlsx\\loginDetails.xlsx");
			//read the data from file
			fis = new FileInputStream(file);
			
			//convert file into workbook
			XSSFWorkbook wb = new XSSFWorkbook(file);
			//move to particular sheet
			XSSFSheet sheet = wb.getSheet("Gmail");
			
			//Move to Row from the sheet
			XSSFRow  row =sheet.getRow(1);
			//Move to Cell from the Row
			XSSFCell cell1 = row.getCell(0);
			XSSFCell cell2 = row.getCell(1);
			
			 username=cell1.toString();
			 password=cell2.toString();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("POIExample2.readData()");
			fis.close();
		}
		
		System.out.println("Cell 1 value -->"+username);
		System.out.println("Cell 2 value -->"+password);
		
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys(username);
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-label='Enter your password']")));
		
		driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys(password);
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		
	}

}
