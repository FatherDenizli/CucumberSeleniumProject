@contact_us_form
Feature: Contact Us Form

  Scenario:   Test Case 6


    Given User is on automation page
    Then Verify that home page is visible successfully
    Then User clicks on 'Contact Us' form button
    Then Verify 'GET IN TOUCH' is visible in contact page
    Then User Enters  name, email, subject and message
    Then user Uploads file
    Then User clicks 'Submit' button to upload file
    Then User clicks OK button
    Then Verify success message 'Success! Your details have been submitted successfully.' is visible
    Then  Users Click 'Home' button and verify that landed to home page successfully
















