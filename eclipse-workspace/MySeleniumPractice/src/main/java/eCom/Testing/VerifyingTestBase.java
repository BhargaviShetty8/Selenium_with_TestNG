package eCom.Testing;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class VerifyingTestBase {
	 
	
	public static void main (String args[]) {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://live.techpanda.org/index.php/");
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//a[contains(@Class, 'level0 ')]")).click();
		//driver.findElement(By.className("level0 ")).isDisplayed();
		System.out.println(driver.getCurrentUrl());
		
		Select select = new Select(driver.findElement(By.xpath("//select[contains(@title,'Sort By')]")));
		select.selectByVisibleText("Name");
		
		List <WebElement> LinkList = driver.findElements(By.tagName("a"));
		
		System.out.println(LinkList.size());
		
		for(int i=0; i<LinkList.size();i++) {
			
			String Text = LinkList.get(i).getText();
			System.out.println(Text);
			//System.out.println("First Element:  " + Text.indexOf(0));
		
	}
	}
}
