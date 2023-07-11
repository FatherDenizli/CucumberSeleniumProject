@Register_before_checkout
Feature: Place Order: Register before Checkout

  Scenario:   Test Case 15


    Given User is on automation page
    Then Verify that home page is visible successfully

    Then User clicks 'Signup / Login' button to to start registtartion
    Then User fills all details in Signup and create account

    Then Verify 'ACCOUNT CREATED!' and click 'Continue' button
    Then  Verify ' Logged in as username' at top
    Then  User adds products to cart
    Then  User click 'Cart' button
     Then Verify that cart page is displayed
    Then User clicks Proceed To Checkout
    Then Verify Address Details and Review Your Order
    Then User  enters description in comment text area and click 'Place Order'
    Then User enters payment details: Name on Card, Card Number, CVC, Expiration date
    Then User clicks 'Pay and Confirm Order' button to complete payment
    Then Verify success message 'Your order has been placed successfully!'
    Then User clicks 'Delete Account' button to delete account
    Then User clicks Continue button to go on









 

