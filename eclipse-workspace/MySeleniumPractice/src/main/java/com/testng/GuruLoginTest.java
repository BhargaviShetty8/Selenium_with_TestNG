package com.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GuruLoginTest {

	WebDriver driver;
	
	@BeforeMethod
	@Parameters("https://demo.guru99.com/v4/")
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getCurrentUrl());
	}
	
		
	
	@Test (dataProvider = "GuruLoginTestData" , dataProviderClass = UtilityClassTest.class)
	public void guruLoginPageTest(String Username, String Password) {
		
		driver.findElement(By.xpath("//input[@name='uid']")).clear();
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(Username);
		
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
		
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		WebElement verifyOutput = driver.findElement(By.name("heading3"));
		Assert.assertTrue(verifyOutput.isDisplayed(), "Invalid UserId or Password is Entered");
				
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
