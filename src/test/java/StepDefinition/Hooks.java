package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks {
	
	 public static WebDriver driver;
		@BeforeMethod
		public void Launch_Browser()
		{
			driver = new ChromeDriver();
			driver.get("https://zepp.studentpurchaseprogram.com/");
			driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}
		
		
		@AfterMethod 
		
		public void Quite_Browser() {
			
			driver.close();
			
		} 
}

