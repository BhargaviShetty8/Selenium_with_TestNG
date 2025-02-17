package com.DataDrivenFramework;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import com.testng.GuruUtil;

public class GuruLoginPageTest {

	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get(" http://demo.guru99.com/v4/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println(driver.getCurrentUrl());
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testdata = GuruUtil.getDataFromExcel();
		return testdata.iterator();
		}
	
	@Test (dataProvider ="getTestData")
	public void GuruBankLoginPageTest(String Username, String Password,String ExpectedOutput)	  
	      	  
			{
		driver.findElement(By.xpath("//input[@name='uid']")).clear();
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(Username);
		
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
		
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
			
		System.out.println(ExpectedOutput);
		boolean b = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).isDisplayed();
		System.out.println(b);
		
		//WebElement verifyOutput = driver.findElement(By.name("heading3"));
		//Assert.assertTrue(verifyOutput.isDisplayed(), "Invalid UserId or Password is Entered");
		//System.out.println(driver.getCurrentUrl());
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
