@Registration  @smoke
Feature:Registration User

 Scenario:  Test Case 116
   Given User is on automation page
   Then User verifies that home page is visible successfully
   Then  User clicks on 'Signup / Login' button
   Then User verifies 'New User Signup!' is visible
   Then User enters name and email address
   Then User clicks 'Signup' button
    Then User verifies that 'ENTER ACCOUNT INFORMATION' is visible

   Then User fills details: Title, Name, Email, Password, Date of birth
   Then User selects checkbox1 'Sign up for our newsletter!'
   Then User selects checkbox2 'Receive special offers from our partners!'
   Then User fills details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
   Then User clicks 'Create Account button'




