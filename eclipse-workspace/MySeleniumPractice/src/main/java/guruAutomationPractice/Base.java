package guruAutomationPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver driver;
	public static void init() {
		driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/v4/");
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr590686");
		driver.findElement(By.xpath("//input[contains(@name, 'password')]")).sendKeys("sArenYs");
		driver.findElement(By.name("btnLogin")).click();
		driver.quit();
	}
	
	public void failed(String string){
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	try {
		FileUtils.copyFile(scrFile, new File ("C:\\Users\\Bubby\\eclipse-workspace\\MySeleniumPractice\\" +"Screenshots\\failshot.jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
	
	
}
