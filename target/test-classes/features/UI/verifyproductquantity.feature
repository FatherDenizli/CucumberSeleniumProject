@add-products_in_cart
Feature: Add Products in Cart

  Scenario:   Test Case 12

    Given User is on automation page
    Then Verify that home page is visible successfully
    Then User clicks on 'Products' button to see products
    Then User hovers over first product and click 'Add to cart'
    Then User clicks 'Continue Shopping' button to continue
    Then User hovers over second product and click 'Add to cart'
    Then User click 'View Cart' button
    Then Verify both products are added to Cart
    Then Verify their prices, quantity and total price




