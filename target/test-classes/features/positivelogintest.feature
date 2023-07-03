 @Positive_Login_Test
  Feature: Login User with correct email and password

    Scenario:   Test Case 2


      Given User is on automation page
      Then Verify that home page is visible successfully
      Then User clicks on 'Signup / Login' button
      Then Verify 'Login to your account' is visible
      Then User Enters correct email address and password
      Then user clicks 'login' button
      Then Verify that 'Logged in as username' is visible
      Then User clicks 'Delete Account' button to delete account
      Then Verify that 'ACCOUNT DELETED!' should be visible visible


