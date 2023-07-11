@Login_before_checkout
Feature: Place Order: Login before Checkout

  Scenario:   Test Case 16


    Given User is on automation page
    Then Verify that home page is visible successfully

    Then User clicks 'Signup / Login' button to to start registtartion

#    Then User fills email, password and click 'Login' button
    Then User Enters correct email address and password
    Then user clicks 'login' button
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
   Then Verify 'ACCOUNT DELETED!' and click 'Continue' button





