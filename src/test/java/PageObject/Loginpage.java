package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	 WebDriver driver;
	
	@FindBy(xpath="//input[@class='dont_have active']") 
	public static WebElement Institute_EmailId_RadioBox;
	
	@FindBy(xpath="//input[@id='home_email']")
	public static WebElement Institute_EmailId;
	
	@FindBy(id="send_login_link") 
	public static WebElement SendLoginLinkButton;
	
	@FindBy(xpath="//input[@class='dont_have active']") 
	public static WebElement MobileNumber_RadioBox;
	
	@FindBy(xpath="//input[@id='mobile_number']") 
	public static WebElement MobileNumber;
	
	@FindBy(id="send_mobile_login_link") 
	public static WebElement SendOTP_Mobile;
	
	@FindBy(xpath="//input[@class='dont_have active']") 
	public static WebElement PersonalId_RadioBox;
	
	@FindBy(xpath="//input[@id='home_email']") 
	public static WebElement PersonalEmailId;

	@FindBy(xpath="//button[@id='send_login_link']") 
	public static WebElement personalidSendOTP;

	
	
	

	}


