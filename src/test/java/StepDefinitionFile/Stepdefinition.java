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

public class Step extends driverinst{

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
		 WebElement strvalue = driver.findElement(By.xpath(" //*[@id=\"register-validate-detail\"]/div[5]/div/div[2]/div/div/div "));
	        String expected = "Your domain is not registered with the SPP program. Please contact spp@zrpl.co.in for more information";
	        String actual = strvalue.getText();
	        System.out.println(actual);

	    if(expected.equals(actual)){
	        System.out.println("Pass");
	    }
	        else {
	            System.out.println("Fail");
	        }
	    
		}
        
		

		@When("the user clicks mobile number option")
		public void theUserClicksMobileNumberOption() {
			Loginpage.MobileNumber_RadioBox.click();
		}
		   
		@And("the user enters valid mobile number")
		public void theUserEntersValidMobileNumber() {
			Loginpage.MobileNumber.sendKeys("9865230041");
		}
 
		@And("the user clicks SendOTP mobile button")
		public void theUserClicksSendOTPMobileButton() {
		   Loginpage.SendOTP_Mobile.click();
		}

		@Then("the user should validate mobile OTP to Received")
		public void theUserShouldValidateMobileOTPToReceived() {
			
		    
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
			
			/*
			
			 boolean strvalue = driver.findElement(By.xpath("//*[@id=\"otp_form\"]/section/div/div[2]/p")).isEnabled();
		        String expected = "Provide the OTP received on email";
		        String actual;
		        System.out.println(actual);

		    if(expected.equals(actual)){
		        System.out.println("Pass");
		    }
		        else {
		            System.out.println("Fail");
		        }
		        
		        */
		    
			}
		
		}
		