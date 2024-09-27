package com.DataDrivenFramework;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.testng.GuruUtil;

@Listeners(ListenerClass.class)
public class GuruLoginFailTest extends LoginBase{

	
	@BeforeTest
	public void setUp() {
		init();
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testdata = GuruUtil.getDataFromExcel();
		return testdata.iterator();
		}
	
		
	
	@Test (dataProvider ="getTestData")
	public void GuruBankLoginPageTest(String Username, String Password,String ExpectedOutput)	  
	      	  
			{
		init();
		driver.findElement(By.xpath("//input[@name='uid']")).clear();
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(Username);
		
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
		
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
			
		System.out.println(ExpectedOutput);
		boolean b = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).isDisplayed();
		System.out.println(b);
		Assert.assertEquals(false, true);
		
			}
	
	@Test
	public void failedCapture() {
		Assert.assertEquals("http://demo.guru99.com/v4/", "https://demo.guru99.com/v4/manager/Managerhomepage.php");
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	
	
	}
}
