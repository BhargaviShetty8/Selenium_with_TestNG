package com.TestCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Excercise_4_CompareProducts {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://live.techpanda.org/index.php/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[@class = 'level0 ']")).click();
		Select select = new Select(driver.findElement(By.xpath("//select[@title= 'Sort By']")));
		select.selectByVisibleText("Name");
		List <WebElement> elements = driver.findElements(By.tagName("ul"));
		for(int i=0;i<elements.size();i++) {
			String s = elements.get(i).getText();
			System.out.println(s);
		}
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement CostofXP1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("product-price-1")));
		String XP1 = CostofXP1.getText();
		
		driver.findElement(By.id("product-collection-image-1")).click();
		
		WebElement CostofXP2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("price")));
		
		String XP2 = CostofXP2.getText();
		
		if(XP1.equals(XP2)) {
			System.out.println("Equally matched");
			System.out.println("Value1: " +XP1);
			System.out.println("Value2: " +XP2);
		}else {
			System.out.println("Not matched");
			System.out.println("Value1: " +XP1);
			System.out.println("Value2: " +XP2);
		}
		
		
		
		
		
		
		
		
		

	}

}
