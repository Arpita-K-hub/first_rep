Feature: OpenTable Details of restaurant 

Background:
		Given Launch the application browser
    And Open the webpage of Open Table
    And verify title of homepage 
		
    
Scenario: Verify details of restaurant
    When user clicks on Sign in button
    And Enter valid email and password 
    And clicks on dropdown for location 
    And choose location
    And choose restaurant
    Then click on Menu
    And click on view full menu
    And click on Photos
    And view photo
    And come back to restaurant page
    And click on Reviews
    And print the current ratting
    And go to FAQ
    And Click on location link
    And come back to open table
    And check parking details
    And check contact number
    And check website of restaurant