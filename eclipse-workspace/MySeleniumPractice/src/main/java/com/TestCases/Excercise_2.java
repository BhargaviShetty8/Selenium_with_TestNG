package com.TestCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excercise_2 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("http://live.techpanda.org/index.php/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Home page";
		
		if (ActualTitle.equals(ExpectedTitle)) {
			System.out.println("Verfied");
		}else {
			System.out.println("Not verified");
		}
		driver.findElement(By.xpath("//a[@class = 'level0 ']")).click();
		
		System.out.println(driver.getCurrentUrl());
		List<WebElement> Elements = driver.findElements(By.tagName("a"));
		for (int i=0;i<Elements.size();i++) {
			String names=Elements.get(i).getText();
			System.out.println(names);
		}
		
		Select select = new Select(driver.findElement(By.xpath("//select[@title= 'Sort By']")));
		select.selectByVisibleText("Name");
		String[] ExpectedNames = {"IPhone", "Samsung Galaxy", "Sony Xperia"};
		List<WebElement> MobileNames = driver.findElements(By.tagName("ul"));
		for (int i=0;i<MobileNames.size();i++) {
			String s = MobileNames.get(i).getText();
			System.out.println(s);
		}
		if(ExpectedNames.equals(MobileNames)) {
			System.out.println("ELements Validated");
			for (int i=0;i<MobileNames.size();i++) {
				String s = MobileNames.get(i).getText();
				System.out.println(s);
			}
		}else
		{
			System.out.println("Not Validated");
		}
		driver.quit();
	}
		
}
