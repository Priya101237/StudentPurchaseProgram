package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import driverinstance.driverinst;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends driverinst {
	
	
	
	@Before
	public void Launch_Browser()
	{
		driver = new ChromeDriver();
		driver.get("https://zepp.studentpurchaseprogram.com/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	
	/*
	@After 
	
	public void Quite_Browser() {
		driver.close();
		
		
}
*/

}