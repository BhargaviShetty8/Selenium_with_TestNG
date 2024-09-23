package testNGpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	@BeforeSuite
	public void setUp(){
		System.out.println("Before Suite----------SetUp properties");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("BeforeTest ----------Launch Browser");
	}
	
	@BeforeClass
	public void login() {
		System.out.println("BeforeClass ----------Login");
	}
	
	@BeforeMethod
	public void getUrl() {
		System.out.println("BeforeMethod----------GetUrl");
	}
	
	@Test (priority=3)
	public void signinButton() {
		System.out.println("Test---------SigninButton");
	}
	
	@Test (priority=1)
	public void googleTitle() {
		System.out.println("Test---------GoogleTitle");
	}
	
	@Test (priority=2)
	public void CheckElementInGoogle() {
		System.out.println("Test---------FoundElementinGoogle");
	}
	
	@AfterMethod
	public void logOut() {
		System.out.println("AfterMethod----------logOut");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("AfterTest----------DeleteAllCookies");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AfterClass----------closeBrowser");
	}
	
	
	
	
}
