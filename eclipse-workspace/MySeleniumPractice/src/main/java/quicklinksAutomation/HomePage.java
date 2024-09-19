package quicklinksAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("http://210.212.223.82:9080/QUICKLINKS/");
		
		driver.findElement(By.xpath("//*[@id=\"ldc\"]")).click();
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("Number of frames: " + frames.size());

		for (WebElement frame : frames) {
		    System.out.println("Frame ID: " + frame.getAttribute("id"));
		    System.out.println("Frame Name: " + frame.getAttribute("name"));
		}
		
			
			
		
		/*//Amazon signin
		
		driver.get("http:amazon.in");
				
		driver.findElement(By.xpath("//div[@class = 'nav-line-1-container']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("bvbhargavi.bubby@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		
			*/
		
//		
//		driver.findElement(By.cssSelector("#username")).sendKeys("JGN");
//		driver.findElement(By.cssSelector("#pwd")).sendKeys("npdcl");
//		driver.findElement(By.xpath("//*[@id=\"loginTable\"]/tbody/tr[4]/td/input")).click();
		
		////*[@id="username"] 
		
//		//ATS //*[@id="ap_email"]
//		
//		driver.findElement(By.xpath("//*[@id=\"ats\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("NP2104AETECH");
//		
			
		
		
		
	}

}
