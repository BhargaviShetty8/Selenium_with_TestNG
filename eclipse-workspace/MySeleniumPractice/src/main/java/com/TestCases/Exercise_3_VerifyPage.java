package com.TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise_3_VerifyPage {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get(" http://live.techpanda.org/index.php/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@class = 'level0 ']")).click();
		System.out.println(driver.getTitle());
		Select select = new Select(driver.findElement(By.xpath("//select[@title= 'Sort By']")));
		select.selectByVisibleText("Name");
		System.out.println(driver.getTitle());
		
		driver.quit();
		

	}

}
