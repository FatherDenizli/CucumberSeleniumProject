@contact_us_form
Feature: Contact Us Form

  Scenario: Contact Us Form Test Case


    Given User is on automation page
    Then Verify that home page is visible successfully
    Then User clicks on 'Contact Us' form button
    Then Verify 'GET IN TOUCH' is visible in contact page
    Then User Enters  name, email, subject and message
    Then user Uploads file
    Then User clicks 'Submit' button
    Then User clicks OK button
    Then Verify success message 'Success! Your details have been submitted successfully.' is visible
    Then  Users Click 'Home' button and verify that landed to home page successfully


#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
#
#  4. Click on 'Contact Us' button
#  5. Verify 'GET IN TOUCH' is visible
#  6. Enter name, email, subject and message
#  7. Upload file
#  8. Click 'Submit' button
#  9. Click OK button
#  10. Verify success message 'Success! Your details have been submitted successfully.' is visible
#  11. Click 'Home' button and verify that landed to home page successfully
#
#













