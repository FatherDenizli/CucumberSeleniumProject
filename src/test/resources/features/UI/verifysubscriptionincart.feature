@Verify_subscription_in_cart
Feature: Verify Subscription in Cart page

  Scenario:   Test Case 11


    Given User is on automation page
    Then Verify that home page is visible successfully
    Then User clicks 'Cart'  button
    Then User Scrolls down to footer
    Then  Verify text 'SUBSCRIPTION'
    Then User enters email address in input and click arrow button
    Then Verify success message  'You have been successfully subscribed!' is visible

