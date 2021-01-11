
Feature: Table Booking
  This feauture deals with booking the table in restaurant using OpenTable Web application.
  
Scenario: Successful table booking after Signing in.
Given User has navigated to the website
And User has signed in to the website. 
When User selects the date
And User selects the time
And User enters the loation,restaurant or cuisine
And User clicks on Find a table button
Then Available tables should be displayed to User.
And User selects the time slot from available restaurant.
And User clicks on Complete the Reservation button.
Then Table is Booked.


Scenario: Successful search for table in restaurant without Signing in.
Given User has navigated to the website
When User selects the date
And User selects the time
And User enters the loation,restaurant or cuisine
And User clicks on Find a table button
Then Available tables should be displayed to User.
And User selects the time slot from available restaurant.
And User enters the first name
And User enters the last name
And User enters the phone number
And User enters the Email
And User clicks on Complete the Resesrvation button
Then Table is booked.
