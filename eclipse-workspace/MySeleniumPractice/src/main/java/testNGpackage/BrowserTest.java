package testNGpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserTest {

	 @Test
	    @Parameters({"browser", "url"})
	    public void loginTest(@Optional("firefox") String browser, String url) {
	        WebDriver driver;

	        if(browser.equalsIgnoreCase("firefox")) {
	            
	            driver = new FirefoxDriver();
	        } else {
	            // You can extend this for other browsers like Chrome
	            throw new IllegalArgumentException("Unsupported browser: " + browser);
	        }

	        // Perform test actions
	        driver.get(url);
	        System.out.println("Running test on browser: " + browser);
	        
	        driver.quit();  // Make sure to close the browser at the end
	    }
	}
	

