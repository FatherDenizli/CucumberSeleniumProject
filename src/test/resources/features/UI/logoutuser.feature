@Logoutuser
Feature: Logout User

  Scenario:   Test Case 4


    Given User is on automation page
    Then Verify that home page is visible successfully
    Then User clicks on 'Signup / Login' button
    Then Verify 'Login to your account' is visible
    Then User Enters correct email address and password
    Then user clicks 'login' button
    Then Verify that 'Logged in as username' is visible
    Then Clicks 'Logout' button
    Then Verify 'Login to your account' is visible