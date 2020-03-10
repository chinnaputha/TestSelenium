package com.training.testng;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class POIExample2 {
	
	@Test
	public void readData() throws Exception{ 
		File file;
		FileInputStream fis = null;
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
			
			System.out.println("Cell 1 value -->"+cell1.toString());
			System.out.println("Cell 2 value -->"+cell2.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("POIExample2.readData()");
			fis.close();
		}
		
		
		
		
		
	}

}
