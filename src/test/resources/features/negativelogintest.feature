@Negative_Login_Test

Feature: Negative Login Test

  Scenario: Negative Login Test Case

    Given User is on automation page


    Then Verify that home page is visible successfully
    Then User clicks on 'Signup / Login' button
    Then Verify 'Login to your account' is visible
    Then Enter incorrect email address and password
    Then user clicks 'login' button
    Then Verify error 'Your email or password is incorrect!' is visible


