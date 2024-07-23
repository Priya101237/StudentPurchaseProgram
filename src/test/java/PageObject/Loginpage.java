package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverinstance.driverinst;

public class Loginpage  {


	@FindBy(xpath="//*[text()='Institute Email ID (Recommended)']") 
	public static WebElement Institute_EmailId_RadioBox;
	
	@FindBy(xpath="//*[@id='home_email']")
	public static WebElement Institute_EmailId;
	
	@FindBy(xpath="//button[text()=' Send Login Link']") 
	public static WebElement SendLoginLinkButton;
	
	@FindBy(xpath=("//div[text()='Your domain is not registered with the SPP program. Please contact spp@zrpl.co.in for more information.']"))  
	public static WebElement InstituteIdMessage;
	
	@FindBy(xpath=("//p[text()='Mobile Number (One time registration required)']"))  
	public static WebElement MobileNumber_RadioBox;
	
	@FindBy(xpath="//input[@id='mobile_number']") 
	public static WebElement MobileNumber;
	
	@FindBy(xpath=" //button[@id='send_mobile_login_link']") 
	public static WebElement SendOTP_Mobile;
	
	@FindBy(xpath="//p[text()='Provide the OTP received on Mobile']") 
	public static WebElement MobileNumberOTPMessage;
	
	@FindBy(xpath=" //p[text()='Personal Email ID (Additional verification required)']") 
	public static WebElement PersonalId_RadioBox;
	
	@FindBy(xpath="//input[@id='home_email']") 
	public static WebElement PersonalEmailId;

	@FindBy(xpath="//button[@id='send_login_link']") 
	public static WebElement personalidSendOTP;
	
	@FindBy(xpath="//p[text()='Provide the OTP received on email']") 
	public static WebElement personalidOTPMessage;
	
	
	WebDriver driver;	

	public void LoginPage(WebDriver driver) 
    {
        this.driver=driver;
        PageFactory.initElements( driver, this);
    }

	

	
	
	
	

	}


