package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PageObject.Loginpage;
import driverinstance.driverinst;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends driverinst{

	//WebDriver driver;
	
	@Given("the user to check institute emailid shows as a default")
		public void theUserToCheckInstituteEmailidShowsAsADefault() {
			
			PageFactory.initElements(driver,Loginpage.class);
			Boolean box = Loginpage.Institute_EmailId_RadioBox.isEnabled();
			System.out.println("Default select Emailid option:"+box);
		}

	 @And("the user enters the institute emailid")
	 public void theUserEntersTheInstituteEmailid() {
        Loginpage.Institute_EmailId.sendKeys("abcd@gmail.com");
		}

	
	 @When("the user clicks sendloginlink button")
	 public void theUserClicksSendloginlinkButton() {
	     Loginpage.SendLoginLinkButton.click();
		}

		@Then("the user should validate the Message")
		public void theUserShouldValidateTheMessage()  {
			
			String InstituteIDMessage =Loginpage.InstituteIdMessage.getText();
			System.out.println("The Given text is:"+InstituteIDMessage);

		}
        
		@When("the user clicks mobile number option")
		public void theUserClicksMobileNumberOption() {
			Loginpage.MobileNumber_RadioBox.click();
		}
		   
		@And("the user enters valid mobile number")
		public void theUserEntersValidMobileNumber() {
			Loginpage.MobileNumber.sendKeys("6383824918");
		}
 
		@And("the user clicks SendOTP mobile button")
		public void theUserClicksSendOTPMobileButton() {
		   Loginpage.SendOTP_Mobile.click();
		}

		@Then("the user should validate mobile OTP to Received")
		public void theUserShouldValidateMobileOTPToReceived() {
			
			String MobileOTPMessage =Loginpage.MobileNumberOTPMessage.getText();
			System.out.println("The Given text is:"+MobileOTPMessage);
			
			
		    
		}

		@When("the user clicks personal emailid option")
		public void theUserClicksPersonalEmailidOption() {
			Loginpage.PersonalId_RadioBox.click();
		}

		@And("the user enters valid personal emailid")
		public void theUserEntersValidPersonalEmailid() {
			   Loginpage.PersonalEmailId.sendKeys("priyasram373@gmail.com");	
		}

		@When("the user clicks sendOTP email button")
		public void theUserClicksSendOTPEmailButton() {
	
			Loginpage.personalidSendOTP.click();
		}

		@Then("the user should validate the OTP Received in email address")
		public void theUserShouldValidateTheOTPReceivedInEmailAddress() {
			
			String OTPperosnalMail =Loginpage.personalidOTPMessage.getText();
			System.out.println("The Given text is:"+OTPperosnalMail);
			
			
		    
			}
		
		}
		