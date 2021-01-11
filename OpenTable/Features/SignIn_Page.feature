@tag
Feature: Title of your feature
  I want to use this template for my feature file

Background: Open the web browser
    Given User click on Sign In button


 @tag1
  Scenario: Validating Account for login with invalid credentials
    When User click on Email field
    And User Click on Password field
    And User enter valid password
    And User click on Sign In1 
    Then User verify the error message 1
    When User click on Email field
    And User Enter invalid Email 
    And User Click on Password field
    And User enter valid password
    And User click on Sign In1 
    Then User verify the error message 2
    When User click on Email field
    And User Enter valid but not registered Email 
    And User Click on Password field
    And User enter valid password
    And User click on Sign In1 
    Then User verify the error message 2
    When User click on Email field
    And User Enter valid and registered Email
    And User Click on Password field
    And User click on Sign In1 
    Then User verify the error message 3
    When User click on Email field
    And User Enter valid and registered Email
    And User Click on Password field
    And User enters password greater than 40 characters
    And User click on Sign In1 
    Then User verify the error message 2
    When User click on Email field
    And User Enter valid and registered Email
    And User Click on Password field
    And User enters invalid password 
    And User click on Sign In1 
    Then User verify the error message 2
    
  @tag2
  Scenario: Validating Account for login with valid credentials
    
    When User click on Email field
    And User Enter valid and registered Email
    And User Click on Password field
    And User enter valid password
    And User click on Sign In1
    Then User navigates to Account page
    @tag3
  Scenario: Validating Forgot Password button
    
    When User click on Forgot password
    Then User navigates to retrieve password page
     @tag4
  Scenario: Validating other functionalities
    
    When User click on Continue with booking
    Then User navigates to booking webpage
    When User click on Continue with facebook
    Then User navigates to facebook webpage
    When User click on Continue with Google
    Then User navigates to Google webpage
    When User click on Create New Account
    Then User navigates to Sign Up page
    When User click on Terms of Service
    Then User navigates to Terms of Service webpage
    When User click on Privacy Policy
    Then User navigates to Privacy Policy webpage
    