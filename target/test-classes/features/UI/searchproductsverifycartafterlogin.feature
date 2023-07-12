@Search_products_verify_cart_login
Feature: Search Products and Verify Cart After Login

  Scenario:   Test Case 20

    Given User is on automation page
    Then Verify that home page is visible successfully
    Then User clicks on 'Products' button to see products
    Then Verify user is navigated to ALL PRODUCTS page successfully

    Then Verify 'SEARCHED PRODUCT' input box is visible

    Then Verify all the products related to search are visible
    Then User adds those products to cart
    Then User clicks 'Cart' button and verify that products are visible in cart
    Then User Click 'Signup / Login' button and submit login details
    Then User again goes to Cart page
    Then Verify that those products are visible in cart after login as well












