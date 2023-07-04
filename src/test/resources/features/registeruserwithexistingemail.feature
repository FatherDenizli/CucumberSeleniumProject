@emailexisting
Feature:Register With Existing email Test

  Scenario:  Test Case 5


    Given User is on automation page
    Then User verifies that home page is visible successfully
    Then  User clicks on 'Signup / Login' button
    Then User verifies 'New User Signup!' is visible
    Then User Enters name and already registered email address
    Then User clicks 'Signup' button
    Then Verify that error 'Email Address already exist!' is visible












