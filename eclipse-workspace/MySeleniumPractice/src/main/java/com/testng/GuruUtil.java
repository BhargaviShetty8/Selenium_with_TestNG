package com.testng;

import java.util.ArrayList;

import MySeleniumPractice.Xls_Reader;
public class GuruUtil {

	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel(){
		ArrayList<Object[]> myData = new ArrayList <Object[]>();
		try {
			reader = new Xls_Reader("C:\\Users\\Bubby\\eclipse-workspace\\MySeleniumPractice\\src\\main\\java\\com\\DataDrivenFramework\\GuruLoginTestData.xlsx");
			
			//Xls_Reader reader = new Xls_Reader("/MySeleniumPractice/src/main/java/com/DataDrivenFramework/GuruLoginTestData.xlsx");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		for (int rowNum = 2; rowNum<=reader.getRowCount("TestData"); rowNum++) {
			String Username = reader.getCellData("TestData", "Username", rowNum);
			String Password = reader.getCellData("TestData", "Password", rowNum);
			
			Object ob[] = {Username, Password};
			myData.add(ob);
						
					
			
		}
		return myData;
	}
	
}
