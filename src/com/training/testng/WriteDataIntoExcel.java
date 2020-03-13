package com.training.testng;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

/**
 * Class to create excel sheet and write the data 
 * @author Chinna.Putha
 *
 */
public class WriteDataIntoExcel {

	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;

	@Test
	public void writeData() throws Exception {
		workbook = new XSSFWorkbook();

		// Create a blank sheet
		sheet = workbook.createSheet("Employee1");
		row = sheet.createRow(0);
		row.createCell(0).setCellValue("Employee Name");
		row.createCell(1).setCellValue("Salary");
		
		row = sheet.createRow(1);
		row.createCell(0).setCellValue("Chinna1");
		row.createCell(1).setCellValue("70001");

		try {
			// this Writes the workbook test.xlsx
			FileOutputStream out = new FileOutputStream(new File("xlsx//emp2.xlsx"));
			workbook.write(out);
			out.close();
			workbook.close();
			System.out.println("Excel sheet has been created successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
