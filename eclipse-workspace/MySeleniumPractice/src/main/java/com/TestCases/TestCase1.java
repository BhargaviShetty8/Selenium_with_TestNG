package com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase1 {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
		
		driver.findElement(By.linkText("Create yur Amazon account")).click();
		driver.findElement(By.xpath("//input[contains(@id = 'ap_customer_name')]")).sendKeys("Bhargavi Shetty");
		
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"auth-country-picker\"]")));
		select.selectByVisibleText("IN +91");
		
		
//		driver.findElement(By.xpath("//input[contains(@class = 'a-button-text a-declarative')]")).click();
//		driver.findElement(By.xpath("//*[@id=\"auth-country-picker-container\"]/span/span/span"))
		
		
		
		
		
		
		
		
		
		
		

	}

}
