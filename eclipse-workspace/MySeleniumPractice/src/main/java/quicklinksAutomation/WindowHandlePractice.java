package quicklinksAutomation;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlePractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://210.212.223.82:9080/QUICKLINKS/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("ldc")).click();
		
		Set<String> Handle = driver.getWindowHandles();
		Iterator<String> it = Handle.iterator();
		
		String ParentWindow = it.next();
		System.out.println("Parent Window: " +ParentWindow);
		
		String ChildWindow = it.next();
		System.out.println("ChildWindow: " +ChildWindow);
		
		driver.switchTo().window(ChildWindow);
		System.out.println("Child Id: " +driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.close();
		
		
		driver.switchTo().window(ParentWindow);
		driver.close();
		
		
		
	}

}
