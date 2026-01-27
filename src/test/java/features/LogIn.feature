 Feature: LogIn Functionality


   Scenario: Validate that user is unable to LogIn when using invalid password or username.
     Given User navigates to Login page.
     When User enters an invalid email.
     And User enters an invalid password.
     And User clicks on the Login button.
     Then User should see an error message.
     And User Should remain on the Login page.






