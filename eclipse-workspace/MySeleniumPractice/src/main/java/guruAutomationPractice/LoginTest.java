package guruAutomationPractice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver();
		driver.get(" http://demo.guru99.com/v4/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println(driver.getCurrentUrl());
		
//		driver.findElement(By.xpath("//input[contains(@name,'emailid')]")).sendKeys("bhargavi.bubby5@gmail.com");
//		driver.findElement(By.name("btnLogin")).click();
		
		
		//sign in 
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr590686");
		driver.findElement(By.xpath("//input[contains(@name, 'password')]")).sendKeys("sArenYs");
		driver.findElement(By.name("btnLogin")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
