@Add_to_cart_from_Recommended_items
Feature: Add to cart from Recommended items

  Scenario:   Test Case 22

    Given User is on automation page
    Then User scrolls to bottom of page
    Then Verify 'RECOMMENDED ITEMS' are visible
    Then Click on Add To Cart on Recommended product
    Then User clicks on View Cart button to see products in Cart
    Then Verify that  product from recommended is displayed in cart page

