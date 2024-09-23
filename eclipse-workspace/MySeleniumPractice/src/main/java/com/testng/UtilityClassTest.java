package com.testng;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class UtilityClassTest {
	
	
	@DataProvider(name ="GuruLoginTestData")
	public Object[][] exceldataprovider(){
		Object[][] object = getExcelData("C:\\Users\\Bubby\\eclipse-workspace\\MySeleniumPractice\\src\\main\\java\\com\\testng\\GuruLoginTestData.xlsx", "TestData");
		return object;
	}
	
	public String[][] getExcelData(String filename, String Sheetname){
		String [][]data = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet(Sheetname);
			XSSFRow row = sheet.getRow(0);
			
			int noOfRows = sheet.getPhysicalNumberOfRows();
			int noOfColumns = row.getLastCellNum();
			Cell cell;
			
			data = new String[noOfRows-1][noOfColumns-1];
			
			for(int i=1; i< noOfRows; i++) {
				for( int j=0; j< noOfColumns; j++) {
					row = sheet.getRow(i);
					cell = row.getCell(j);
					
					data[i-1][j] = cell.getStringCellValue();
				}
					
			}
			
		}catch (Exception e) {
			System.out.println("Test exception is: " + e.getMessage());
		}
		return data;
	}
	
	
	
	
}
