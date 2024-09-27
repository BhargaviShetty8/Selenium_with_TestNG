package com.TestCases;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Exercise_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https:amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		System.out.println(list.size());
		
		for(int i = 0; i<list.size();i++) {
			String listNames = list.get(i).getText();
			System.out.println(listNames);
		}
		
		driver.quit();
		
	}

}
