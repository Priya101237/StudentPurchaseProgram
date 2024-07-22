package StepDefinition;

import org.openqa.selenium.support.PageFactory;

import PageObject.Loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step extends Hooks{

	@Given("Launch the Studentpurchase Webpage")
	public void launch_the_studentpurchase_webpage() {
		
		
	}

	@When("the user to check institute emailid shows as a default")
	public void the_user_to_check_institute_emailid_shows_as_a_default() {
		Loginpage.Institute_EmailId_RadioBox.isEnabled();
	   	}

	@When("the user enters the emailid")
	public void the_user_enters_the_emailid() {
		PageFactory.initElements(driver,Loginpage.class);
		Loginpage.Institute_EmailId.sendKeys("abcd@gmail.com");
		
	}

	@And("the user click SendLoginLink button")
	public void the_user_click_send_login_link_button() {
		Loginpage.SendLoginLinkButton.click();
	   
	}

	@Then("the user should validate the Message")
	public void the_user_should_validate_the_message() {
	    
	}

	@When("the user clicks MobileNumberRadio box")
	public void the_user_clicks_mobile_number_radio_box() {
	    Loginpage.MobileNumber_RadioBox.click();
	}

	@When("enters the Mobile Number")
	public void enters_the_mobile_number() {
		Loginpage.MobileNumber.sendKeys("9865230041");
	   
	}

	@When("the user click SendOTP button")
	public void the_user_click_send_otp_button() {
		Loginpage.SendOTP_Mobile.click();
	    
	}

	@Then("the user should validate OTP Received in Mobile")
	public void the_user_should_validate_otp_received_in_mobile() {
	   
	}

	@When("the user clicks the PersonalEmailid box")
	public void the_user_clicks_the_personal_emailid_box() {
	   Loginpage.PersonalId_RadioBox.click();
	}

	@When("enters the PersonalEmailid")
	public void enters_the_personal_emailid() {
	   Loginpage.PersonalEmailId.sendKeys("priyatest1012@gmail.com");
	}
 
	
	@And("the user click SendOTP button")
	public void the_user_click_sendOTP_button() {
		Loginpage.personalidSendOTP.click();
	   
	}

	@Then("the user should validate the OTP Received in Email")
	public void the_user_should_validate_the_otp_received_in_email() {
	   
	}
	
	
		
		}

