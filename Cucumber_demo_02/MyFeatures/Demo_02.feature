Feature: My standard chartered bank account

Background: Launching of the band landing page
    Given Srinivas has done with browser configuration
    Then He launches the application in the chrome browser

Scenario: Sign In for the registered user
    Given He clicks on signin link
    Then He enters the valid credentials
    And He clicks on submit button
    

Scenario: SignUp for guest user
    Given Guest user clicks on signup link
    When He provides mandatory data
    Then He clicks on submit button and id is generated
    

Scenario: Srinivas wanted to reset his password
    Given He clicks on forget password link
    Then He enters the mobile number
    And He provides the otp
    Then he is able to reset the password