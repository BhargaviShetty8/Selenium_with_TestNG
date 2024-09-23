package quicklinksAutomation;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHoverDragAndDrop {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://210.212.223.82:9080/QUICKLINKS/");
		driver.get("https://tgdps.telangana.gov.in/aws.jsp");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		/*driver.findElement(By.xpath("//*[@id=\"ldc\"]")).click();
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("Number of frames: " + frames.size());

		for (WebElement frame : frames) {
		    System.out.println("Frame ID: " + frame.getAttribute("id"));
		    System.out.println("Frame Name: " + frame.getAttribute("name"));
		    
		}
		*/
		/*driver.findElement(By.cssSelector("#WFC > img")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement linkElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Weather Observations")));
		linkElement.click();
		//driver.findElement(By.xpath("a[href='aws.jsp']")).click();
		*/
		/*
		Select select = new Select(driver.findElement(By.name("s2")));
		select.selectByVisibleText("Jangaon");
		*/
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu\"]/li[4]/a"))).build().perform();
		
		action.click(driver.findElement(By.xpath("//*[@id='menu']/li[4]/ul/li[1]/a"))).release().build().perform();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
