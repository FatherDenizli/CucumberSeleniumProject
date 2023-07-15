@Verify_address_details
Feature: Verify address details in checkout page

  Scenario:   Test Case 23


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

    Then Verify that the delivery address is same address filled at the time registration of account
    Then Verify that the billing address is same address filled at the time registration of account
     Then User clicks 'Delete Account' button to delete account
    Then Verify ACCOUNT DELETED! and click Continue button to go on










