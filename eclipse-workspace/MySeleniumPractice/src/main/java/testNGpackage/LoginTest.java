package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {

	
	WebDriver driver;
		
	@Test
	@Parameters({"browser","url","uid", "password"})
	public void LoginPage(@Optional("FireFox") String browser, String url, String uid, String pwd) {
		
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
			}else if(browser.equals("FireFox")) {
			driver = new FirefoxDriver();
			}			
		
		driver.get(url);
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(uid);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
