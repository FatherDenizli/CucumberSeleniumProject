@Add_review_on_product
Feature: Add review on product

  Scenario:   Test Case 21

    Given User is on automation page
    Then User clicks on 'Products' button to see products
    Then Verify user is navigated to ALL PRODUCTS page successfully
    Then User clicks on View Product button to review
    Then Verify Write Your Review is visible on Product review
    Then User enters name, email and review on review Input Box
    Then User  clicks 'Submit' button
    Then Verify success message 'Thank you for your review.' is seen


