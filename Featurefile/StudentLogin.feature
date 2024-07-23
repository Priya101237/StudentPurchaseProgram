Feature: Student purchase Login Functionality

  Background: Launch the Studentpurchase Webpage

  Scenario: To Validate the Institute EmailId login Functionality
   # Given Launch the Studentpurchase Webpage
    When the user to check institute emailid shows as a default
    And the user enters the institute emailid
    And the user clicks sendloginlink button
    Then the user should validate the Message

  Scenario: To Validating the Mobile Number login Functionality
    When the user clicks mobile number option
    And the user enters valid mobile number
    And the user clicks SendOTP mobile button
    Then the user should validate mobile OTP to Received

  Scenario: To Validate the Personal EmailId login Functionality
    When the user clicks personal emailid option
    And the user enters valid personal emailid
    And the user clicks sendOTP email button
    Then the user should validate the OTP Received in email address
