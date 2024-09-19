package quicklinksAutomation;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseHoverDragAndDrop {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("http://210.212.223.82:9080/QUICKLINKS/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//*[@id=\"ldc\"]")).click();
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("Number of frames: " + frames.size());

		for (WebElement frame : frames) {
		    System.out.println("Frame ID: " + frame.getAttribute("id"));
		    System.out.println("Frame Name: " + frame.getAttribute("name"));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
