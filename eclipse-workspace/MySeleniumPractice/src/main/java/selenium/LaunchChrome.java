package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bubby\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		
		WebDriver driver =new EdgeDriver();
		
		
		driver.get("https://google.com");
		
		
		
		
	}

}
