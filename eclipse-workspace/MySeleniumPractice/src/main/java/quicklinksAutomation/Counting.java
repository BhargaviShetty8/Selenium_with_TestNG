package quicklinksAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List <WebElement> LinkList = driver.findElements(By.tagName("a"));
		
		System.out.println(LinkList.size());
		
		for(int i=0; i<LinkList.size();i++) {
			
			String Text = LinkList.get(i).getText();
			System.out.println(Text);
			System.out.println("First Element:  " + Text.indexOf(0));

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
