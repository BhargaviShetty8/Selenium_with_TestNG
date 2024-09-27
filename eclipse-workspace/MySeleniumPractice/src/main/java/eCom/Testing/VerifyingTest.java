package eCom.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyingTest {

	@BeforeTest
	public void setUp() {
		
	}
	
	@AfterTest
	public void tearDown() {
		
	}
	
	
	@Test
	public void verifyElement() {
		WebDriver driver = null;
		driver.get("http://live.techpanda.org/index.php/");
		driver.findElement(By.className("level0 ")).click();
		driver.findElement(By.className("level0 ")).isDisplayed();
		
		Select select = new Select(driver.findElement(By.xpath("//select[contains(@title = 'SortBy')]")));
		select.selectByVisibleText("Name");
		
		//driver.findElements("http://live.techpanda.org/index.php/mobile.html?dir=asc&order=position");
		
	}
	
	
	
}
