package testNGpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTest {

	WebDriver driver;
	
	@BeforeMethod
	//@Parameters({"url"})
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/v4/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println(driver.getCurrentUrl());
	}

		
//	@Test (priority=1, groups="Google")
//	public void GoogleTitleTest() {
//		String title = driver.getTitle();
//		System.out.println("GoogleTitleTest: 1 " +title);
//	}
//	
//	@Test (priority=2, groups="Title")
//	public void TitleTest() {
//		boolean b = driver.findElement(By.cssSelector("#site-name > a")).isDisplayed();
//		
//	}
//	
//	@Test (priority=3, groups="Element")
//	public void checkElement() {
//		boolean status = driver.findElement(By.linkText("Guru99 Bank Home Page")).isDisplayed();
//		System.out.println("checkElement:2 " + status);
//		System.out.println("getElement 3" + driver.getTitle());
//	}
	@Test (priority=1, groups="Test")
	public void Test() {
		System.out.println("Test1");
		
	}
	
	@Test (priority=2, groups="Test")
	public void Test2() {
		System.out.println("Test2");
		
	}
	
	@Test (priority=3, groups="Test")
	public void Test3() {
		System.out.println("Test3");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


