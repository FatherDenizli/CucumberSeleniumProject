@Verify_subscription
Feature: Verify Subscription in home page

  Scenario: Verify Subscription in home page Test Case 10


    Given User is on automation page
    Then Verify that home page is visible successfully
    Then User Scrolls down to footer
    Then  Verify text 'SUBSCRIPTION'
    Then User enters email address in input and click arrow button
    Then Verify success message  'You have been successfully subscribed!' is visible



