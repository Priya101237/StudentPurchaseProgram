Feature: Student purchase Login Functionality

  Scenario: To Validate the login Functionality with institute emailid
    Given Launch the Studentpurchase Webpage
    When the user to check institute emailid shows as a default
    And the user enters the emailid
    And the user click SendLoginLink button
    Then the user should validate the Message

  Scenario: To Validate the login Functionality with MobileNumber
    Given Launch the Studentpurchase Webpage
    When the user clicks MobileNumberRadio box 
    And enters the Mobile Number
    And the user click SendOTP button
    Then the user should validate OTP Received in Mobile

  Scenario: To Validate the login Functionality with Personal Emailid
    Given Launch the Studentpurchase Webpage
    When the user clicks the PersonalEmailid box
    And enters the PersonalEmailid
    And the user click SendOTP button
    Then the user should validate the OTP Received in Email
